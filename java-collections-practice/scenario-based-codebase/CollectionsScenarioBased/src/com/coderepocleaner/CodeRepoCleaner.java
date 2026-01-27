package com.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class CodeRepoCleaner {

    private static final Pattern BAD_METHOD_PATTERN =
            Pattern.compile("\\b[A-Z][a-zA-Z0-9]*\\(");

    private static final Pattern IMPORT_PATTERN =
            Pattern.compile("import\\s+([\\w\\.]+);");

    public static void main(String[] args) throws IOException {

        Path root = Paths.get("codebase");

        List<Path> javaFiles = Files.walk(root)
                .filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());

        Map<FileType, List<File>> categorizedFiles =
                new EnumMap<>(FileType.class);

        for (FileType type : FileType.values()) {
            categorizedFiles.put(type, new ArrayList<>());
        }

        for (Path path : javaFiles) {
            File file = path.toFile();
            analyzeFile(file, categorizedFiles);
        }

        displaySummary(categorizedFiles);

        // Stream-based filtering example
        System.out.println("\nLarge Files (>10KB):");
        javaFiles.stream()
                .map(Path::toFile)
                .filter(f -> f.length() > 10_000)
                .forEach(f -> System.out.println(f.getName()));
    }

    private static void analyzeFile(
            File file,
            Map<FileType, List<File>> map) {

        boolean hasBadMethod = false;
        boolean hasUnusedImport = false;

        Set<String> imports = new HashSet<>();
        Set<String> usedClasses = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {

                // Detect bad method names
                if (BAD_METHOD_PATTERN.matcher(line).find()) {
                    hasBadMethod = true;
                }

                // Collect imports
                Matcher importMatcher =
                        IMPORT_PATTERN.matcher(line);
                if (importMatcher.find()) {
                    imports.add(importMatcher.group(1));
                }

                // Rough usage detection
                usedClasses.addAll(Arrays.asList(line.split("\\W+")));
            }

            for (String imp : imports) {
                String className =
                        imp.substring(imp.lastIndexOf('.') + 1);
                if (!usedClasses.contains(className)) {
                    hasUnusedImport = true;
                    break;
                }
            }

            if (!hasBadMethod && !hasUnusedImport) {
                map.get(FileType.VALID).add(file);
            } else if (hasBadMethod && hasUnusedImport) {
                map.get(FileType.ERROR).add(file);
            } else {
                map.get(FileType.WARNING).add(file);
            }

        } catch (IOException e) {
            map.get(FileType.ERROR).add(file);
        }
    }

    private static void displaySummary(
            Map<FileType, List<File>> map) {

        System.out.println("\nCode Repository Summary:");
        map.forEach((type, files) ->
                System.out.println(type + " → " + files.size() + " files"));
    }
}

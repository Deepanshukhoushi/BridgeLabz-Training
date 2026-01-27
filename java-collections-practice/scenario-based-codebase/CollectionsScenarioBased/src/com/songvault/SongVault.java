package com.songvault;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class SongVault {

    private static final Pattern FIELD_PATTERN =
            Pattern.compile("(Title|Artist|Duration|Genre):\\s*(.*)");

    public static void main(String[] args) {

        File folder = new File("songs");
        List<Song> songList = new ArrayList<>();

        for (File file : folder.listFiles()) {
            if (!file.getName().endsWith(".txt")) continue;

            try {
                songList.add(readSong(file));
            } catch (Exception e) {
                System.out.println("Skipping invalid file: " + file.getName());
            }
        }

        // Group by genre
        Map<String, List<Song>> songsByGenre =
                songList.stream()
                        .collect(Collectors.groupingBy(Song::getGenre));

        // Unique artists
        Set<String> uniqueArtists =
                songList.stream()
                        .map(Song::getArtist)
                        .collect(Collectors.toSet());

        // Filter & sort example
        List<Song> sortedRockSongs =
                songList.stream()
                        .filter(s -> s.getGenre().equalsIgnoreCase("Rock"))
                        .sorted(Comparator.comparing(Song::getTitle))
                        .toList();

        displayResults(songsByGenre, uniqueArtists, sortedRockSongs);
    }

    private static Song readSong(File file) throws IOException {

        String title = null, artist = null, duration = null, genre = null;

        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = FIELD_PATTERN.matcher(line);
                if (matcher.matches()) {
                    switch (matcher.group(1)) {
                        case "Title" -> title = matcher.group(2);
                        case "Artist" -> artist = matcher.group(2);
                        case "Duration" -> duration = matcher.group(2);
                        case "Genre" -> genre = matcher.group(2);
                    }
                }
            }
        }

        if (title == null || artist == null || genre == null) {
            throw new IllegalArgumentException("Missing fields");
        }

        return new Song(title, artist, duration, genre);
    }

    private static void displayResults(
            Map<String, List<Song>> genreMap,
            Set<String> artists,
            List<Song> filteredSongs) {

        System.out.println("\nSongs Grouped by Genre:");
        genreMap.forEach((genre, songs) -> {
            System.out.println("\n" + genre + ":");
            songs.forEach(System.out::println);
        });

        System.out.println("\nUnique Artists:");
        artists.forEach(System.out::println);

        System.out.println("\nSorted Rock Songs:");
        filteredSongs.forEach(System.out::println);
    }
}

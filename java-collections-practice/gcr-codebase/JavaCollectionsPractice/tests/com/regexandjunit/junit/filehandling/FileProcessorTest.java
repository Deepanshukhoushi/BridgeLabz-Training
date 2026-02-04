package com.regexandjunit.junit.filehandling;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class FileProcessorTest {

    @TempDir
    Path tempDir;

    private final FileProcessor fileProcessor = new FileProcessor();

    @Test
    void testWriteAndReadFile() throws IOException {
        Path filePath = tempDir.resolve("test.txt");
        String content = "Hello JUnit File Testing";

        fileProcessor.writeToFile(filePath.toString(), content);
        String result = fileProcessor.readFromFile(filePath.toString());

        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        Path filePath = tempDir.resolve("exists.txt");

        fileProcessor.writeToFile(filePath.toString(), "Some content");

        assertTrue(Files.exists(filePath));
    }

    @Test
    void testReadFromNonExistingFileThrowsException() {
        Path filePath = tempDir.resolve("missing.txt");

        assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile(filePath.toString());
        });
    }
}

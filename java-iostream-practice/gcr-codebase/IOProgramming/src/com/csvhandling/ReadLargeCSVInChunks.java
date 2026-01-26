package com.csvhandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeCSVInChunks {
    private static final int BATCH_SIZE = 100;
    public static void main(String[] args) {

        String fileName = "large_file.csv";
        int totalRecords = 0;
        int batchCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName), 1024 * 1024)) {
            
            @SuppressWarnings("unused")
			String line;

            br.readLine();

            while ((line = br.readLine()) != null) {

                totalRecords++;
                batchCount++;

                if (batchCount == BATCH_SIZE) {
                    System.out.println("Processed records: " + totalRecords);
                    batchCount = 0; 
                }
            }

            if (batchCount > 0) {
                System.out.println("Processed records: " + totalRecords);
            }

            System.out.println("Finished processing file.");
            System.out.println("Total records processed: " + totalRecords);

        } catch (IOException e) {
            System.out.println("Error reading large CSV file.");
        }
    }
}

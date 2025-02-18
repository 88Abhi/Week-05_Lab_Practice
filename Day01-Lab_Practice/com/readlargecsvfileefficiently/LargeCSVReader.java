package com.readlargecsvfileefficiently;

import java.io.*;

// Define the class responsible for efficiently reading large CSV files
public class LargeCSVReader {
	public static void main(String[] args) {
		// Specify the file path of the large CSV file
		String filePath = "students.csv";
		int chunkSize = 100;
		int recordCount = 0;

		// Initialize BufferedReader to read the CSV file
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			br.readLine();
			String line;

			// Read the file line by line
			while ((line = br.readLine()) != null) {
				recordCount++;
				System.out.println(line);

				// If the chunk size is reached, display progress and pause processing
				if (recordCount % chunkSize == 0) {
					System.out.println("Processed " + recordCount + " records so far...");
				}
			}
		}
		catch (IOException e) {
			// Handle any IOExceptions that may occur during file reading
			e.printStackTrace();
		}

		// Print the final count of records processed
		System.out.println("Total records processed: " + recordCount);
	}
}

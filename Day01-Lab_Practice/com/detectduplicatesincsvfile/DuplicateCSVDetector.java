package com.detectduplicatesincsvfile;

import java.io.*;
import java.util.*;

// Define the class responsible for detecting duplicate records in a CSV file
public class DuplicateCSVDetector {
	public static void main(String[] args) {
		// Specify the file path of the CSV file
		String filePath = "employees.csv";

		// Create a HashSet to store unique IDs
		Set<String> uniqueIDs = new HashSet<>();

		// Create a list to store duplicate records
		List<String> duplicateRecords = new ArrayList<>();

		// Initialize BufferedReader to read the CSV file
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			// Read and ignore the first line (header)
			String header = br.readLine();
			System.out.println("Header: " + header);
			String line;

			// Read the file line by line
			while ((line = br.readLine()) != null) {
				// Split the line into individual fields
				String[] fields = line.split(",");
				String id = fields[0];

				// Check if the ID is already in the HashSet
				if (!uniqueIDs.add(id)) {
					duplicateRecords.add(line);
				}
			}
		} catch (IOException e) {
			// Handle any IOExceptions that may occur during file reading
			e.printStackTrace();
		}

		// Print all duplicate records found
		if (duplicateRecords.isEmpty()) {
			System.out.println("No duplicate records found.");
		} else {
			System.out.println("Duplicate Records Found:");
			for (String record : duplicateRecords) {
				System.out.println(record);
			}
		}
	}
}

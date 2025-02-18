package com.readandcountrowsincsvfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Define the class to count rows in a CSV file
public class CSVRowCounter {
	public static void main(String[] args) {
		// Specify the path to the CSV file whose rows need to be counted
		String filePath = "students.csv";
		int rowCount = 0;

		// Initialize the BufferedReader to read the file
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			br.readLine();

			// Loop through each line and count the number of data rows
			while ((line = br.readLine()) != null) {
				rowCount++;
			}
			System.out.println("Number of records (excluding header): " + rowCount);
		}
		catch (IOException e) {
			// Handle any IOExceptions that may occur during file reading
			e.printStackTrace();
		}
	}
}

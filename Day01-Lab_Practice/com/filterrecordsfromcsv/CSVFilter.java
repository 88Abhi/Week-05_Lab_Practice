package com.filterrecordsfromcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Define the class responsible for filtering records from a CSV file
public class CSVFilter {
	public static void main(String[] args) {
		// Specify the path to the CSV file to be read
		String filePath = "students.csv";

		// Initialize the BufferedReader to read the file
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			br.readLine();

			// Loop through each line and filter records based on marks
			while ((line = br.readLine()) != null) {
				// Split the line by commas to separate the columns of the CSV
				String[] fields = line.split(",");

				// Convert the marks column (4th field) to an integer
				int marks = Integer.parseInt(fields[3]);

				// Only process and print records where marks are greater than 80
				if (marks > 80) {
					System.out.println("ID: " + fields[0] + ", Name: " + fields[1] + ", Marks: " + fields[2]);
				}
			}
		}
		catch (IOException e) {
			// Handle any IOExceptions that may occur during file reading
			e.printStackTrace();
		}
	}
}

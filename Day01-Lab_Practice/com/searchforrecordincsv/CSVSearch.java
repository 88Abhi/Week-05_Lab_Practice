package com.searchforrecordincsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Define the class to search for a record in a CSV file
public class CSVSearch {
	public static void main(String[] args) {
		// Specify the path to the CSV file containing employee data
		String filePath = "employees.csv";

		// Define the employee name to search for in the records
		String searchName = "A";

		// Initialize the BufferedReader to read the file
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			br.readLine();

			// Loop through each line and search for the given name
			while ((line = br.readLine()) != null) {
				// Split the line by commas to get the individual fields
				String[] fields = line.split(",");

				// Check if the current row contains the name we are searching for
				if (fields[1].equalsIgnoreCase(searchName)) {
					System.out.println("ID: " + fields[0] + ", Name: " + fields[1] + ", Department: " + fields[2] + ", Salary: " + fields[3]);
				}
			}
		}
		catch (IOException e) {
			// Handle any IOExceptions that may occur during file reading
			e.printStackTrace();
		}
	}
}

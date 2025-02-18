package com.readcsvfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Define the class to handle CSV reading
public class CSVReader {
	public static void main(String[] args) {
		// Specify the path to the CSV file to be read
		String filePath = "students.csv";

		// Initialize a BufferedReader to read from the CSV file
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;

			// Loop through the file line by line until the end is reached
			while ((line = br.readLine()) != null) {
				// Split the line by commas to separate the columns in the CSV
				String[] fields = line.split(",");
				System.out.println("ID: " + fields[0] + ", Name: " + fields[1] + ", Age: " + fields[2] + ", Marks: " + fields[3]);
			}
		}
		catch (IOException e) {
			// Print any errors that occur during the file reading process
			e.printStackTrace();
		}
	}
}

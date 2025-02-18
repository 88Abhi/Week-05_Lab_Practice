package com.modifycsvfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Define the class responsible for modifying employee salary in the CSV file
public class CSVSalaryUpdater {
	public static void main(String[] args) {
		// Specify the input file path containing employee data
		String inputFile = "employees.csv";

		// Specify the output file path to store the updated data
		String outputFile = "updated_employees.csv";

		// Create a list to store all employee records
		List<String[]> records = new ArrayList<>();

		// Initialize BufferedReader to read the input file
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			// Read the first line and store it separately
			String header = br.readLine();
			records.add(header.split(","));
			String line;

			// Read the file line by line
			while ((line = br.readLine()) != null) {
				// Split each line into individual fields
				String[] fields = line.split(",");

				// Check if the department is "IT"
				if (fields[2].equalsIgnoreCase("IT")) {
					// Parse the salary, increase it by 10%, and update the field
					double salary = Double.parseDouble(fields[3]);
					salary *= 1.10;
					fields[3] = String.format("%.2f", salary);
				}
				records.add(fields);
			}
		}
		catch (IOException e) {
			// Handle any IOExceptions that occur during file reading
			e.printStackTrace();
		}

		// Write the modified records back to the new CSV file
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
			for (String[] record : records) {
				// Convert the array back to a CSV-formatted line
				bw.write(String.join(",", record));
				bw.newLine();
			}
			System.out.println("Updated salaries saved to: " + outputFile);
		}
		catch (IOException e) {
			// Handle any IOExceptions that occur during file writing
			e.printStackTrace();
		}
	}
}

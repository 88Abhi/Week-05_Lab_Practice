package com.writedatatocsvfile;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

// Define the class responsible for writing CSV data
public class CSVWriterExample {
	public static void main(String[] args) {
		// Specify the path where the CSV file will be created
		String filePath = "employees.csv";

		// Initialize CSVWriter to write to the specified file
		try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
			// Define the header of the CSV file with column names
			String[] header = {"ID", "Name", "Department", "Salary"};

			// Write the header to the CSV file
			writer.writeNext(header);

			// Define employee records and write them to the file
			String[] employee1 = {"1", "A", "HR", "50000"};
			writer.writeNext(employee1);

			String[] employee2 = {"2", "B", "IT", "60000"};
			writer.writeNext(employee2);

			String[] employee3 = {"3", "C", "Finance", "55000"};
			writer.writeNext(employee3);

			String[] employee4 = {"4", "D", "IT", "70000"};
			writer.writeNext(employee4);

			String[] employee5 = {"5", "E", "HR", "48000"};
			writer.writeNext(employee5);
			System.out.println("Data written Successfully");
		}
		catch (IOException e) {
			// Handle any IOExceptions that occur during file writing
			e.printStackTrace();
		}
	}
}

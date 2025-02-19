package com.convertcsvdataintojson;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

// This class converts CSV data into JSON format.
public class CSVToJSONConverter {
	public static void main(String[] args) {
		try {
			// Read CSV file
			List<String> lines = Files.readAllLines(Paths.get("data.csv"));

			// Extract header (first line)
			String[] headers = lines.get(0).split(",");

			// Create a JSON array
			JSONArray jsonArray = new JSONArray();

			// Process each line after the header
			for (int i = 1; i < lines.size(); i++) {
				String[] values = lines.get(i).split(",");
				JSONObject jsonObject = new JSONObject();

				for (int j = 0; j < headers.length; j++) {
					jsonObject.put(headers[j], values[j]);
				}
				jsonArray.put(jsonObject);
			}

			// Write JSON output to a file
			try (FileWriter file = new FileWriter("users.json")) {
				file.write(jsonArray.toString(4));
			}
			System.out.println("CSV converted to JSON successfully!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

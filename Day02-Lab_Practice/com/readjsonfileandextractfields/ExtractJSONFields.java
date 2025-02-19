package com.readjsonfileandextractfields;

import org.json.JSONObject;
import java.nio.file.*;

// This class reads a JSON file and extracts only specific fields
public class ExtractJSONFields {
	public static void main(String[] args) {
		try {
			// Read JSON file content as a string
			String jsonContent = new String(Files.readAllBytes(Paths.get("students.json")));

			// Convert string into JSON object
			JSONObject jsonObject = new JSONObject(jsonContent);

			// Extract and print specific fields
			System.out.println("Name: " + jsonObject.getString("name"));
			System.out.println("Email: " + jsonObject.getString("email"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

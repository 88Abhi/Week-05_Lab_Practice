package com.mergetwojsonfiles;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;

// This class merges two JSON files into a single JSON object.
public class MergeJSONFiles {
	public static void main(String[] args) {
		try {
			// Read JSON files as strings
			String json1 = new String(Files.readAllBytes(Paths.get("file1.json")));
			String json2 = new String(Files.readAllBytes(Paths.get("file2.json")));

			// Convert strings to JSONObjects
			JSONObject jsonObj1 = new JSONObject(json1);
			JSONObject jsonObj2 = new JSONObject(json2);

			// Merge jsonObj2 into jsonObj1
			for (String key : jsonObj2.keySet()) {
				jsonObj1.put(key, jsonObj2.get(key));
			}

			// Write merged JSON to a new file
			try (FileWriter file = new FileWriter("merged.json")) {
				file.write(jsonObj1.toString(4));
			}
			System.out.println("JSON files merged successfully!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

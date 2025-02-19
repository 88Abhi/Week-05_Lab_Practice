package com.convertjsontoxmlformat;

import org.json.JSONObject;
import org.json.XML;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;

// This class converts JSON data to XML format.
public class JSONToXMLConverter {
	public static void main(String[] args) {
		try {
			// Read JSON file
			String jsonContent = new String(Files.readAllBytes(Paths.get("users.json")));

			// Convert JSON string to JSONObject
			JSONObject jsonObject = new JSONObject(jsonContent);

			// Convert JSON to XML
			String xmlData = XML.toString(jsonObject, "root");

			// Write XML to a file
			try (FileWriter file = new FileWriter("data.xml")) {
				file.write(xmlData);
			}
			System.out.println("JSON converted to XML successfully!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}


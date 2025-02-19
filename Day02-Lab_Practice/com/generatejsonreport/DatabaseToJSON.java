package com.generatejsonreport;

import org.json.JSONArray;
import org.json.JSONObject;
import java.sql.*;
import java.io.FileWriter;

// This class retrieves data from a database and converts it into JSON format.
public class DatabaseToJSON {
	public static void main(String[] args) {
		// Database connection parameters
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String user = "root";
		String password = "password";

		try (Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT id, name, age FROM students")) {

			// Create a JSON array to hold the records
			JSONArray jsonArray = new JSONArray();

			while (rs.next()) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("id", rs.getInt("id"));
				jsonObject.put("name", rs.getString("name"));
				jsonObject.put("age", rs.getInt("age"));

				jsonArray.put(jsonObject);
			}

			// Write JSON data to a file
			try (FileWriter file = new FileWriter("students.json")) {
				file.write(jsonArray.toString(4));
			}
			System.out.println("Database records exported to JSON successfully!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

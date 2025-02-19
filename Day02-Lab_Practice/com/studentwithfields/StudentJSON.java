package com.studentwithfields;

import org.json.JSONArray;
import org.json.JSONObject;

// This class demonstrates how to create a JSON object representing a student.
public class StudentJSON {
	public static void main(String[] args) {
		// Create a JSON object to store student data
		JSONObject student = new JSONObject();

		// Add basic details to the JSON object
		student.put("name", "Abhishek");
		student.put("age", 21);

		// Create an array to store subjects
		JSONArray subjects = new JSONArray();
		subjects.put("Mathematics");
		subjects.put("Computer Science");
		subjects.put("Physics");

		// Add the subjects array to the student object
		student.put("subjects", subjects);

		// Print the student JSON object
		System.out.println(student.toString(4));
	}
}


package com.validateemailfieldusingjson;

import org.json.JSONObject;
import java.util.regex.Pattern;

// This class validates an email field in a JSON object using regex instead of JSON Schema.
public class ValidateEmailFieldAlternative {
	public static void main(String[] args) {
		// Define a JSON object with an email field
		String jsonString = "{ \"email\": \"test@example.com\" }";
		JSONObject json = new JSONObject(jsonString);

		// Define a regex pattern for email validation
		String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		Pattern pattern = Pattern.compile(emailPattern);

		// Get email value from JSON
		String email = json.optString("email", "");

		// Validate email using regex
		if (pattern.matcher(email).matches()) {
			System.out.println("Valid email format!");
		}
		else {
			System.out.println("Invalid email format!");
		}
	}
}

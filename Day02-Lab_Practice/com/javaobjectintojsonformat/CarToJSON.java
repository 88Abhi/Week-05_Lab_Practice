package com.javaobjectintojsonformat;

import org.json.JSONObject;

// This class demonstrates converting a Car object into JSON format.
public class CarToJSON {
	public static void main(String[] args) {
		// Create a Car object
		Car car = new Car("Toyota", "Corolla", 2022);

		// Convert the Car object to JSON
		JSONObject carJson = car.toJSON();

		// Print the JSON output
		System.out.println(carJson.toString(4));
	}
}

package com.javaobjectintojsonformat;

import org.json.JSONObject;

// This class represents a Car object
class Car {
	// Instance variable shows details about car
	private String brand;
	private String model;
	private int year;

	// Constructor to initialize a Car object with brand, model, and year.
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	// Converts the Car object into a JSON representation.
	public JSONObject toJSON() {
		JSONObject carJson = new JSONObject();
		carJson.put("brand", this.brand);
		carJson.put("model", this.model);
		carJson.put("year", this.year);
		return carJson;
	}
}


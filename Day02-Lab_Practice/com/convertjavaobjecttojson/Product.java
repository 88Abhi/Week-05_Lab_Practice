package com.convertjavaobjecttojson;

import org.json.JSONObject;

// This class demonstrates converting a list of Java objects into a JSON array.
class Product {
	private String name;
	private double price;

	// Constructor to initialize Product object
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Converts a Product object to JSON format
	public JSONObject toJSON() {
		JSONObject productJson = new JSONObject();
		productJson.put("name", this.name);
		productJson.put("price", this.price);
		return productJson;
	}
}


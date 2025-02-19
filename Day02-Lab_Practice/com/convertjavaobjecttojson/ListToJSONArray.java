package com.convertjavaobjecttojson;

import org.json.JSONArray;
import java.util.ArrayList;
import java.util.List;

public class ListToJSONArray {
	public static void main(String[] args) {
		// Create a list of Product objects
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", 1500.99));
		products.add(new Product("Phone", 799.49));

		// Convert list of products to a JSON array
		JSONArray productArray = new JSONArray();
		for (Product product : products) {
			productArray.put(product.toJSON());
		}

		// Print the JSON array
		System.out.println(productArray.toString(4));
	}
}

package com.mergetwojsonobjects;

import org.json.JSONObject;

// This class demonstrates how to merge two JSON objects into a single JSON object.
public class MergeJSONObjects {
	public static void main(String[] args) {
		// Create first JSON object
		JSONObject json1 = new JSONObject();
		json1.put("name", "Abhishek");
		json1.put("age", 21);

		// Create second JSON object
		JSONObject json2 = new JSONObject();
		json2.put("city", "Bhopal");
		json2.put("country", "India");

		// Merge both JSON objects
		JSONObject mergedJson = new JSONObject(json1, JSONObject.getNames(json1));
		for (String key : JSONObject.getNames(json2)) {
			mergedJson.put(key, json2.get(key));
		}

		// Print the merged JSON object
		System.out.println(mergedJson.toString(4));
	}
}

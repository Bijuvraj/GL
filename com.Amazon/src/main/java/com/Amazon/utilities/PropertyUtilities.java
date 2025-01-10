package com.Amazon.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyUtilities {

	public static Properties properties;
	public static Map<String, String> constants = new HashMap();;

	public PropertyUtilities() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("TestProperties.properties"));
			properties = new Properties();
			properties.load(reader);
		} catch (Exception e) {
			System.out.println("Error in featching properties file");
		}
	}

	public static String getPropertyValue(String property) {

		return properties.getProperty(property);
	}

	public static void setConstant(String key, String value) {
		constants.put(key, value);
	}

	public static String getConstant(String key) {
		return constants.get(key);
	}
}

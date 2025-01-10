package com.Amazon.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class CommonTestDataUtils {


	public static Map<String, Object> data;

	public CommonTestDataUtils() {

		try {
			InputStream inputStream = new FileInputStream(
					new File(System.getProperty("user.dir") + "\\src\\main\\resources\\testdata\\Commondata.yaml"));

			Yaml yaml = new Yaml();
			data = yaml.load(inputStream);
		} catch (FileNotFoundException e) {
			System.out.println("Test data file read error");
		}
	}

	public String getTestData(String key) {

		return data.get(key).toString();
	}

	public synchronized static String getEmployeeId() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String empId = dtf.format(now).replaceAll("[^0-9]", "");
		return empId;
	}

	public void getEmployeeData() {

	}
}

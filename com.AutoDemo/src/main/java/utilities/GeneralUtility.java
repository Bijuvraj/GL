package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

public class GeneralUtility {
	public String get_Attribute(WebElement element, String attribute) {
		return (element.getAttribute(attribute));
	}

	public String getTabTitle(WebDriver driver) {
		return (driver.getTitle());
	}

	public List<String> getTextOfElements(List<WebElement> elements) {
		List<String> data = new ArrayList<String>();
		for (WebElement element : elements) {
			data.add(element.getText());
		}
		return data;
	}

	public String getCssValues(WebElement element, String attribute) {

		return (element.getCssValue(attribute));
	}

	public static String getRandomFirstName() {
		Faker faker = new Faker();
		return faker.name().firstName();
	}

	public static String getRandomNumber() {
		Faker faker = new Faker();
		return faker.number().digit();
	}

}

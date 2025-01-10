package pages;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;

public class LoginPage {
	public WebDriver driver;
	Properties properties = new Properties();

	@FindBy(xpath = "//input[@placeholder='User Name']")
	private WebElement userNameField;
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordField;
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//label [@for='chk1']") 
	private WebElement remindMeCheckBox;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

		try {
			FileInputStream fi = new FileInputStream(Constants.CONFIG_FILE_PATH);
			properties.load(fi);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyTheUserLogin() {
		userNameField.sendKeys("demoadmin");
		passwordField.sendKeys("admin123");
		loginButton.click();
	}
}

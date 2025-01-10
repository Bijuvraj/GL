package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class HomePage {
	GeneralUtility generalUtility;
	PageUtility pageUtility;
	WaitUtility waitUtility;
	public WebDriver driver;

	@FindBy(xpath = "//span[contains(text(),'GREAT LEAP Technologies')]")
	private WebElement profileName;
	
	@FindBy(xpath= "//i[@class='fa fa-user-plus']")
	private WebElement empManagementTab;
	
	@FindBy(xpath = "//a[@class='sidebar-toggle']")
	private WebElement menuItemExpandBtn;
	
	@FindBy(xpath = "//a[@data-url='/Employee']")
	private WebElement addEmployeeTab;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTheProfileName() {
		return profileName.getText();
	}
	public void clickOnMenuItemExpandBtn() {
		menuItemExpandBtn.click();
	}
	
	public void clickOnempmanagementTab() {
		empManagementTab.click();
	}
	
	public void clickOnAddEmployeeTab() {
		waitUtility.waitForClickable(driver, addEmployeeTab, 10);
		addEmployeeTab.click();
	}
}

package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AutoDemo.base.Base;

import pages.AddEmployeePage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends Base {
	LoginPage loginPage;
	HomePage homePage;
	AddEmployeePage addEmployeePage;
	
	@Test
	public void vrifyLogin() {
		loginPage= new LoginPage(driver);
		homePage = new HomePage(driver);
		loginPage.verifyTheUserLogin();
		homePage.verifyTheProfileName();
		String expectedProfileName ="GREAT LEAP Technologies";
		String actualProfileName= homePage.verifyTheProfileName();
		System.out.println("Profile Name: "+homePage.verifyTheProfileName());
		Assert.assertEquals(actualProfileName, expectedProfileName);
	}
	
	@Test
	public void clickEmpManagement() {
		vrifyLogin();
		homePage.clickOnMenuItemExpandBtn();
		homePage.clickOnempmanagementTab();
		homePage.clickOnAddEmployeeTab();
		addEmployeePage= new AddEmployeePage(driver);
		addEmployeePage.personalDetails();
		
	}
}

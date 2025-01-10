package pages;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class AddEmployeePage {
	public WebDriver driver;
	Properties properties = new Properties();
	GeneralUtility generalUtility = new GeneralUtility();
	PageUtility pageUtility = new PageUtility(driver);
	WaitUtility waitUtility = new WaitUtility(driver);
	
	@FindBy (xpath = "//span[contains(text(),'New')]")
	private WebElement AddNewEmployee;
	
	@FindBy (xpath = "//input[@id='first_name']")
	private WebElement enterFirstName;
	
	@FindBy (xpath = "//input[@id='address']")
	private WebElement enterEmpAddress;
	
	@FindBy (xpath = "//span[@id='select2-classification-container']")
	private WebElement clickEmpGender;
	
	@FindBy (xpath = "//select[@id='classification']")
	private WebElement selectGender;
	
	@FindBy (xpath = "//input[@id='date_of_birth']")
	private WebElement enterEmpDOB;
	
	@FindBy (xpath = "//input[@id='pincode']")
	private WebElement enterZIPCode;
	
	@FindBy (xpath = "//input[@id='mobile_no']")
	private WebElement enterMobileNo;
	
	@FindBy (xpath = "//input[@id='city']")
	private WebElement enterEmpCity;
	
	@FindBy (xpath = "//input[@id='state']")
	private WebElement enterEmpState;
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement enterEmpEmail;
	
	@FindBy (xpath = "//select[@id='maritual_status']")
	private WebElement selectMartialStatus;
	
	@FindBy (xpath = "//select[@id='education']")
	private WebElement addEmpEducation;
	
	@FindBy (xpath = "//input[@id='guardian']")
	private WebElement adEmpGuardian;
	
	@FindBy (xpath = "//select[@id='relationship']")
	private WebElement selectguardianRelation;
	
	@FindBy (xpath = "//input[@id='account_no']")
	private WebElement enterBankAccNO;
	
	@FindBy (xpath = "//input[@id='branch_name']")
	private WebElement addBankBranch;
	
	@FindBy (xpath = "//select[@id='bank_name']")
	private WebElement selectEmpBankName;
	
	@FindBy (xpath = "//input[@id='ifsc_code']")
	private WebElement enterEmpBankIFSC;
	
	@FindBy (xpath = "//input[@id='pan_no']")
	private WebElement enterEmpPanNo;
	
	@FindBy (xpath = "//input[@id='id_card']")
	private WebElement enterEmpAdhaarNo;
	
	@FindBy (xpath = "//input[@id='esi']")
	private WebElement enterEmpESINo;
	
	@FindBy (xpath = "//input[@id='esi_dispensary']")
	private WebElement enterEmpESIDispensary;
	
	@FindBy (xpath = "//input[@id='company_pf']")
	private WebElement enterEmpPfNo;
	
	@FindBy (xpath = "//input[@id='pf']")
	private WebElement enterEmpUANno;
	
	@FindBy (xpath = "//input[@id='previous_member_id']")
	private WebElement enterEmpPreviousId;
	
	@FindBy (xpath = "//input[@id='international_worker']")
	private WebElement addInterNationalWorker;
	
	@FindBy (xpath = "//input[@id='physical_handicap']")
	private WebElement enterEmpPhysicalHandicap;
	
	@FindBy (xpath = "//select[@id='country']")
	private WebElement selectEmpCountryOfOrigin;
	
	@FindBy (xpath = "//input[@id='locomotive']")
	private WebElement enterEmpPhysicalHandicapLocomotive;
	
	@FindBy (xpath = "//input[@id='hearing']")
	private WebElement enterPhysicalHandicapHearing;
	
	@FindBy (xpath = "//input[@id='visual']")
	private WebElement enterEmpPhysicalHandicapVisual;
	
	@FindBy (xpath = "//input[@id='joining_date']")
	private WebElement enterEmpDOJ;
	
	@FindBy (xpath = "//input[@id='emp_company_id']")
	private WebElement enterEmpNewID;
	
	@FindBy (xpath = "//select[@id='emp_type']")
	private WebElement selectEmpType;
	
	@FindBy (xpath = "//select[@id='notice_days']")
	private WebElement selectEmpNoticePeriod;
	
	@FindBy (xpath = "//select[@id='emp_dept']")
	private WebElement selectEmpDepartment;
	
	@FindBy (xpath = "//select[@id='designation']")
	private WebElement selectEmpdDesignation;
	
	@FindBy (xpath = "//select[@id='emp_grade']")
	private WebElement selectEmpGrade;
	
	@FindBy (xpath = "//select[@id='emp_branch']")
	private WebElement selectEmpBranch;
	
	@FindBy (xpath = "//input[@id='attr2']")
	private WebElement enterEmpProbationPeriod;
	
	@FindBy (xpath = "//input[@id='blood']")
	private WebElement enterEmpBloodGroup;
	
	@FindBy (xpath = "//label[text()='Blood Group']")
	private WebElement bloodGroupLabel;
	
	@FindBy (xpath = "//div[@class='datepicker-days']/table/tbody/tr/td[@class='active day']")
	private WebElement selectCalenderActiveDay;
	
	@FindBy (xpath = "//li[@id='config']/a")
	private WebElement empConfigTab;
	
	@FindBy (xpath = "//li[@id='family']/a")
	private WebElement empFamilyTab;
	
	@FindBy (xpath = "//select[@id='shift']")
	private WebElement selectEmpShiftingTime;
	
	@FindBy (xpath = "//select[@id='holidays']")
	private WebElement selectHolidayCalander;
	
	@FindBy (xpath = "//select[@id='leave']")
	private WebElement selectEmpLeavePolicy;
	
	@FindBy (xpath = "//input[@id='annual_gross']")
	private WebElement enterAnualSalary;
	
	@FindBy (xpath = "//input[@name='hierarch1']")
	private WebElement enterEmpSuperior;
	
	@FindBy (xpath = "//select[@id='salary']")
	private WebElement selectSalaryStructure;
	
	@FindBy (xpath = "//div[@class='easy-autocomplete']/div[@id='eac-container-hierarch']")
	private WebElement addEmpSupervisorSuggestion;
	
	@FindBy (xpath = "//button[contains(text(),'Save & Next')]")
	private WebElement EmpSave_NextBtn;
	
	@FindBy (xpath = "//button[contains(text(),'Next')]")
	private WebElement addEmpNextBtn;
	
	@FindBy (xpath = "//div[@id='div-empqualification']/div/div//button[@title='Add Items']")
	private WebElement empQualificationBtn;
	
	@FindBy (xpath = "//input[@id='course']")
	private WebElement empQualificationAddCourse;
	
	@FindBy (xpath = "//input[@id='university']")
	private WebElement addUniversity;
	
	@FindBy (xpath = "//input[@id='duration']")
	private WebElement qualifycationDuration;
	
	@FindBy (xpath = "//input[@id='mark']")
	private WebElement empQualificationMark;
	
	@FindBy (xpath = "//button[text()='Save']")
	private WebElement empQualificationSaveBTn;
	
	@FindBy (xpath = "//table[@id='example1']")
	private WebElement empQualificationTable;
	
	@FindBy (xpath = "//table[@id='example1']//tbody/tr/td[1]")
	private WebElement empQualificationTableName;
	
	@FindBy (xpath = "//table[@id='example1']//tbody/tr/td[2]")
	private WebElement empQualificationTableUniversity;
	
	@FindBy (xpath = "//table[@id='example1']//tbody/tr/td[3]")
	private WebElement empQualificationTableDuration;
	
	@FindBy (xpath = "//table[@id='example1']//tbody/tr/td[4]")
	private WebElement empQualificationTablePercentage;
	
	@FindBy (xpath = "//div[@id='div-emphistorical']/div/div//button[@title='Add Items']")
	private WebElement empExperienceAddBtn;
	
	@FindBy (xpath = "//input[@id='company']")
	private WebElement empExperienceAddCompany;
	
	@FindBy (xpath = "//input[@id='department']")
	private WebElement empExperienceAddDepartment;
	
	@FindBy (xpath = "//input[@id='designation']")
	private WebElement empExperienceAddDesignation;
	
	@FindBy (xpath = "//input[@id='from_date']")
	private WebElement empExperienceFromDate;
	
	@FindBy (xpath = "//input[@id='to_date']")
	private WebElement addEmpExperienceToDate;
	
	@FindBy (xpath = "//input[@id='salary']")
	private WebElement addEmpExpeeienceSalary;
	
	@FindBy (xpath = "//button[text()='Save']")
	private WebElement empExperienceSaveBTn;
	
	@FindBy (xpath = "//table[@id='example']")
	private WebElement empExperienceTable;
	
	@FindBy (xpath = "//div[@id='div-empsetupfamily']/div/div//button[@title='Add Items']")
	private WebElement empFamlyMemberAddBtn;
	
	@FindBy (xpath = "//input[@id='name']")
	private WebElement empfamilymemberAddName;
	
	@FindBy (xpath = "//input[@id='dob']")
	private WebElement empfamlyMemberAddDOB;
	
	@FindBy (xpath = "//select[@id='relation']")
	private WebElement empFamilyMemberAddRelation;
	
	@FindBy (xpath = "//input[@id='age']")
	private WebElement empFamilyMemberAddAge;
	
	@FindBy (xpath = "//input[@id='blood_group']")
	private WebElement empFamilyMemberAddBloodGroup;
	
	@FindBy (xpath = "//select[@id='gender']")
	private WebElement empFamilyMemberSelectGender;
	
	@FindBy (xpath = "//input[@id='nationality']")
	private WebElement empFamilyMemberAddNationality;
	
	@FindBy (xpath = "//input[@id='contact_number']")
	private WebElement empFamilyMemberAddContactNumber;
	
	@FindBy (xpath = "//input[@id='alternate_number']")
	private WebElement empFamilymemberAddAlternateMobileNo;
	
	@FindBy (xpath = "//button[text()='Save']")
	private WebElement empFamilyMemberSaveBtn;
	
	@FindBy (xpath = "//table[@id='example_family']")
	private WebElement empfamilyTable;
	
	@FindBy (xpath = "//table[@id='example_family']/tbody/tr")
	private WebElement empFamilyTableRow;
	
	@FindBy (xpath = "//button[@id='mark_nominee']")
	private WebElement empFamilyMemberMarkNominee;
	
	@FindBy (xpath = "//button[@id='mark_emergency']")
	private WebElement empFamilyMemberMarkEmergency;
	
	@FindBy (xpath = "//table[@id='example_family']//td[7]")
	private WebElement empFamilyMemberEmergencyStatus;
	
	@FindBy (xpath = "//table[@id='example_family']//td[6]")
	private WebElement empfamilyMemberNomineeStatus;
	
	@FindBy (xpath = "//div[@id='div-empsetuppassport']/div/div//button[@title='Add Items']")
	private WebElement empDocumentAddBtn;
	
	@FindBy (xpath = "//input[@id='name']")
	private WebElement empAddDocumentName;
	
	@FindBy (xpath = "//input[@id='document_number']")
	private WebElement empAddDocumentNumber;
	
	@FindBy (xpath = "//input[@name='valid_from']")
	private WebElement empAddDocumentValidFrom;
	
	@FindBy (xpath = "//input[@name='valid_till']")
	private WebElement empAddDocumentValidTill;
	
	@FindBy (xpath = "//input[@id='nationality']")
	private WebElement empAddDocumentNationality;
	
	@FindBy (xpath = "//button[text()='Save']")
	private WebElement empAddDocumentSaveBtn;
	
	@FindBy (xpath = "//table[@id='example_passport']")
	private WebElement empDocumentTable;
	
	@FindBy (xpath = "//select[@id='document_type']")
	private WebElement empAddDocumentType;
	
	@FindBy (xpath = "//select[@id='gender']")
	private WebElement empAddDocumentGender;
	
	@FindBy (xpath = "//button[text()='Save & Close']")
	private WebElement empAddSaveAndClosebtn;
	
	@FindBy (xpath = "//td[@field='emp_company_id']")
	private WebElement addEmpHomeEmpNo;
	
	public AddEmployeePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void personalDetails() {
		AddNewEmployee.click();
		enterFirstName.sendKeys(GeneralUtility.getRandomFirstName());
		enterEmpAddress.sendKeys("Kochi");
		pageUtility.slect_ByVisibleText(selectGender, "Male");
		enterEmpDOB.sendKeys("17/10/1997");
		enterEmpDOB.sendKeys(Keys.TAB);
		enterEmpCity.sendKeys("Ernakulam");
		enterEmpState.sendKeys("Kerala");
		//pageUtility.select_ByValue(enter, null)
		enterZIPCode.sendKeys("629170");
		enterMobileNo.sendKeys(GeneralUtility.getRandomNumber()+"987654321");
		enterEmpEmail.sendKeys(GeneralUtility.getRandomFirstName()+"@gmail.com");
		pageUtility.scrollAndClick(bloodGroupLabel);
		enterEmpBloodGroup.sendKeys("A+");
		pageUtility.select_ByValue(selectMartialStatus, "Un-Married");
		//pageUtility.scrollAndClick(enterEmpDOJ);
		//enterEmpDOJ.sendKeys("26/12/2024");
	}
	
}

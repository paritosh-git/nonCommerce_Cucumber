package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class SearchCustomerPage  {

	public WebDriver ldriver;
	

	WaitHelper waithelper;

	public SearchCustomerPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

		waithelper = new WaitHelper(ldriver);
	}

	@FindBy(how = How.ID, using = "SearchEmail")
	WebElement txtEmail;

	@FindBy(how = How.ID, using = "SearchFirstName")
	WebElement txtFirstName;

	@FindBy(how = How.ID, using = "SearchLastName")
	WebElement txtLastName;

	@FindBy(how = How.ID, using = "SearchMonthOfBirth")
	WebElement drpdobMonth;

	@FindBy(how = How.ID, using = "SearchDayOfBirth")
	WebElement drpdobDay;

	@FindBy(how = How.ID, using = "SearchCompany")
	WebElement txtCompany;

	@FindBy(how = How.XPATH, using = "//div[@role='listbox']")
	WebElement txtCustomerRole;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Administrators')]")
	WebElement lstitemAdministrator;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Registered' )]")
	WebElement lstitemRegistered;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Guests')]")
	WebElement lstitemGuests;

	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Vendors')]")
	WebElement lstitemVendors;

	@FindBy(how = How.ID, using = "Search-customers")
	WebElement btnsearch;

	@FindBy(how = How.XPATH, using = "//table[@role ='grid']")
	WebElement tblSearchResults;

	@FindBy(how = How.XPATH, using = "//table[@id ='customer-grid']")
	WebElement table;

	@FindBy(how = How.XPATH, using = "//table[@id ='customer-grid']//tbody/tr")
	List<WebElement> tableRows;

	@FindBy(how = How.XPATH, using = "//table[@id ='customer-grid']//tbody/tr/td")
	List<WebElement> tableColumns;

	public void setEmail(String email) {

		waithelper.WaitForElement(txtEmail, 30);
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}

	public void setFirstName(String fname) {

		waithelper.WaitForElement(txtFirstName, 30);
		txtFirstName.clear();
		txtFirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {

		waithelper.WaitForElement(txtLastName, 30);
		txtLastName.clear();
		txtLastName.sendKeys(lname);
	}

	
	public void clickSearch(){
		btnsearch.click();
		waithelper.WaitForElement(btnsearch, 30);
	}
	
	public int getNoOfRows(){
		
		return(tableRows.size());
	}
	
public int getNoOfColumns(){
		
		return(tableColumns.size());
	}
	
	
	public boolean searchCustomerByEmail(String email){
		boolean flag = false;
		
		for(int i=1;i<=getNoOfRows();i++){ 
			String emailid = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[2]")).getText();
		System.out.println(emailid);
		if(emailid.equals(email)){
			flag=true;
		}
		}
		return flag;
		
	}
	
	
	
	
}

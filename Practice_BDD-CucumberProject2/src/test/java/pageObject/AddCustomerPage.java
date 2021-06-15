package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {

	public WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	By lnkcustomer_menu = By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p/i");
	By lnkcustomer_menuitem = By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p");

	By btnAddnew = By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a");
	By txtemail = By.xpath("//input[@id='Email']");

	By txtpassword = By.xpath("//input[@id= 'Password']");
	By txtCustomerRoles = By.xpath("//div[@role='listbox']");

	By txtfirstname = By.xpath("//input[@id = 'FirstName']");
	By txtlastname = By.xpath("//input[@id = 'LastName']");
	By txtcompanytname = By.xpath("//input[@id = 'Company']");

	By txtDob = By.xpath("//input[@id = 'DateOfBirth']");
	By txtAdminContent = By.xpath("//textarea[@id = 'AdminComment']");
	By btnSave = By.xpath("//button[@name= 'save']");

	By lstitemAdminstrators = By.xpath("//li[contains(text(),'Administrators')]");
	By lstitemRegistered = By.xpath("//li[contains(text(),'Registered' )]");
	By lstitemGuests = By.xpath("//li[contains(text(),'Guests' )]");
	By lstitemVendors = By.xpath("//li[contains(text(),'Vendors' )]");

	By drpmngrOfVendor = By.xpath("//*[@id = 'VendorId']");

	By maleGender = By.xpath("//input[@id='Gender_Male']");
	By femaleGender = By.xpath("//input[@id='Gender_female']");

	// Actions Method

	
	public String getPageTitle(){
		return ldriver.getTitle();
	}
	
	public void clickOnCustomerMenu() {

		ldriver.findElement(lnkcustomer_menu).click();
	}

	public void clickOnCutomerMenuItem() {
		ldriver.findElement(lnkcustomer_menuitem).click();
	}

	public void clickOnAddMenu() {
		ldriver.findElement(btnAddnew).click();
	}

	public void setEmail(String email) {
		ldriver.findElement(txtemail).sendKeys(email);
	}

	public void setPassword(String password) {
		ldriver.findElement(txtpassword).sendKeys(password);
	}

	public void setCustomerRoles(String role) throws Exception {

		if (!role.equals("Vendors")) {
			ldriver.findElement(By.xpath("//*[@id='customer-info']/div[2]/div[10]/div[2]/div/div[1]/div/div"));

			ldriver.findElement(txtCustomerRoles).click();

			WebElement listitems;

			Thread.sleep(3000);

			if (role.equals("Administrator")) {
				listitems = ldriver.findElement(lstitemAdminstrators);

			} else if (role.equals("Guests")) {
				listitems = ldriver.findElement(lstitemGuests);

			} else if (role.equals("Vendors")) {
				listitems = ldriver.findElement(lstitemVendors);

			} else {
				listitems = ldriver.findElement(lstitemRegistered);

			}
			listitems.click();

		}

	}

	public void setManagerOfVendor(String value) {

		Select sl = new Select(ldriver.findElement(drpmngrOfVendor));
		sl.selectByVisibleText(value);

	}

	public void setGender(String gender) {

		if (gender.equals("Male")) {
			ldriver.findElement(maleGender).click();
		} else if (gender.equals("Female")) {

			ldriver.findElement(femaleGender).click();

		} else
			ldriver.findElement(maleGender).click();// deafult

	}

	public void firstname(String fname) {
		ldriver.findElement(txtfirstname).sendKeys(fname);
	}
	
	public void lastname(String lname) {
		ldriver.findElement(txtlastname).sendKeys(lname);
	}


	public void setDob(String dob) {
		ldriver.findElement(txtDob).sendKeys(dob);
	}

	public void companyname(String cname) {
		ldriver.findElement(txtcompanytname).sendKeys(cname);
	}

	public void setAdminContent(String content) {
		ldriver.findElement(txtAdminContent).sendKeys(content);
	}

	public void clickOnsave() {
		ldriver.findElement(btnSave).click();
	}
	

}

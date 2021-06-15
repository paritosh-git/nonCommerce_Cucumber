package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="Email")
	WebElement txtemail;
	
	@FindBy(id ="Password")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement btnlogin;
	
	@FindBy(linkText="Logout")
	WebElement lnklogout;
	
	public void setUserName(String uname){
		txtemail.clear();
		txtemail.sendKeys(uname);
	}
	
	public void setPassword(String pwd){

	txtpassword.clear();
	txtpassword.sendKeys(pwd);
	}
	
	public void clicklogin(){
		btnlogin.click();
	}
	public void clickLogout(){
		lnklogout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

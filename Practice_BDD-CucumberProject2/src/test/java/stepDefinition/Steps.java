package stepDefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;


import pageObject.AddCustomerPage;
import pageObject.LoginPage;
import pageObject.SearchCustomerPage;

public class Steps extends BaseClass {

	@Before
	public void Setup() throws IOException {

		configprop = new Properties();
		FileInputStream configPropfile = new FileInputStream("config.properties");
		configprop.load(configPropfile);

		String br = configprop.getProperty("browser");

		if (br.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", configprop.getProperty("chromepath"));
			driver = new ChromeDriver();
		} else if (br.equals("chrome")) {

			System.setProperty("webdriver.gecko.driver", configprop.getProperty("firefoxpath"));
			driver = new FirefoxDriver();

		} else if (br.equals("ie")) {

			System.setProperty("webdriver.ie.driver", configprop.getProperty("iepath"));
			driver = new InternetExplorerDriver();

		}
		logger = Logger.getLogger("nopCommerce");// Added logger
		PropertyConfigurator.configure("log4j.properties");// Added logger
		logger.info("**********Launching the Browser************");

	}

	@Given("^user launch chrome browser$")
	public void user_launch_chrome_browser() throws Throwable {

		lp = new LoginPage(driver);

	}

	@When("^user open url \"([^\"]*)\"$")
	public void user_open_url(String url) throws Throwable {
		logger.info("******opening the URL");
		driver.get(url);

	}

	@When("^user enter email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enter_email_as_and_password_as(String email, String password) throws Throwable {

		logger.info("******providing details********");
		lp.setUserName(email);
		lp.setPassword(password);

	}

	@When("^click login button$")
	public void click_login_button() throws Throwable {

		lp.clicklogin();
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String title) throws Throwable {

		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			logger.info("******login pass********");
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("^user click on Log out link$")
	public void user_click_on_Log_out_link() throws Throwable {
		logger.info("******click on logout link********");
		lp.clickLogout();
		Thread.sleep(3000);
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		Thread.sleep(3000);
		driver.close();
	}

	// @When("^Click login$")
	// public void click_login() throws Throwable {
	//
	// }

	@Then("^User can view dashboard$")
	public void user_can_view_dashboard() throws Throwable {
		logger.info("******open dashboard*****");
		addcust = new AddCustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addcust.getPageTitle());

	}

	@When("^User click on customers menu$")
	public void user_click_on_customers_menu() throws Throwable {
		logger.info("******open customer menu*****");
		Thread.sleep(2000);
		addcust.clickOnCustomerMenu();
		// addcust.clickOnCustomerMenu();
	}

	@When("^Click on customer menu item$")
	public void click_on_customer_menu_item() throws Throwable {
		logger.info("******open customer menu item*****");
		Thread.sleep(2000);
		addcust.clickOnCutomerMenuItem();

	}

	@When("^Click on add new button$")
	public void click_on_add_new_button() throws Throwable {
		logger.info("******click add button*****");
		Thread.sleep(3000);
		addcust.clickOnAddMenu();
	}

	@Then("^User can view add new customer page$")
	public void user_can_view_add_new_customer_page() throws Throwable {
		logger.info("******user can  view customer page*****");
		Assert.assertEquals("Add a new customer / nopCommerce administration", addcust.getPageTitle());
	}

	@When("^User enter customer info$")
	public void user_enter_customer_info() throws Throwable {
		logger.info("******customer Details*****");

		String email = randomstring() + "@gmail.com";
		addcust.setEmail(email);

		// addcust.setEmail("paritosh2b@gmail.com");

		addcust.setPassword("test123");

		addcust.setCustomerRoles("Vendors");
		Thread.sleep(2000);

		addcust.setManagerOfVendor("Vendor 2");
		addcust.setGender("Male");
		addcust.firstname("paritosh");
		addcust.lastname("patil");
		addcust.setDob("02/10/1990");
		addcust.setAdminContent("This is for testing");
		addcust.companyname("Mycompany");

	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {

		addcust.clickOnsave();
		logger.info("******click on save button*****");

	}

	@Then("^User can view confirmation msg \"([^\"]*)\"$")
	public void user_can_view_confirmation_msg(String msg) throws Throwable {

		Assert.assertTrue(driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]")).getText()
				.contains("The new customer has been added successfully."));
		logger.info("******confirmation msg*****");
		driver.close();

	}

	// Steps for searching a customer using email-id

	// @When("^Enter customer email$")
	// public void enter_customer_email() throws Throwable {
	//
	// searchcust = new SearchCustomerPage(driver);
	// searchcust.setEmail("victoria_victoria@nopCommerce.com");
	// }
	//
	// @When("^click on search button$")
	// public void click_on_search_button() throws Throwable {
	//
	// searchcust.clickSearch();
	// Thread.sleep(3000);
	// }
	//
	// @Then("^user should found email in the search table$")
	// public void user_should_found_email_in_the_search_table() throws
	// Throwable {
	//
	// boolean status =
	// searchcust.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
	//
	// Assert.assertEquals(true, status);
	// }

}

package tests;


import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.testng.Assert.*;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import pages.MVSCHomePage;
import pages.MVSCLoginPage;

public class TestHomePage {
	WebDriver driver;
	MVSCLoginPage objLogin;
	MVSCHomePage objHomePage;
	
	 private StringBuffer verificationErrors = new StringBuffer();


	@Before
	public void setup() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://circle:circle@volunteering.cirz.co.uk");
	}
	
	/**
	 * This test case open the home screen, 
	 * verify the title is correct
	 * verify the register volunteer button present
	 * verify the register organisation button present
	 */
    @Test
	public void home_Page_Appear_Correct() throws Exception {
		//Create homepage Page object
		objHomePage = new MVSCHomePage(driver);
		System.out.println("OpenedLoginPage");
		// check for elements...
		if(objHomePage.getTitleText().contains("Services")) {
			System.out.println("h1 = Services: OK");
		}else{
			System.out.println("h1 = Services: ERROR");
		}
		// check title loaded
		System.out.println("!" + objHomePage.getTitleText());
		System.out.println("!"+objHomePage.getRegVolunteerBtnText());
		System.out.println("!"+objHomePage.getRegOrganisationBtnText());
		
		if(objHomePage.getRegVolunteerBtnText() == "Login") {
			System.out.println("Login Button Present: OK");
		}else{
			System.out.println("Login Button Present: ERROR");
		}
		objHomePage.pushRegVolunteerBtn();
		System.out.println("pressed Register Volunteer button: OK");
		
		//Verify login page title
		//String loginPageTitle = objLogin.getLoginTitle();
		
//		Assert.assertTrue(loginPageTitle.toLowerCase().contains("services"));
		//login to application
//		objLogin.login("circleinterctive", "Mw324oBXfTTrNprV");
//		// submit
//		objHomePage = new MVSCHomePage(driver);
//		//Verify home page
//		Assert.assertTrue(objHomePage.assertPageLoaded().contains("marsh+VIOR_1"));
	}
    
	@After
	public void tearDown() throws Exception {
		driver.quit();
	//	String verificationErrorString = verificationErrors.toString();
	//	if (!"".equals(verificationErrorString)) {
	//		fail(verificationErrorString);
	//	}
	}

    
    public void testPrintToScreen() {
    	System.out.println("this!");
    }
}

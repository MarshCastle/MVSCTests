package pages;

import java.util.concurrent.TimeUnit;
import org.junit.*;
//import org.testng.annotations.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
public class MVSCHomePage {
	WebDriver driver;
	//Elements
	By pageTitle = By.xpath("//h1[@class='page-header']"); // working!
	By RegisterVolunteerBtn = By.xpath("//input[@value[contains(.,'volunteer')]]");
	By RegisterOrganisationBtn = By.xpath("//input[@value[contains(.,'organisation')]]");
	By LoginBtn = By.xpath("//input[@value[contains(.,'Login')]]");

	//Assertions
	String strPageTitle = "Services";
	
	//constructor for using existing Driver
	public MVSCHomePage(WebDriver driver){
		this.driver = driver;
	}

	//Get Page Title
	public String getTitleText(){
		return    driver.findElement(pageTitle).getText();
	}

	//Get RegVolunteer button value
	public String getRegVolunteerBtnText() {
		return driver.findElement(RegisterVolunteerBtn).getAttribute("value");
	}
	//Get RegOrganistaion button value
	public String getRegOrganisationBtnText() {
		return driver.findElement(RegisterOrganisationBtn).getAttribute("value");
	}

	//Press the Register Volunteer button
	public void pushRegVolunteerBtn() {
		driver.findElement(RegisterVolunteerBtn).click();
	}
}

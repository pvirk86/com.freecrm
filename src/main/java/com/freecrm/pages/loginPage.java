package com.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.utilities.BaseProject;

public class loginPage extends BaseProject {
	// define objects
	@FindBy(xpath="//img[contains(@class,'img-responsive')]") WebElement crmLogo;
	@FindBy(xpath="//small[contains(.,'Forgot Password?')]") WebElement forgotPasswordLink;
	@FindBy(xpath="//a[contains(.,'Features')]") WebElement featuresLink;
	@FindBy(xpath="//a[contains(.,'Sign Up')]") WebElement signUpLink;
	@FindBy(xpath="//a[contains(.,'Pricing')]") WebElement pricingLink;
	@FindBy(xpath="//a[contains(.,'Customers')]") WebElement customerLink;
	@FindBy(xpath="//a[contains(.,'Contact')]") WebElement contactLink;
	@FindBy(xpath="//input[@name='username']") WebElement usernameField;
	@FindBy(xpath="//input[@name='password']") WebElement passwordField;
	@FindBy(xpath="//input[@value='Login']") WebElement loginLink;
	
	
	// initialize the Page Object
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMLogo() {
		return crmLogo.isDisplayed();
	}
	
	public boolean validateForgotPasswordLink() {
		return forgotPasswordLink.isDisplayed();
	}
	
	public boolean validateFeaturesLink() {
		return featuresLink.isDisplayed();
	}
	
	public boolean validateSignUpLink() {
		return signUpLink.isDisplayed();
	}
	
	public boolean validatePricingLink() {
		return pricingLink.isDisplayed();
		
	}
	
	public boolean validateCustomerLink() {
		return customerLink.isDisplayed();
	}
	
	public boolean validateContactLink() {
		return contactLink.isDisplayed();
	}
	
	public HomePage login(String uname, String pwd) {
		usernameField.sendKeys(uname);
		passwordField.sendKeys(pwd);
		return new HomePage();
		
	}

	public void clickLink() throws InterruptedException {
		loginLink.isDisplayed();
		Thread.sleep(3000);
		loginLink.click();

	}

}

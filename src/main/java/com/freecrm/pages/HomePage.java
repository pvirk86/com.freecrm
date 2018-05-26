package com.freecrm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.freecrm.utilities.BaseProject;

public class HomePage extends BaseProject {

	@FindBy(xpath = "//a[contains(text(),'Deals')]") WebElement dealsLink;
	@FindBy(xpath = "//a[contains(text(),'Contacts')]") WebElement contactsLink;
	@FindBy(xpath = "//a[@title='New Contact']") WebElement newContactLink;
	@FindBy(id = "first_name") WebElement firstName;
	@FindBy(xpath = "//input[@id='surname']") WebElement lastName;
	@FindBy(xpath = "//input[@value='Save']") WebElement saveButton;
	@FindBy(xpath = "//input[@name='nickname']") WebElement nickName;
	@FindBy(xpath = "//input[@id='company_position']") WebElement Position;
	@FindBy(xpath = "//input[@id='department']") WebElement Department;
	@FindBy(xpath = "//select[@name='suffix']") WebElement Suffix;
	@FindBy(xpath = "//input[@name='client_lookup']") WebElement Company;
	@FindBy(xpath = "//input[@name='contact_lookup_sup']") WebElement Supervisor;

	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	public void clickOnNewContactLink() throws InterruptedException {
		Actions action = new Actions(driver);
		driver.switchTo().frame("mainpanel");
		action.moveToElement(driver.findElement(By.xpath("html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/a"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
	}
	
	public void firstName() {
		 firstName.sendKeys("Preet");
	}
	public void lastName() {
		lastName.sendKeys("Virk");
	}
	public void suffix() {
		
		Select suffixDrop = new Select(Suffix);
		List <WebElement> dropdown = suffixDrop.getOptions();
		
		for(int i=0;i<dropdown.size();i++){
			 
			 String drop_down_values=dropdown.get(i).getText();
			 
			 System.out.println("dropdown values are "+drop_down_values);
		}
	}
	public void nickName () {
		nickName.sendKeys("pv");
	}
	
	public void company() {
		Company.sendKeys("ABC Inc");
	}
	
	public void Position() {
		Position.sendKeys("QA");
	}
	
	public void Department() {
		Department.sendKeys("IT");
	}
	
	public void supervisor() {
		Supervisor.sendKeys("M Boggs");
	}
	public void clickSave() {
		saveButton.click();
	}
	
}
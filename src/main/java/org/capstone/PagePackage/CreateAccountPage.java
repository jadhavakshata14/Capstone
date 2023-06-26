package org.capstone.PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage 
{
	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="id_gender2")
	public WebElement GenderRadio;
	
	@FindBy(id="password")
	public WebElement Password;
	
	@FindBy(id="days")
	public WebElement DayDropdown;
	
	@FindBy(id="months")
	public WebElement MonthDropdown;
	
	@FindBy(id="years")
	public WebElement YearDropdown;
	
	@FindBy(id="newsletter")
	public WebElement NewsletterCheckbox;
	
	@FindBy(id="optin")
	public WebElement OfferCheckbox;
	
	@FindBy(id="first_name")
	public WebElement FirstName;
	
	@FindBy(id="last_name")
	public WebElement LastName;
	
	@FindBy(id="company")
	public WebElement Company;
	
	@FindBy(id="address1")
	public WebElement Address1;
	
	@FindBy(id="address2")
	public WebElement Address2;
	
	@FindBy(id="state")
	public WebElement State;
	
	@FindBy(id="city")
	public WebElement City;
	
	@FindBy(id="zipcode")
	public WebElement Zipcode;
	
	@FindBy(id="mobile_number")
	public WebElement MobileNumber;
	
	@FindBy(xpath="//button[text()='Create Account']")
	public WebElement CreateAccountButton;
	
	public void createAccount()
	{
		GenderRadio.click();
		Password.sendKeys("akshata1234");
		Select s = new Select(DayDropdown);
		s.selectByVisibleText("11");
		Select s1 = new Select(MonthDropdown);
		s1.selectByVisibleText("June");
		Select s2 = new Select(YearDropdown);
		s2.selectByVisibleText("2011");
		NewsletterCheckbox.click();
		OfferCheckbox.click();
		FirstName.sendKeys("Akshata");
		LastName.sendKeys("Jadhav");
		Company.sendKeys("Axis");
		Address1.sendKeys("Sinhgad");
		Address2.sendKeys("Manikbag");
		State.sendKeys("Maharashtra");
		City.sendKeys("Maharashtra");
		Zipcode.sendKeys("411052");
		MobileNumber.sendKeys("7053595157");
		CreateAccountButton.click();
	}

}

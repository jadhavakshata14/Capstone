package org.capstone.PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

public class SignupLoginpage
{
	WebDriver driver;
	
	public SignupLoginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[text()='New User Signup!']")
	public WebElement SignupText;
	
	public void verifySignupText()
	{
		System.out.println(SignupText.isDisplayed());
	}
	
	
	@FindBy(xpath="//*[text()='New User Signup!']")
	public WebElement NewSignupUser;
	
	@FindBy(xpath="//input[@name='name']")
	public WebElement SignupName;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	public WebElement SignupEmail;
	
	@FindBy(xpath="//button[text()='Signup']")
	public WebElement SignupButton;
	
	@Parameters({"Port"})
	public void signup(String Port)
	{
		if(Port.equalsIgnoreCase("5555"))
		{
		SignupName.sendKeys("Akshata");
		SignupEmail.sendKeys("akshata23@gmail.com");
		SignupButton.click();
		}
		else
		{
			SignupName.sendKeys("Mitesh");
			SignupEmail.sendKeys("mitesh9@gmail.com");
			SignupButton.click();
		}
	}
	
	@FindBy(xpath="//*[text()='Login to your account']")
	public WebElement LoginText;
	
	public void verifyLoginText()
	{
		LoginText.isDisplayed();
	}
	
	public void signupForCorrectCredentials(String Port)
	{
		if(Port.equalsIgnoreCase("5555"))
		{
		SignupName.sendKeys("Akshata");
		SignupEmail.sendKeys("akshata24@gmail.com");
		SignupButton.click();
		}
		else
		{
			SignupName.sendKeys("mitesh");
			SignupEmail.sendKeys("mitesh10@gmail.com");
			SignupButton.click();
		}
	}
	@FindBy(xpath="(//*[@placeholder='Email Address'])[1]")
	public WebElement LoginEmail;
	
	@FindBy(xpath="//*[@placeholder='Password']")
	public WebElement LoginPassword;
	
	@FindBy(xpath="//*[text()='Login']")
	public WebElement LoginButton;
	
	@Parameters({"Port"})
	public void loginWithCorrectCredentials(String Port)
	{
		if(Port.equalsIgnoreCase("5555"))
		{
		LoginEmail.sendKeys("akshata24@gmail.com");
		LoginPassword.sendKeys("akshata1234");
		LoginButton.click();
		}
		else
		{
			LoginEmail.sendKeys("mitesh10@gmail.com");
			LoginPassword.sendKeys("akshata1234");
			LoginButton.click();
		}
	}
	
	public void loginWithIncorrectCredentials()
	{
		LoginEmail.sendKeys("akshjad123@gmail.com");
		LoginPassword.sendKeys("akshjad@");
		LoginButton.click();
	}
	
	@FindBy(xpath="//*[text()='Your email or password is incorrect!']")
	public WebElement IncorrectCredentials;
	
	public void verifyIncorrectCredentials()
	{
		System.out.println(IncorrectCredentials.isDisplayed());
	}
}

package org.opnemrs.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF{

	WebDriver driver;
	String emailIDValue = "email";
	Properties pro;
	@FindBy(how=How.ID,using="email")
	private WebElement emailID;
	
	By emailWE = By.id(emailIDValue);
	

	public LoginPagePF(WebDriver driver,Properties pro)
	{
		PageFactory.initElements(driver, this);
		this.pro = pro;

	}
	public String  login(String username,String password)
	{

		//Enter username
		emailID.sendKeys(username);
		 
		//Enter password
		driver.findElement(By.id(pro.getProperty("LoginPage.password.id"))).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	
		//Fetch the actual value
		String actual = driver.findElement(By.cssSelector("")).getText();
		
		return actual;
	}
}
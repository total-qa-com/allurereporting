package org.opnemrs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;

	}
	public String  login(String username,String password)
	{

		//Enter username
		driver.findElement(By.id("email")).sendKeys(username);
		 
		//Enter password
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	
		//Fetch the actual value
		String actual = driver.findElement(By.cssSelector("")).getText();
		
		return actual;
	}
}
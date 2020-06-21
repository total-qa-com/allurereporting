package org.ff.tests;

import org.ff.util.BaseClass;
import org.opnemrs.pages.LoginPage;
import org.opnemrs.pages.LoginPagePF;
import org.testng.Assert;
import org.testng.IHookable;
import org.testng.annotations.Test;

public class LoginTests extends BaseClass implements IHookable
{
	@Test(description="Validate Login Functionality",priority=1)
	public static void login() throws InterruptedException 
	{
		LoginPagePF login = new LoginPagePF(driver,pro);
		
		String actual =   login.login("Admin", "Admin123"); 
		
		String expected= "Logged in Successfully";
		
		int actualLength = actual.length();
		
		int expectedLength =expected.length();
		
		System.out.println(actual +"--" + actualLength);
		System.out.println(expected+"--"+expectedLength);
		
		Assert.assertEquals(actual,expected);
	}

}

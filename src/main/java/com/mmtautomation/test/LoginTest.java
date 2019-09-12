package com.mmtautomation.test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mmtautomation.pages.LoginPage;

public class LoginTest extends BaseClass {
	
	public static boolean login=false;
	public static WebDriver d=null;
	LoginPage lpg=null;
	
	
	
	
	@Test
	public void loginMMTTest() throws Exception
	{
		d=intializeDriver();
		
		if(!login)
		{
			
			
			
		}
		
		
	}
	
	

}

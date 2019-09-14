package com.mmtautomation.test;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static WebDriver d=null;
	public static Properties Configprop=null; 


	@BeforeTest
	public WebDriver intializeDriver() throws Exception
	{
		
		System.out.println("Driver Intialization");
		Configprop=new Properties();
		FileInputStream fis=new FileInputStream("E:/Selenium/Code/Java/MMT/TestData.properties");
		Configprop.load(fis);


		if(Configprop.getProperty("browser").equalsIgnoreCase("chrome" ))
		{
			System.setProperty("webdriver.chrome.driver", "E:/Selenium/Software/chromedriver_win32/chromedriver.exe");
			d=new ChromeDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.get(Configprop.getProperty("url"));
		}
		else if(Configprop.getProperty("browser").equalsIgnoreCase("firefox" ))
		{
			System.setProperty("webdriver.chrome.driver", "E:/Selenium/Software/chromedriver_win32/chromedriver.exe");
			d=new FirefoxDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.get(Configprop.getProperty("url"));
		}
		
		return d;

	}





	@AfterTest
	public void tearDown()
	{
		d.close();
	}




}

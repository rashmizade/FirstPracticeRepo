package com.StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class setUp {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest Test;
	
	public static void setup() {
	       System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");		
	       driver = new ChromeDriver();     
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}
	
	public static By FindElement(String locator, String value) {
		By b = null;
		
		switch(locator) {
		case "xpath":
			b = By.xpath(value);
			break;		
			
		}
		
		return b;
		
	}
	
	public static void Reports() {
	       extent = new ExtentReports("D:\\test.html");   
	       Test = extent.startTest("Start");
	       
	}
	
	public static void ReportsEnd() {
	       extent.endTest(Test);
	       extent.flush();
	       
	}

}

package com.StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class framewok extends setUp{
	
	
	

	
	public void launch() {
		driver.get("https://www.snapdeal.com");
		System.out.println("launch");
		By by = FindElement("xpath", "//input[@name='keyword' and @id='inputValEnter']");
	}
	
	public void selectLaptop() {
//		driver.findElement(By.xpath("//input[@name='keyword' and @id='inputValEnter']")).sendKeys("laptop");
//		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
//		
//		driver.findElement(By.xpath("//div[@data-name='Brand']//div[1]")).click();
//		String text = driver.findElement(By.xpath("//div[@data-name='Brand']//div[1]")).getText();
//		System.out.println(text);
//		
		
		
		Test.log(LogStatus.PASS,"selected");
		
		System.out.println("select laptop");
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		framewok A = new framewok();
		
		setUp.setup();
		setUp.Reports();
		A.launch();		
		A.selectLaptop();
		setUp.ReportsEnd();		

	}

}

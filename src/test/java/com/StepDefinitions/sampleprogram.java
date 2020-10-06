package com.StepDefinitions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class sampleprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");		
       WebDriver driver = new ChromeDriver();     
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      
       
       ExtentReports extent = new ExtentReports("D:\\");   
       ExtentTest Test = extent.startTest("Start");
       
         
       driver.get("https://www.snapdeal.com");
       
       
       
		driver.findElement(By.xpath("//input[@name='keyword' and @id='inputValEnter']")).sendKeys("laptop");
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		
		driver.findElement(By.xpath("//div[@data-name='Brand']//div[1]")).click();
		String text = driver.findElement(By.xpath("//div[@data-name='Brand']//div[1]")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//*[@id=\"1354929844\"]/div[2]/a/picture/img")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		
		
//		if (handles.size()>1)
//		{
//			
//			if (driver.findElement(By.xpath("//span[text()='add to cart']")).isDisplayed())
//			{
//				System.out.println("Success");
//				Test.log(LogStatus.PASS, "Success");
//			}
//			
//			
//			
//		}
		
		extent.endTest(Test);
		extent.flush();
		

	}

}

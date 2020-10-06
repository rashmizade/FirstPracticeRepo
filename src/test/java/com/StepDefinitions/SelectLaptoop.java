package com.StepDefinitions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ReusableUtilities.driverSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectLaptoop extends setUp {
	

	ExtentReports extent;
	ExtentTest Test;
	
	
	
	@Given("^I have launched the browser$")
	public void i_have_launched_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		driverSetup.setup();
		
	     extent = new ExtentReports("D:\\");
	     Test = extent.startTest("Start");
		
	}

	@Given("^I have opened Snapdeal$")
	public void i_have_opened_Snapdeal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 driver.get("https://www.snapdeal.com");
		
	}

	@When("^I select the first Brand$")
	public void i_select_the_first_Brand() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.xpath("//input[@name='keyword' and @id='inputValEnter']")).sendKeys("laptop");
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		
		driver.findElement(By.xpath("//div[@data-name='Brand']//div[1]")).click();
		
		
	}

	@Then("^I verify the the Brand Name$")
	public void i_verify_the_the_Brand_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String text = driver.findElement(By.xpath("//div[@data-name='Brand']//div[1]")).getText();
		System.out.println(text);
	}

	@When("^I select the first available option$")
	public void i_select_the_first_available_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		driver.findElement(By.xpath("//*[@id=\"1354929844\"]/div[2]/a/picture/img")).click();
		
		Set<String> handles = driver.getWindowHandles();
	}

	@Then("^I should be navigated to the desried page$")
	public void i_should_be_navigated_to_the_desried_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		extent.endTest(Test);
		extent.flush();



}
	
}

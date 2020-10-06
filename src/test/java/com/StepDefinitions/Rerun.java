package com.StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Rerun {

	public static WebDriver driver;
	

		
		@Given("^I have launched browser$")
		public void i_have_launched_browser() {
		    // Write code here that turns the phrase above into concrete actions
			
		       System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");		
		       driver = new ChromeDriver();     
		       driver.manage().window().maximize();
		       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		    
		}

		@When("^I Open Sapdeal$")
		public void i_Open_Sapdeal() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.get("https://www.snapdeal.com");
			driver.close();
			//driver.findElement(By.xpath("//*[@id=\"1354929844\"]/div[2]/a/picture/img")).click();
		    
		}

		@Then("^Test Case Is Passed$")
		public void test_Case_Is_Passed() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("First test case failed");
		    
		}

		@When("^I Open Sapdeal again$")
		public void i_Open_Sapdeal_again() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("2nd test case");
		    
		}

		@Then("^Test Case Is Passed again$")
		public void test_Case_Is_Passed_again() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("2nd test case passed");
		    
		}





}

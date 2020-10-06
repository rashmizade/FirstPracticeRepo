package ReusableUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverSetup {

	
	public static WebDriver driver;
	
	public static void setup() {
		// TODO Auto-generated method stub
		
	       System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			
	      driver = new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	       
	       //comment for push test
	       }

}

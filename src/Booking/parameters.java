package Booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class parameters {
	
	public  WebDriver driver;
	
@Parameters({"browser","URL"})
@BeforeTest
public void browserlaunch(String browser,String URL) {
	
		if(browser.equalsIgnoreCase("chrome")) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankita.Mohamanasingh\\eclipse-workspace\\selenium\\MySpiceProject\\ChromeDriver\\chromedriver.exe");
	driver=new ChromeDriver();	
		
		
		}
		else {
			System.out.println("wrong ");
		}
		
		driver.get(URL);
	
	}


@Parameters({"username"})
@Test
public void TestCase1(String username) {
	
	driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
}
}
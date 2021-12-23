package TestNG_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Second_Class 
{
	 private static WebDriver driver = null;
	 
	  @Test
	  public void f() 
	  {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aayushi\\eclipse-workspace\\GC_Project\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(" https://www.facebook.com/");
			
			
			driver.close();
	  }	 
}

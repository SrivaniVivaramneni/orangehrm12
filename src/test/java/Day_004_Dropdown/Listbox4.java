package Day_004_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Listbox4 {
	static WebDriver driver;
  @Test
  public void dropdown() throws Exception{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	  
		
		 
		 
		 
  }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
  }


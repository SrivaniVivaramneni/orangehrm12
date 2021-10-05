package Day_002_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest_Non3 {
	
	static WebDriver driver;
  @Test
  public void Testmethods() throws Exception{
	  
	  NewTest_Non3.OpenChromeBrowser();
	  NewTest_Non3.OpenUrl();
	  NewTest_Non3.loginPage();
	  NewTest_Non3.CloseBrowser();

  }
  public static void OpenChromeBrowser() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver_win32\\\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
}
  public static void OpenUrl() throws Exception{
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
  }
  
  public static void loginPage() throws Exception{
	 
			  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			  driver.findElement(By.id("txtPassword")).sendKeys("adnin123");
			  driver.findElement(By.id("btnLogin")).click();
  }
  
  public static void CloseBrowser() throws Exception{
  driver.quit();
	  
  }
  
  
  
  
  
  
  
}
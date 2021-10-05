package Day_002_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest_Non2 {
	
	WebDriver driver;
  @Test
  public void Testmethods() throws Exception{
	  NewTest_Non2 N1= new NewTest_Non2();
	  N1.OpenChromeBrowser();
	  N1.OpenOrangeHrm();
      N1.Login();
      N1.Logout();
  }
  
	

	  	  public void OpenChromeBrowser() throws Exception{
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		   driver =new ChromeDriver();
			  driver.manage().window().maximize();
	  }
	  	 public void OpenOrangeHrm() throws Exception{

	  		  
	  		  driver.get("https://opensource-demo.orangehrmlive.com/");
	  	 }

	  	 public void Login() throws Exception{

	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  
	  
  }
  
  public void Logout() throws Exception{
	  driver.quit();
  }
}

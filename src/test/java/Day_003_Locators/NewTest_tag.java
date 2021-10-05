package Day_003_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Day_034_TestNG_Listeners.TestBrowser;

public class NewTest_tag  {
	static WebDriver driver;
  @Test
  public void tag() throws Exception{
	  driver=TestBrowser.OpenChromeBrowser();
	  String Url ="https://opensource-demo.orangehrmlive.com/";
	  driver.get(Url);
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.cssSelector("input#btnLogin.button")).click();
	 List<WebElement> links1=  driver.findElements(By.tagName("a"));	
		int links_count= links1.size();
		System.out.println("Number of hyperlinks :"+links_count);
  }
}

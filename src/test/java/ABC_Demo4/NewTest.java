package ABC_Demo4;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
 
WebDriver driver;

  @Test
  public void testTC01Nationalities() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/nationality");

	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
    driver.findElement(By.id("menu_admin_nationality")).click();
    driver.findElement(By.id("menu_admin_nationality")).click();
    driver.findElement(By.id("btnAdd")).click();
    driver.findElement(By.id("nationality_name")).click();
    driver.findElement(By.id("nationality_name")).clear();
    driver.findElement(By.id("nationality_name")).sendKeys("indian123");
    driver.findElement(By.id("nationality_name")).click();
    driver.findElement(By.id("nationality_name")).clear();
    driver.findElement(By.id("nationality_name")).sendKeys("indian1234");
    driver.findElement(By.id("btnSave")).click();
    driver.findElement(By.id("txtUsername")).clear();
    driver.findElement(By.id("txtUsername")).sendKeys("admin");
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("divLoginImageContainer")).click();
    driver.findElement(By.id("btnLogin")).click();
    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
    driver.findElement(By.id("btnAdd")).click();
    driver.findElement(By.id("nationality_name")).click();
    driver.findElement(By.id("nationality_name")).clear();
    driver.findElement(By.id("nationality_name")).sendKeys("abcdef");
    driver.findElement(By.id("btnSave")).click();
}
}
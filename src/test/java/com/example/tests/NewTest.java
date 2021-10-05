package Day_011_Katalon_Recorder;

import org.testng.annotations.Test;



import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTC01Nationalities() throws Exception {
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/nationality");
    driver.close();
    driver.close();
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
    driver.findElement(By.xpath("//div[@id='rso']/div[6]/div/div[2]/div/a/h3")).click();
    driver.get("https://app.drivt.net/?_ga=2.235746945.1814290554.1632725322-915644451.1631548814&_gac=1.149952964.1632725322.Cj0KCQjwtMCKBhDAARIsAG-2Eu-SJnFda7d2CBIx2OWnbW-d0sy345I1QvB0rpCJHcpFfotVHhxHoZUaAnEAEALw_wcB");
    driver.close();
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
    driver.findElement(By.id("menu_admin_Organization")).click();
    driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
    driver.findElement(By.id("btnAdd")).click();
    driver.findElement(By.id("jobTitle_jobTitle")).click();
    driver.findElement(By.id("jobTitle_jobTitle")).clear();
    driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("fdf");
    driver.findElement(By.id("jobTitle_jobDescription")).click();
    driver.findElement(By.id("jobTitle_jobDescription")).clear();
    driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("cxxvc");
    driver.findElement(By.id("btnSave")).click();
  }
}
package kaplan.DemoMavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewTest {
	public WebDriver driver;
	
  @Test
  public void f() {
	  FirefoxDriver driver= new FirefoxDriver();
	  driver.get("http://kup.stage.int.kaplan.com");
	  driver.findElement(By.id("username")).sendKeys("bevadams");
	  driver.findElement(By.id("password")).sendKeys("Password_01");
	 driver.findElement(By.id("Login")).click();
	 WebElement EleLogout = driver.findElement(By.linkText("Logout"));
	 Assert.assertTrue(EleLogout.isDisplayed());
	 Assert.assertTrue(EleLogout.isDisplayed());
	 driver.close();
	 driver.quit();
	  	  
  }}
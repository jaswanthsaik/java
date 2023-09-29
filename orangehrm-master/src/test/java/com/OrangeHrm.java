package seleniumclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
	 private static WebDriver  driver=null;
	   @BeforeClass
	   public static void setup() {
		   String driverPath = "lib/chromedriver.exe";
		   System.setProperty("webdriver.chrome.driver", driverPath);
		   driver=new ChromeDriver();
	   }
	   @AfterClass
	   public static void windup() {
		   driver.close();
	   }
	   @Test
	   public void test1() {
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		    String expectedtitle="OrangeHRM";
		    String actualtitle=driver.getTitle();
		    Assert.assertEquals("OrangeHRM Page is not available", expectedtitle, actualtitle);
		    
	   }
	   @Test
	   //Invalid credentials
	   public void test2() {
          driver.findElement(By.id("btnLogin")).click();
		  String expectedmessage="Invalid credentials";
		  String actualmessage=driver.findElement(By.id("spanMessage")).getText();
		  Assert.assertEquals("error Page is not available", expectedmessage, actualmessage);
		  
		   
		   
		   
	   }
	   @Test
	   //user name can not be empty
	   public void test3() {
		   driver.findElement(By.id("txtUsername")).sendKeys("");
		   driver.findElement(By.id("btnLogin")).click();
		  String expectedmessage="Username cannot be empty";
		  String actualmessage=driver.findElement(By.id("spanMessage")).getText();
		  Assert.assertEquals("username not found", expectedmessage, actualmessage);
		   }
	   @Test
	   //password can not be empty
	   public void test4() {
		   driver.findElement(By.id("txtPassword")).sendKeys("");
		   driver.findElement(By.id("btnLogin")).click();
		  String expectedmessage="Password cannot be empty";
		  String actualmessage=driver.findElement(By.id("spanMessage")).getText();
		  Assert.assertEquals("password is not available", expectedmessage, actualmessage);
		   }
	   @Test
	   //Enter correct username
	   public void test5() {
		   driver.findElement(By.id("txtUsername")).sendKeys("121737328");
		   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		   
		   driver.findElement(By.id("btnLogin")).click();
		  String expectedmessage="Invalid credentials";
		  String actualmessage=driver.findElement(By.id("spanMessage")).getText();
		  Assert.assertEquals("enter correct user name ", expectedmessage, actualmessage);
		   }
	   @Test
	   //Enter correct password
	   public void test6() {
		   driver.findElement(By.id("txtUsername")).sendKeys("admin");
		   driver.findElement(By.id("txtPassword")).sendKeys("32655880");
		   
		   driver.findElement(By.id("btnLogin")).click();
		  String expectedmessage="Invalid credentials";
		  String actualmessage=driver.findElement(By.id("spanMessage")).getText();
		  Assert.assertEquals("enter correct password ", expectedmessage, actualmessage);
		   }
	   @Test
	  //forgot password
	   public void test7() {
		   driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/div/a"));
			
			String expectedMessage = "Reset Password";
			String actualMessage = driver.findElement(By.id("btnSearchValues")).getAttribute("value");
		    Assert.assertEquals("Unable to load forgot Password page",expectedMessage, actualMessage);
		   
		
	}
	   public void test8() {
		   driver.findElement(By.id("txtUsername")).sendKeys("admin");
		   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			
			String expectedMessage = "Account is disabled";
			String actualMessage = driver.findElement(By.id("spanMessage")).getText();
		    Assert.assertEquals("Unable to load Account",expectedMessage, actualMessage);	
	   }
		   
}



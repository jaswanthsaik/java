package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import junit.framework.Assert;
public class Loginwebpage {
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
	   public void test01() {
		  driver.get("https://www.gmail.com/"); 
		  String expectedTitle="Gmail";
		  String actualTitle=driver.getTitle();
		  Assert.assertEquals("Gmail Page is not available", expectedTitle,actualTitle);
		  
	   }
	   @Test
	   public void test02() {
		  driver.get("https://accounts.google.com/"); 
		  driver.findElement(By.name("identifier")).sendKeys("302khasimvali@gmail.com");
		  
		  WebElement nextButton=driver.findElement(By.className("VfPpkd-vQzf8d"));
			 nextButton.click();
		
		  //driver.findElement(By.id("")).click();
		// Sleeper.SYSTEM_SLEEPER;
		 driver.findElement(By.name("password")).sendKeys("Khasimvali@9381");
		  String expectedTitle="Inbox (3,341) - 302khasimvali@gmail.com - Gmail";
		  String actualTitle=driver.getTitle();
		  Assert.assertEquals("Unable to login", expectedTitle,actualTitle);
		  
	   }

}
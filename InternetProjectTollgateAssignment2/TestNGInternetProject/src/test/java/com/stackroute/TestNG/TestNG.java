package com.stackroute.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {
	 private static WebDriver  driver=null;
	@BeforeSuite
	public static void setChrome() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterSuite
	public void closeChrome() {
		driver.close();
	}
	
	 @Test
	   public void launchapp() {
		  driver.get("http://the-internet.herokuapp.com/");
	   }
	   @Test
	   public void test01() {
		   String title = driver.getTitle();
			String actualTitle = driver.getTitle();
			
			Assert.assertEquals( title, actualTitle,"Internet title is not matching");
		}
	   @Test
	   public void test02() {
		  
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		   driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a")).click();
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		   String  expectedtitle= "The Internet";
			 String actualtitle= driver.getTitle();
			 Assert.assertEquals( expectedtitle,actualtitle,"A/B Test Variation 1 Page is not available");
			 driver.navigate().back();

}
	   @Test
	   public void test03() {
		  
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		   driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a")).click();
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
			 String  expectedMeassage="Add/Remove Elements";
			 String actualMeassage= driver.findElement(By.xpath("//div[@class='large-12 columns']//h3")).getText();
			 Assert.assertEquals( expectedMeassage,actualMeassage,"Add/Remove Elements Page is not available");
			 driver.navigate().back();
}
	   @Test
	   public void test04() {
		  
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		   driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[4]/a")).click();
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		   String  expectedMeassage= "Broken Images";
			 String actualMeassage= driver.findElement(By.xpath("//div[@class='example']//h3")).getText();
			 Assert.assertEquals(expectedMeassage,actualMeassage,"Broken Images Page is not available");
			 driver.navigate().back();
}
	   @Test
	   public void test05() {
		  
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		   driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[5]/a")).click();
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		   String  expectedMeassage= "Challenging DOM";
			 String actualMeassage= driver.findElement(By.xpath("//div[@class='example']//h3")).getText();
			 Assert.assertEquals( expectedMeassage,actualMeassage,"Challenging DOM Page is not available");
			 driver.navigate().back();

}
	   @Test
	   public void test06() {
		  
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		   driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[6]/a")).click();
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		   String  expectedMeassage= "Checkboxes";
			 String actualMeassage= driver.findElement(By.xpath("//div[@class='example']//h3")).getText();
			 Assert.assertEquals(expectedMeassage,actualMeassage,"Checkboxes Page is not available");
			 driver.navigate().back();
}
	   @Test
	   public void test07() {
		   driver.get("http://the-internet.herokuapp.com/");
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		   driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a")).click();
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		   driver.navigate().back();
		 String  expectedtitle= "The Internet";
		 String actualtitle= driver.getTitle();
		 Assert.assertEquals( expectedtitle,actualtitle,"Basic Auth page is not available");

		 
}
	   
}
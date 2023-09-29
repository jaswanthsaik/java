package com.stackroute.SeleniumProject;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class InternetTest {
	private static WebDriver  driver=null;
	   @BeforeClass
	   public static void setup() {
		   WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
	   }
	   @AfterClass
	   public static void windup() {
		   driver.close();
	   }
	   @Test
	   public void test01() {
		   driver.get("http://the-internet.herokuapp.com/");
		 String  expectedtitle= "The Internet";
		 String actualtitle= driver.getTitle();
		 Assert.assertEquals("internet Page is not available", expectedtitle,actualtitle);

}
	   @Test
	   public void test02() {
		   driver.get("http://the-internet.herokuapp.com/");
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		   driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a")).click();
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		   String  expectedtitle= "The Internet";
			 String actualtitle= driver.getTitle();
			 Assert.assertEquals("A/B Test Variation 1 Page is not available", expectedtitle,actualtitle);
		
}
	   @Test
	   public void test03() {
		   driver.get("http://the-internet.herokuapp.com/");
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		   driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a")).click();
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		 String  expectedMeassage="Add/Remove Elements";
		 String actualMeassage= driver.findElement(By.xpath("//div[@class='large-12 columns']//h3")).getText();
		 Assert.assertEquals("Add/Remove Elements Page is not available", expectedMeassage,actualMeassage);

}
	   @Test
	   public void test04() {
		   driver.get("http://the-internet.herokuapp.com/");
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		   driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[4]/a")).click();
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		   String  expectedMeassage= "Broken Images";
			 String actualMeassage= driver.findElement(By.xpath("//div[@class='example']//h3")).getText();
			 Assert.assertEquals("Broken Images Page is not available", expectedMeassage,actualMeassage);
			
}
	   
	   @Test
	   public void test05() {
		   driver.get("http://the-internet.herokuapp.com/");
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		   driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[5]/a")).click();
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		   String  expectedMeassage= "Challenging DOM";
			 String actualMeassage= driver.findElement(By.xpath("//div[@class='example']//h3")).getText();
			 Assert.assertEquals("Challenging DOM Page is not available", expectedMeassage,actualMeassage);
			
}
	   @Test
	   public void test06() {
		   driver.get("http://the-internet.herokuapp.com/");
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		   driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[6]/a")).click();
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		   String  expectedMeassage= "Checkboxes";
			 String actualMeassage= driver.findElement(By.xpath("//div[@class='example']//h3")).getText();
			 Assert.assertEquals("Checkboxes Page is not available", expectedMeassage,actualMeassage);
			
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
		 Assert.assertEquals("Basic Auth page is not available", expectedtitle,actualtitle);

		 
}
}


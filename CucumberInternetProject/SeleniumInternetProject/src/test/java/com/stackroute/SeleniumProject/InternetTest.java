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
		 String  expectedtitle="The Internet";
		 String actualtitle= driver.getTitle();
		 Assert.assertEquals("A/B Test Variation 1 Page is not available", expectedtitle,actualtitle);

}
	   @Test
	   public void test04() {
		   driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		   driver.manage().timeouts().implicitlyWait(4, TimeUnit.MINUTES);

		 String  expectedtitle="The Internet";
		 String actualtitle= driver.getTitle();
		 Assert.assertEquals("A/B Test Variation 1 Page is not available", expectedtitle,actualtitle);

}
	   
	   @Test
	   public void test05() {
		   driver.get("http://the-internet.herokuapp.com/");
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		   driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[4]/a")).click();
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		 String  expectedtitle="The Internet";
		 String actualtitle= driver.getTitle();
		 Assert.assertEquals("A/B Test Variation 1 Page is not available", expectedtitle,actualtitle);

}
	   
	   @Test
	   public void test06() {
		   driver.get("http://the-internet.herokuapp.com/");
		   driver.manage().timeouts().implicitlyWait(6, TimeUnit.MINUTES);
		   driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[5]/a")).click();
		   driver.manage().timeouts().implicitlyWait(6, TimeUnit.MINUTES);
		 String  expectedtitle="The Internet";
		 String actualtitle= driver.getTitle();
		 Assert.assertEquals("A/B Test Variation 1 Page is not available", expectedtitle,actualtitle);

}
	   
	   @Test
	   public void test07() {
		   driver.get("http://the-internet.herokuapp.com/");
		   driver.manage().timeouts().implicitlyWait(4, TimeUnit.MINUTES);
		   driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[6]/a")).click();
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		 String  expectedtitle="The Internet";
		 String actualtitle= driver.getTitle();
		 Assert.assertEquals("A/B Test Variation 1 Page is not available", expectedtitle,actualtitle);

}
}


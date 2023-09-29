package com.stackroute.page;

import java.io.FileReader;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.stackroute.browser.WebDriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InternetPageTest {
	private static WebDriver webDriver = null;
	private static Internet internet = null;
	
	@BeforeClass
	public static void setup() throws IOException {
		Properties properties = new Properties();
		
		FileReader file = new FileReader("src/test/resources/application.properties");
		properties.load(file);
		WebDriverManager.chromedriver().setup();
		 webDriver=new ChromeDriver();
		
		String webPage = properties.getProperty("site.url");
		webDriver.navigate().to(webPage);
		
		
		internet = new Internet(webDriver);
	}
	
	@AfterClass
	public static void windUp() {
		webDriver.close();
	}
	
	@Test
	public void test01() {
		String title = internet.getTitle();
		String actualTitle = webDriver.getTitle();
		
		Assert.assertEquals("Internet title is not matching", title, actualTitle);
	}
	
	
	
	@Test
	public void test02() {
		internet.addRemove();
		webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		 String  expectedtitle="Add/Remove Elements";
		 String actualtitle= webDriver.findElement(By.xpath("//div[@class='large-12 columns']//h3")).getText();
		 Assert.assertEquals("Add/Remove Elements Page is not available", expectedtitle,actualtitle);
		 webDriver.navigate().back();
	    }
	

	
	
	
}
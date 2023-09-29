package seleniumclass;


import static org.junit.Assert.assertArrayEquals;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class NIITpage {
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
		   driver.get("https://www.niit.com/india/user/login");
		   String expectedtitle = "Log in | NIIT";
		   String actualtitle = driver.getTitle();
		   Assert.assertEquals("NIIT login is not available", expectedtitle, actualtitle);
	   }
	   @Test
	   public void test2() {
		   driver.get("https://www.niit.com/india/user/login");
		   
		   driver.findElement(By.xpath("/html/body/div[15]/header/section/div/div/div/header/div/div[1]/a/img")).click();
		   
		   driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		   String expectedtitle = "NIIT:: Leading Corporate Training Company in India | IT, Digital Marketing, Data Analytics, BFSI Courses";
		   String actualtitle = driver.getTitle();
		   Assert.assertEquals("NIIT login img is not available", expectedtitle, actualtitle);
	   }

	   

	  
	   
	   
}

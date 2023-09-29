package seleniumclass;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitclass {

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
		   driver.get("https://mvnrepository.com/artifact/org.springframework/spring-context");
		   String expectedtitle = "Maven Repository: org.springframework » spring-context";
		   String actualtitle = driver.getTitle();
		   Assert.assertEquals("maven repo is not available", expectedtitle, actualtitle);
		    
		   
	   }
	   
	   @Test
	   public void test2() {
		   driver.get("https://mvnrepository.com/artifact/org.springframework/spring-context");
		   
		   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/a/img")).click();
		   
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		   
		   String expectedtitle = "Maven Repository: Search/Browse/Explore";
		   String actualtitle = driver.getTitle();
		   Assert.assertEquals("maven repo img is not available", expectedtitle, actualtitle);
		    
		   
	   }
}




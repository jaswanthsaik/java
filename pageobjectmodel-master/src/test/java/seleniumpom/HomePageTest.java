package seleniumpom;

import org.openqa.selenium.WebDriver;

import org.junit.BeforeClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class HomePageTest {
	private static WebDriver webDriver=null;
	private static HomePage homePage=null;
	
	@BeforeClass
	public static void setUp() throws IOException {
		Properties properties=new Properties();
		FileReader file=new FileReader("src/test/resources/application.properties");
		properties.load(file);
		
		String browserName=properties.getProperty("browser.name");
		webDriver=WebDriverFactory.getWebDriverInstance(browserName);
		
		String webPage=properties.getProperty("site.url");
		webDriver.navigate().to(webPage);
		
		homePage=new HomePage(webDriver);
	}
	
	@AfterClass
	public static void windUp()	{
		webDriver.close();
	}
	
	@Test
	public void test01() {
		String title=homePage.getTitle();
		String actualTitle=webDriver.getTitle();
		Assert.assertEquals("Home page title is not matching",title,actualTitle);
		
		
	}
}
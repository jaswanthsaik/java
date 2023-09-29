package seleniumpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	private static final String CHROME="chrome";
	private static final String FIREFOX="firefox";
	
	public WebDriverFactory() {
	}
	public static WebDriver getWebDriverInstance(String browserName) {
		WebDriver webDriver=null;
		if(CHROME.equalsIgnoreCase(browserName)) {
			System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
			webDriver=new ChromeDriver();
		}else if(FIREFOX.equalsIgnoreCase(browserName)) {
			System.setProperty("webdriver.gecko.driver","lib.geckodriver.exe");
			webDriver=new FirefoxDriver();
		}
		return webDriver;
		
		
				
		
	}

}
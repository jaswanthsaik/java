package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GOOGlE {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\KHASIM VALI\\Documents\\common jar file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.id(""));
		
	

	}

}

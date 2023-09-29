package seleniumpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver webDriver=null;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/div/a")
	private WebElement forgotPasswordLink;
	
	
	public HomePage() {
	}

	public HomePage(WebDriver webDriver, WebElement txtUserName, WebElement pwdPassword,WebElement forgotPasswordLink) {
		super();
		this.webDriver = webDriver;
		this.forgotPasswordLink=forgotPasswordLink;
		
		PageFactory.initElements(webDriver,this);
	}
	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
		
		PageFactory.initElements(webDriver,this);
	}
	
	public String getTitle() {
		return webDriver.getTitle();
	}
	
	public void clickForgetPasswordLink() {
		this.forgotPasswordLink.click();
	}
	
	public String getCurrentUrl() {
		return webDriver.getCurrentUrl();
	}
	
	public void maximizeBrowser() {
		webDriver.manage().window().maximize();
	}
	
	public void quitPage() {
		webDriver.quit();
	}
	
	public HomePage validateLogin(String uname,String pwd) {
		clickForgetPasswordLink();
		return this;
		
	}
	
	

}
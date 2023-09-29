package com.stackroute.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Internet {
	private WebDriver webDriver = null;
	

	@FindBy (xpath= "/html/body/div[2]/div/ul/li[1]/a")
	private WebElement ab_testing;
	
	@FindBy (xpath= "/html/body/div[2]/div/ul/li[2]/a")
	private WebElement addRemove;
	
	@FindBy (xpath= "/html/body/div[2]/div/ul/li[4]/a")
	private WebElement BasicAuth;
	
	
	
	public Internet() {
	}


	public Internet(WebDriver webDriver, WebElement ab_testing, WebElement addRemove,WebElement BasicAuth) {
		super();
		this.webDriver = webDriver;
		this.ab_testing=ab_testing;
		this.addRemove=addRemove;
		this.BasicAuth=BasicAuth;
	
		
		PageFactory.initElements(webDriver,this);
	}
	
	public Internet(WebDriver webDriver) {
		this.webDriver = webDriver;
	
		PageFactory.initElements(webDriver, this);
	}
	

	public String getTitle() {
		return webDriver.getTitle();
	}
	
	public void ab_testing() {
		this.ab_testing.click();
	}
	
	public void addRemove() {
		this.addRemove.click();
	}
	public void BasicAuth() {
		this.BasicAuth.click();
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

	
	
	
}

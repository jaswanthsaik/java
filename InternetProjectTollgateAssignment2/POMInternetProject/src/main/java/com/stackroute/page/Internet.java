package com.stackroute.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Internet {
	private WebDriver webDriver = null;
	

	
	
	@FindBy (xpath= "/html/body/div[2]/div/ul/li[2]/a")
	private WebElement addRemove;
	
	
	
	
	
	public Internet() {
	}


	public Internet(WebDriver webDriver, WebElement ab_testing, WebElement addRemove,WebElement Brokenimages,WebElement challengingDOM,WebElement checkBoxes) {
		super();
		this.webDriver = webDriver;
		
		this.addRemove=addRemove;
		
		PageFactory.initElements(webDriver,this);
	}
	
	public Internet(WebDriver webDriver) {
		this.webDriver = webDriver;
	
		PageFactory.initElements(webDriver, this);
	}
	

	public String getTitle() {
		return webDriver.getTitle();
	}
	
	
	public void addRemove() {
		this.addRemove.click();
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

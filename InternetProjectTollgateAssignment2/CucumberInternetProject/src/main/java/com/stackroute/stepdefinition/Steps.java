package com.stackroute.stepdefinition;

import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	private WebDriver webDriver; 
	
	@Given("^Open the chrome browser and launch internet page$")
	public void open_chrome_browser_launch_login_app() {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.navigate().to("http://the-internet.herokuapp.com/");
	}
	
	@When("^Click Challenging POM link$")
	public void challenging_pOM() {
		
		
		webDriver.findElement(By.xpath("/html/body/div[5]")).click();
		webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}
	
	@Then("^The Challenging POM page is opened$")
	public void get_error_message1() {
		 String  expectedMeassage= "Challenging DOM";
		 String actualMeassage= webDriver.findElement(By.xpath("//div[@class='example']//h3")).getText();
		 Assert.assertEquals("Challenging DOM Page is not available", expectedMeassage,actualMeassage);
		
		webDriver.close();
	}
	
}

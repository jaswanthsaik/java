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
	
	@Given("^Open the chrome browser and launch login app$")
	public void open_chrome_browser_launch_login_app() {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.navigate().to("http://the-internet.herokuapp.com/");
	}
	
	@When("^Click A/B Testing link$")
	public void enter_username() {
		
		
		webDriver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a")).click();
		webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}
	
	@Then("^The Internet page is opened$")
	public void get_error_message1() {
		 String  expectedtitle= "The Internet";
		 String actualtitle= webDriver.getTitle();
		 Assert.assertEquals("A/B Test Variation 1 Page is not available", expectedtitle,actualtitle);
		webDriver.close();
	}
	
}

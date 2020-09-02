package com.report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class openGoogleSearch
{	
	WebDriver driver;

	@Given("^Open Google Browser$")
	public void open_Google_Browser() 
	{
	  try
	  {
		  String key="webdriver.chrome.driver";
			String value="E:\\BrowserDrivers\\common\\chromedriver.exe";
			System.setProperty(key, value);
			 driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");;
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	}

	@When("^Enter an content in the google saerch box \"([^\"]*)\" in step$")
	public void enter_an_content_in_the_google_saerch_box_in_step(String content)  
	{
	 
		  try
		  {
			  WebElement search=driver.findElement(By.name("q"));
			  search.sendKeys(content);
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	}

	@When("^click on the search button$")
	public void click_on_the_search_button()  
	{
		  try
		  {
			  System.out.println("Search button is clicked");
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	}

	@Then("^Google should display search result$")
	public void google_should_display_search_result() 
	{
		  try
		  {
			  System.out.println("Resuult displayed");
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	}

	
}

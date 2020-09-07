package com.report;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test
{



@Given("^I navigate to the login page$")
public void i_navigate_to_the_login_page()  
{
    System.out.println("Login");
}

@When("^I submit username and password$")
public void i_submit_username_and_password()  
{
	 System.out.println("User Name");
	 System.out.println("Password");
}

@Then("^I should be logged in$")
public void i_should_be_logged_in()  
{
	 System.out.println("Logged Out");
}

@Given("^User search for samsung mobile phone$")
public void user_search_for_samsung_mobile_phone()   
{
	 System.out.println("Samsung mobile searched");
}

@When("^Add the first Mobile  that appears in the search result to the basket$")
public void add_the_first_Mobile_that_appears_in_the_search_result_to_the_basket()   
{
	 System.out.println("Search result displayed");
}
@Then("^User basket should display with added item$")
public void user_basket_should_display_with_added_item() 
{
	 System.out.println("Added in cart");
}

@Given("^User search for Sony Laptop$")
public void user_search_for_Sony_Laptop()   {
	System.out.println("Searched for Sony Laptop");
}

@When("^Add the first Sony Laptopm  that appears in the search result to the basket$")
public void add_the_first_Sony_Laptopm_that_appears_in_the_search_result_to_the_basket()  
{
	System.out.println("Sony laptop appears in the  in cart");
    
}
}
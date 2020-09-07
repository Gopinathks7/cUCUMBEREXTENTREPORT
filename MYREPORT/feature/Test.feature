#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Background Test
 


  
  Background: User is Logged In
	Given I navigate to the login page
	When I submit username and password
	Then I should be logged in 
	
	  @tag1
  Scenario: Search for Mobile
    Given User search for samsung mobile phone
    When Add the first Mobile  that appears in the search result to the basket
	Then User basket should display with added item

 
@tag2
  Scenario: Search for Laptop
    Given User search for Sony Laptop
    When Add the first Sony Laptopm  that appears in the search result to the basket
	Then User basket should display with added item
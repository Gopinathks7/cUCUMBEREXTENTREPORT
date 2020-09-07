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
Feature: Login into Application

  Background: User is Logged In
    Given Open Login page
    When Enter valid usename
    And Enter valid password and click on submit button
    Then Login should sucess

  @tag1
  Scenario: Check Mails
    Given Home page of the Email
    When Click on the Inbox link
    Then Inbox should display all the mails

    
     @tag2
  Scenario: Simple
    Given Simple Testing the Background
    When Nothing Clicked
    Then Nothing should happen
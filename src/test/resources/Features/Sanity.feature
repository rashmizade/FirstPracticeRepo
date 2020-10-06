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
## Commetn added for git pull test
#Sample Feature Definition Template
@tag
Feature: Sanity Testing


  @tag1
  Scenario: Selecting the Laptop
    Given I have launched the browser
    And I have opened Snapdeal
    When I select the first Brand
    Then  I verify the the Brand Name
    When I select the first available option
    Then I should be navigated to the desried page
   

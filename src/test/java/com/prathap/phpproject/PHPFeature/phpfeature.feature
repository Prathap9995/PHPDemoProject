
Feature: PHP demo website testing
  

 
  Scenario: HomePage functionalities testing
    Given Navigate to the website "https://phptravels.com/demo"
    And Get pageTitle
    When Do Mouseover action on a dropdown option
    And Click on any options
    And Get current url
    Then Navigate back to Home page
    And Click on the first link and move to next tab
    And Get current page title
    And Close all open window

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

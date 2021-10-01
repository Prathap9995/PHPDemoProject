
Feature: Demo project on PHP webpage

  @Tag1
  Scenario: Land on PHP Homepage
    Given Land on the "https://phptravels.com/demo/"
    
    When Check for page title
    And Do mouse over on Product list
    And Select desired options for dropdown
    Then Navigate back to home page
    And Click on First element 
    And Move to next tab

  #@Tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

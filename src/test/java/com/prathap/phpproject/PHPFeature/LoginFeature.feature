
Feature: Login Features of PHP website
  

  Scenario Outline: Login Page verification
    Given Go to "https://phptravels.com/demo"
    And Click on Login button
    And Enter credentials <username> and <password>
    And Click on Not robot icon
    #When Click on Login button
    Then Navigate to next page only if it is a valid credential
    And If not get error message
    And If navigates then get page title
    And close the browser
    
    Examples: 
    |username									|	password	|
    |prathapbarkur97@gmail.com| Prastha@9995|
    |Dummy@gmail							| 123Sjdjsk|

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

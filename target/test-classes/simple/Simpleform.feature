
@Simple
Feature: SimpleForm feature
  

  @tag1
  Scenario: To validate Simpleform functionality
    Given open the browser enter simpleForm url
    When user enter, firstname,lastname,email,contact number
    And write in messagebox
    And click on submit button
    Then Thankyou popup should be visible
 

 # @tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
   # Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |


@SecondOpinion
Feature: Second Opinion
  

  @tag1
  Scenario: To validate the second opinion functionality.
    Given Open browser,enter sparsh hospital url
    And Select Yelahanka hospital from hospitals dropdown
    When user click second opinion link
    And user enters firstname,lastname,phone,email textbox
    And upload the reports with message and click the send button
    Then Thankyou message should be displayed
    And bank info should be available in the page

 # @tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

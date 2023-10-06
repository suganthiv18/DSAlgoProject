@DataStructure
Feature: Testing the Data Structure Page

  #Background: The user is logged in to DS Algo portal
  #Given The user is on Signin page of DS Algo portal
  #When The user enter valid "testuser" and "password1234"
  #And The user click on login button
  #Then The user redirected to homepage
  @DS01
  Scenario: The user is able to navigate to DS Page
    Given The user is on the DS page
    When User click on Time Complexity in DS page in Python
    Then The user should be redirected to Time Complexity in DS page

  @DS02
  Scenario Outline: The user is able run code in tryEditor for DS page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythoncode |         0 |

  @DS03
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for DS page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet  "<Sheetname>" and <RowNumber>
    And The user clicks run button
    Then The user should be presented with error result

    Examples: 
      | Sheetname  | RowNumber |
      | pythoncode |         1 |

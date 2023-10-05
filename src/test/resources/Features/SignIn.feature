@Signin
Feature: Validating Sign in page

  
  @Signin1
  Scenario: Verifying Register link
  Given The user is on signin page
  When The user clicks on register link on signin page
  Then The user redirected to Registration page from signin page
  @signin2
  Scenario Outline: User on login page and login with the fields empty "<username>" and "<password>"
  Given The user is on Sign in page
  When The user enter invalid "<username>" and "<password>"
  Then click login button to verify
  
  Examples:
  | username | password |
  |          |          |
  | user     |          |
  |          | passowrd |
  
  @signin3
  Scenario Outline: User on login page and login with invalid and valid inputs from Excel "<Sheetname>" and <RowNumber>
  Given The user is on Login page
  When The user enter sheet "<Sheetname>" and <RowNumber>
  Then click login button
  
  Examples:
  | Sheetname | RowNumber |
  | login     |         0 |
  | login     |         1 |
  | login     |         2 |
  | login     |         3 |
  
  @signin4
     Scenario: Verifying signout link
    Given The user is on signin page with valid username "testuser" and password "password@1234"
    When The user click signout button
    Then The user redirected to homepage 
    
  @signin5
  Scenario: Signin to Navigate through modules
    Given The user clicks sign in button
    And enter valid username "testuser" and password "password@1234"
    When The user clicks login button
    Then The user redirected to homepage


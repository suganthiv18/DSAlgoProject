@DSAlgoPortal
Feature: The user opens DS Algo portal link

  @DSAlgoPortal1
  Scenario: The user launch DS Algo portal url
    Given The user opens the DS Algo portal link
    When The user clicks on "Get Started" button
    Then The user should be redirected to homepage

@Home
Feature: User is on DS ALgo Home page

  @Home1
  Scenario Outline: The user is on the Home page and click Get started link with out sign in
    Given The user is on Home Page
    When user clicks on Get Started link on Home "<option>" without sign in
    Then The user get alert message "You are not logged in"

    Examples: 
      | option         |
      | Datastructures |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |

  @Home2
  Scenario Outline: The user is on the Home page and click on dropdown without sign in
    Given The user is on Home Page
    When user clicks on Datastructures Dropdown "<option>"
    Then The user get alert message "You are not logged in"

    Examples: 
      | option     |
      | Arrays     |
      | Linkedlist |
      | Stack      |
      | Queue      |
      | Tree       |
      | Graph      |

  @Home3
  Scenario: The user is on the Home page and click on Register without sign in
    Given The user is on Home Page
    When user clicks on Register link
    Then The user gets redirected to Register Page

  @Home4
  Scenario: The user is on the Home page and click on Sign in
    Given The user is on Home Page
    When user clicks on Sign in link
    Then The user gets redirected to Signin Page

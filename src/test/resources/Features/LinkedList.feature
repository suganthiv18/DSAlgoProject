@LinkedList
Feature: User is on LinkedList page

  @LinkedList1
  Scenario: User navigated to Introduction page
    Given The user is on the Linked List page after logged in
    When The user clicks Introduction link
    Then The user should be directed to Introduction of Linked List Page

  @LinkedList2
  Scenario: User navigated to tryEditor page with Run button from Introduction page
    Given The user is on the Introduction after logged in
    When The user clicks Try Here button in the introduction page
    Then The user redirected to the page having an tryEditor with a Run button to test

  @LinkedList3
  Scenario Outline: The user run the code in tryEditor with valid input for Introduction page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should be presented with the Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @LinkedList4
  Scenario Outline: The user getting error message with invalid python code for Introduction page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @LinkedList5
  Scenario: User navigated to creating linked list page
    Given The user is on the Linked List page after logged in
    When The user clicks creating linked list link
    Then The user should be directed to Creating Linked List of Linked List Page

  @LinkedList6
  Scenario: User navigated to tryEditor page with Run button from Creating a Linked List page
    Given The user is on the Creating a Linked List after logged in
    When The user clicks Try Here button in the creating linked list page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @LinkedList7
  Scenario Outline: The user run the code in tryEditor with valid input for Creating a Linked List page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should be presented with the Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @LinkedList8
  Scenario Outline: The user getting error message with invalid python code for Creating a Linked List page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @LinkedList9
  Scenario: User navigated to Types of linked list page
    Given The user is on the Linked List page after logged in
    When The user clicks the Types of Linked List button
    Then The user should be directed to Types of Linked List of Linked List Page

  @LinkedList10
  Scenario: User navigated to tryEditor page with Run button from Types of Linked List
    Given The user is on the Types of Linked list after logged in
    When The user clicks Try Here button in the types of linked list page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @LinkedList11
  Scenario Outline: The user run the code in tryEditor with valid input for Types of Linked List
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should be presented with the Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @LinkedList12
  Scenario Outline: The user getting error message with invalid python code for Types of Linked List
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @LinkedList13
  Scenario: user navigated to Implementation linked list in python page
    Given The user is on the Linked List page after logged in
    When The user clicks the Implement Linked List in Python button
    Then The user should be directed to Implement Linked List in Python of Linked List Page

  @LinkedList14
  Scenario: User navigated to tryEditor page with Run button from Implement Linked List in Python page
    Given The user is on the Implement Linked List in Python after logged in
    When The user clicks Try Here button in the Implement linked list in python page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @LinkedList15
  Scenario Outline: The user run the code in tryEditor with valid input for Implement Linked List in Python page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should be presented with the Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @LinkedList16
  Scenario Outline: The user getting error message with invalid python code for Implement Linked List in Python page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @LinkedList17
  Scenario: user navigated to Traversal page
    Given The user is on the Linked List page after logged in
    When The user clicks the Traversal button
    Then The user should be directed to Traversal of Linked List Page

  @LinkedList18
  Scenario: User navigated to tryEditor page with Run button from Traversal page
    Given The user is on the Traversal after logged in
    When The user clicks Try Here button in the traversal page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @LinkedList19
  Scenario Outline: The user run the code in tryEditor with valid input for Traversal page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should be presented with the Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @LinkedList20
  Scenario Outline: The user getting error message with invalid python code for Traversal page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @LinkedList21
  Scenario: user navigated to Insertion page
    Given The user is on the Linked List page after logged in
    When The user clicks the Insertion button
    Then The user should be directed to Insertion of Linked List Page

  @LinkedList22
  Scenario: User navigated to tryEditor page with Run button from Insertion page
    Given The user is on the Insertion after logged in
    When The user clicks Try Here button in the Insertion page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @LinkedList23
  Scenario Outline: The user run the code in tryEditor with valid input for Insertion page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should be presented with the Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @LinkedList24
  Scenario Outline: The user getting error message with invalid python code for Insertion page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @LinkedList25
  Scenario: user navigated to Deletion page
    Given The user is on the Linked List page after logged in
    When The user clicks the Deletion button
    Then The user should be directed to Deletion of Linked List Page

  @LinkedList26
  Scenario: User navigated to tryEditor page with Run button from Deletion page
    Given The user is on the Deletion after logged in
    When The user clicks Try Here button in the Deletion page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @LinkedList27
  Scenario Outline: The user run the code in tryEditor with valid input for Deletion page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should be presented with the Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @LinkedList28
  Scenario Outline: The user getting error message with invalid python code for Deletion page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @LinkedList29
  Scenario: The user validating Practice Questions page
    Given The user is on the Linked List page after logged in
    When The user clicks Introduction link
    And The user clicks on the Practice Questions
    Then The user should be directed to Practice Questions of Linked List Page

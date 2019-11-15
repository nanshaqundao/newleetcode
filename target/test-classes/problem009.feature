Feature: palindrome number

  Scenario Outline: validate the function to convert String to Integer properly
    Given the input of test for problem-009 is "<inputInteger>"
    When run the palindrome number method
    Then the result of problem-009 should be "<expectedResult>"
    Examples:
      | inputInteger | expectedResult |
      | 123          | false          |
      | 121          | true           |
      | -121         | false          |
      | 00121        | true           |
      | +00121       | true           |
      | +00131       | true           |
      | -00131       | false          |
      | 1999999991   | true           |
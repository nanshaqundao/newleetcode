Feature: Container with Most Water

  Scenario Outline: validate the function to calculate Container with Most Water
    Given the input of problem 0011 is "<inputArray>"
    When run the maxArea
    Then the output of problem 0011 should be "<expectedInteger>"
    Examples:
      | inputArray        | expectedInteger |
      | 1,8,6,2,5,4,8,3,7 | 49              |


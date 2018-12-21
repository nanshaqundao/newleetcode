Feature: reverse integer

  Scenario Outline: validate the function to convert String to Integer properly
    Given the input of test for problem 007 is "<inputInteger>"
    When run the reverse method
    Then the result of problem 007 should be "<expectedInteger>"
    Examples:
      | inputInteger | expectedInteger |
      | 123          | 321             |
      | -123         | -321            |
      | 120          | 21              |
      | 1999999999   | 0               |
      | -1999999999  | 0               |
      | +00131       | 131             |
      | -00131       | -131            |
      | 1999999991   | 1999999991      |

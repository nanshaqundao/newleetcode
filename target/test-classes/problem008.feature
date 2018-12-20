Feature: String to Integer

  Scenario Outline: validate the function to convert String to Integer properly
    Given the input of test is "<stringContent>"
    When run the convert method
    Then the result should be "<integerContent>"
    Examples:
      | stringContent | integerContent |
      | 10            | 10             |
      | -433          | -433           |
      | 499 words     | 499            |
      | 9999999999    | 2147483647     |
      | -9999999999   | -2147483648    |
      | 333.33        | 333            |
      | good998       | 0              |
      | --10          | 0              |
      | -    10       | 0              |
      | -91283472332  | -2147483648    |
      | +1            | 1              |
      | +-2           | 0              |
      | -0012a42      | -12            |
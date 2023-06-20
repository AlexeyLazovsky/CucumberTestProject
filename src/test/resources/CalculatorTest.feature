@division_test
Feature: calculator addition tests

  Background: turn on calculator
    Given calculator app is up and running

  Scenario Outline: user tries to get result of two numbers addition
    Given calculator app is up and running
    When first number  equals <firstNum>
    And second number equals <secondNum>
    Then the result should be equal <expectedResult>
    Examples:
      | firstNum | secondNum | expectedResult |
      | 2        | 3         | 5              |
      | 500      | 500       | 1000           |
      | -500     | 500       | 0              |
      | 500      | 0         | 500            |



  Scenario Outline: user tries to get result of two numbers subtraction
    Given calculator app is up and running
    When first number  equals <firstNum>
    And second number equals <secondNum>
    Then the subtraction result should be <expectedResultSub>
    Examples:
      | firstNum | secondNum | expectedResultSub |
      | 2        | 3         | -1              |
      | 500      | 500       | 0           |
      | -500     | 500       | -1000             |
      | 500      | 0         | 500            |


  Scenario Outline: user tries to get result of two numbers multiplication
    Given calculator app is up and running
    When first number  equals <firstNum>
    And second number equals <secondNum>
    Then the multiplication result should be <expectedResultMult>
    Examples:
      | firstNum | secondNum | expectedResultMult |
      | 2        | 3         | 6                  |
      | 5        | 3         | 15                 |
      | 8        | 4         | 32                 |
      | 500      | 0         | 0                  |

  Scenario Outline: user tries to get result of two numbers division
    Given calculator app is up and running
    When first number  equals <firstNum>
    And second number equals <secondNum>
    Then the division result should be <expectedResultDiv>
    Examples:
      | firstNum | secondNum | expectedResultDiv |
      | 6        | 3         | 2                 |
      | 9        | 3         | 3                 |
      | 8        | 4         | 2                 |
      | 500      | 1         | 500               |



  Scenario Outline: user tries to get result of two numbers calculation
    Given calculator app is up and running
    When first number  equals <firstNum>
    And second number equals <secondNum>
    Then the <operation> calculate result should be <expectedResult>


    Examples:
      | firstNum | secondNum | operation | expectedResult |
      | 6        | 3         | "/"       | 2              |
      | 9        | 3         | "/"       | 3              |
      | 8        | 4         | "/"       | 2              |
      | 500      | 1         | "/"       | 500            |
      | 2        | 3         | "*"       | 6              |
      | 5        | 3         | "+"       | 8              |
      | 2        | 2         | "-"       | 0              |






















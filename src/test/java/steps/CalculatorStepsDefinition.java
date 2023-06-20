package steps;
import app.Calculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.* ;


public class CalculatorStepsDefinition {
   private Calculator calculator;
   int firstNum;
   int secondNum;

   @Given("calculator app is up and running")
   public void startCalculator() {
      calculator = new Calculator();
      System.out.println("app.Calculator was turned on");
   }


   @When("first number  equals {int}")
   public void firstNumberEquals(int num) {
      firstNum = num;
      System.out.println("The first num received is ");
   }

   @And("second number equals {int}")
   public void secondNumberEquals(int num) {
      secondNum=num;
      System.out.println("The second num received is ");
   }

   @Then("the result should be equal {int}")
   public void theResultShouldBeEqual(int expectedResult) {
      int actualResult = calculator.addTwoNumbers(firstNum, secondNum);
     Assertions.assertEquals(expectedResult, actualResult);

   }


   @Then("the subtraction result should be {int}")
   public void the_subtraction_result_should_be(int expectedResultSub) {
      int actualResultSub = calculator.subTwoNumbers(firstNum, secondNum);
    Assertions.assertEquals(expectedResultSub, actualResultSub);
   }

   @Then("the multiplication result should be {int}")
   public void the_multiplication_result_should_be(int expectedResultMult) {
      int actualResultSub = calculator.multiplyTwoNumbers(firstNum, secondNum);
      Assertions.assertEquals(expectedResultMult, actualResultSub);

   }

   @Then("the division result should be {int}")
   public void the_division_result_should_be(int expectedResultDiv) {
      int actualResultSub = calculator.divideTwoNumbers(firstNum, secondNum);
      Assertions.assertEquals(expectedResultDiv, actualResultSub);

   }

   @Then("the {string} calculate result should be {int}")
   public void the_calculate_result_should_be(String operation, int expectedResult) {
      int actualResult = calculator.calculate(firstNum, secondNum, operation);
      Assertions.assertEquals(expectedResult, actualResult);
   }



}


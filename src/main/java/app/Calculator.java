
package app;
public class Calculator {

    public int addTwoNumbers(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public int subTwoNumbers(int firstNum, int secondNum) {

        return firstNum - secondNum;
    }

    public int multiplyTwoNumbers(int firstNum, int secondNum) {

        return firstNum * secondNum;
    }

    public int divideTwoNumbers(int firstNum, int secondNum) {

        return firstNum / secondNum;
    }

    public int calculate(int numA, int numB, String type) {
        switch (type) {
            case "+":
                return addTwoNumbers(numA, numB);
            case "-":
                return subTwoNumbers(numA, numB);
            case "*":
                return multiplyTwoNumbers(numA, numB);
            case "/":
                return divideTwoNumbers(numA, numB);
            default:
                return addTwoNumbers(numA, numB);
        }


    }

}
package com.theironyard.installparty;
/**
 * Test Driven Development (TDD)
 * Write your tests first and watch them fail.
 * Then write the algorithm and watch the tests pass.
 */
public class Main {

    public static void main(String[] args) {
        ReversePolishCalc rpc = new ReversePolishCalc();



        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);


        // Write tests for the other operators (-, *, /)
        rpnExpression = "2.5,1.2,-";
        expectedResult = 1.3;
        actualResult = rpc.calculate((rpnExpression));
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "6,2,/";
        expectedResult = 3;
        actualResult = rpc.calculate((rpnExpression));
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "6,2,*";
        expectedResult = 12;
        actualResult = rpc.calculate((rpnExpression));
        checkResult(rpnExpression, expectedResult, actualResult);

//        rpnExpression = "6,2,5,+";
//        expectedResult = 13;
//        actualResult = rpc.calculate((rpnExpression));
//        checkResult(rpnExpression, expectedResult, actualResult);




        rpnExpression = "5,1,2,+,4,*,+,3,-";
       expectedResult = 14.0;
       actualResult = rpc.calculate(rpnExpression);
       checkResult(rpnExpression, expectedResult, actualResult);
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}

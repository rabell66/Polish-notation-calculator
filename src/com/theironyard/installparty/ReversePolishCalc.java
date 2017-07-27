package com.theironyard.installparty;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ReversePolishCalc {

    private static final Set<String> TOKENS = Collections.unmodifiableSet(new HashSet<>(Arrays.asList("+", "-", "*", "/")));
    // You'll need a variable here to keep track of the top of the stack
    private int x = 0;
    // The array of the input string split up
    private String[] tokens;

    // The stack
    private String[] stack;

    public double calculate(String input) {

        // 1. Use the String split method to split the string into tokens at the commas
        tokens = input.split(",");

        // 2. Allocate a stack as big as the number of tokens
        stack = new String[tokens.length];

        // 3. write the algorithm
        for(int i = 0; i < tokens.length; i++) {
            if(TOKENS.contains(tokens[i])) {

                double op2 = pop();

                System.out.println(x);
                double op1 = pop();
                double result = 0;
                String operator = tokens[i];
                System.out.printf("%S op1, %s op2 %s operator", op1, op2, operator);

                if (operator.equals("+")) result = op1 + op2;
                else if (operator.equals("-")) result = op1 - op2;
                else if (operator.equals("*")) result = op1 * op2;
                else if (operator.equals("/")) result = op1 / op2;



                push(result);



            }else

                push(tokens[i]);



        }

        // 4. return the result

        return pop();
    }

    private void push(String number) {
        // push on the stack
        stack[x] = number;
        x++;


    }

    private void push(double d) {
        stack[x++]=Double.toString(d); // change the double to a string and then push it on the stack

    }

    private double pop() {
        --x;
        double tempNumber = Double.parseDouble(stack[x]);

        stack[x] = null;

        return tempNumber;


        // remove the string from the top of the stack and convert it to a double and return it
    }
}
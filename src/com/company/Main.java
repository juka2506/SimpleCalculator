package com.company;

public class Main {

    public static void main(String[] args) {
        //Number Declarations
        double firstNumber;
        int secondNumber;
        double answer;

        //Number Initializing
        firstNumber = 5;
        secondNumber = 7;
        answer = 0;

        //Mathematical operator
        String operator = "-";

        if (operator.equals("+")) {
            answer = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            answer = firstNumber - secondNumber;
        } else if (operator.equals("*")) {
            answer = firstNumber * secondNumber;
        } else if (operator.equals("/")) {
            answer = firstNumber / secondNumber;
        }

        /*
        System.out.println(answer);

        int five = 5;
        five /= 2; // same as five = five / 2

        //Post-increment - increase by one AFTER
        System.out.println("Post-increment value: " + five ++);
        //Pre-increment - increase by one BEFORE
        System.out.println("Pre-increment value: " + ++five);

         */

        boolean sixLessThan = 6 < 8;
        boolean fiveGreaterThan = 5 > 9;

        // && - AND (both statements are true)
        // || -  OR (either of them is true)
        // ! - NOT
        // != NOT EQUALS - This checks for non-equality
        // == - EQUALS
        /*
        if (6 < 8 == 5 > 4) {
            System.out.println("EQUALS works");
        } else {
            System.out.println("EQUALS was skipped");
        }

        for (int i = 1; i <= 10; i++) {
            // Checks for even numbers
            //System.out.println(i + " modulo by 2 = " + i % 2);
            if(i % 2 == 0) {
                //System.out.println("Current even number: " + i);
            } else {
                System.out.println("Current odd number: " + i);
            }

        }

        int counter = 1;
        while (counter <= 10) {
            //System.out.println(counter);
            counter++;
        }

        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 10);
         */

        int minimum = Math.min(5, 200);
        System.out.println(minimum);
    }
}

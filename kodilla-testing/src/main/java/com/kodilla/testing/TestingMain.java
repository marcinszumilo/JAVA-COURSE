package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
// task from chapter 6.2

        Calculator calculator = new Calculator();

        int addResult = calculator.addCalculator(5,9);

        if (addResult == (5 + 9)) {
            System.out.println("add test OK");
        } else {
            System.out.println("add test error!");
        }

        int subResult = calculator.subCalculator(189,34);

        if (subResult == (189 - 34)) {
            System.out.println("substarction test OK");
        } else {
            System.out.println("substarction test error!");
        }
    }
}
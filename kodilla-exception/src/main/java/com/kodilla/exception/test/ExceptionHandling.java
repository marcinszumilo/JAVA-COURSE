package com.kodilla.exception.test;

public class ExceptionHandling {

    public void ExceptionSecondChallengeTester(double a , double b) throws Exception {
        SecondChallenge calculations = new SecondChallenge();
        try {
            calculations.probablyIWillThrowException(a , b);
        } catch (Exception e) {
            throw new Exception();
        }
    }
}

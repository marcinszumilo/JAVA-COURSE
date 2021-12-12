package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();


        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(" Calculation went OK with result : " + result);
        } catch (ArithmeticException e){
            System.out.println("This : " + e + " went wrong");
        } finally {
            System.out.println("I did some execption handling");
        }
    }
}
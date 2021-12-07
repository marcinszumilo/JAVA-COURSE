package com.kodilla.rps;

import java.util.Scanner;

public class userInputs {
    public static boolean choiceConfirmation(String inputString) {

        Scanner keyboardInput1 = new Scanner(System.in);
        String keyboardInputString1 = "";
        boolean result = false;

        while (!(keyboardInputString1.equals("y") || keyboardInputString1.equals("n"))) {
            System.out.println("Are you sure to " + inputString + "? (y/n)");
            keyboardInputString1 = keyboardInput1.nextLine();
            switch (keyboardInputString1) {
                case "y":
                    result = true;
                    break;
                case "n":
                    result = false;
                    break;
                default:
                    System.out.println("Can you repeat please?");
                    break;
            }
        }
        return result;
    }
    public static int userEntryToInteger(String inputString , int minValue , int maxValue){
        int result = -1;
        try {
            result = Integer.parseInt(inputString);
        }
        catch (NumberFormatException e)
        {
            result = -1;
        }
        if (result < minValue || result > maxValue) {
            result = -1;
        }
        return result;
    }
}

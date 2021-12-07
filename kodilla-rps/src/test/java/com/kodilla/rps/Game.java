package com.kodilla.rps;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        boolean end = false;
        Scanner keyboardInput = new Scanner(System.in);  // Create a Scanner object
        String gameStep = "Preparations";
        String keyboardInputString = "";
        String userName = "";
        Random randomNumber = new Random();
        int playerChoice = -1;
        int computerChoice = -1;
        int gameTotalWinningRounds = 0;
        int gameCurrentRound = 0;
        int playerWinnings = 0;
        int computerWinnings = 0;

// creating List of available Items

        List<Item> items = new ArrayList<>();
        items.add(new Item("Rock"));
        items.add(new Item("Paper"));
        items.add(new Item("Scissors"));

        while(!end) {
            switch (gameStep) {
                case "Preparations":
                    System.out.println("Welcome to Paper Rock and Scissors game");
                    System.out.println("Always to exit game enter : x");
                    gameStep = "EnterUserName";
                    break;
                case "EnterUserName":
                    System.out.println("Please Enter your name");
                    keyboardInputString = keyboardInput.nextLine();
                    userName = keyboardInputString;
                    if (userName.equals("x")) {
                        if (userInputs.choiceConfirmation("quit game")) {
                            gameStep = "exitGame";
                        }
                    }
                    else {
                        gameStep = "EnterNumberOfRounds";
                    }
                    break;
                case "EnterNumberOfRounds":
                    playerChoice = -1;
                    computerChoice = -1;
                    gameTotalWinningRounds = 0;
                    gameCurrentRound = 0;
                    playerWinnings = 0;
                    computerWinnings = 0;

                    while (gameStep.equals("EnterNumberOfRounds")) {
                        System.out.println("Please Enter number of winners to end game (1 - 10) ");
                        keyboardInputString = keyboardInput.nextLine();
                        gameTotalWinningRounds = userInputs.userEntryToInteger(keyboardInputString, 1, 10);
                        if (keyboardInputString.equals("x")) {
                            if (userInputs.choiceConfirmation("quit game")) {
                                gameStep = "exitGame";
                            }
                        }
                        else if (gameTotalWinningRounds != -1) {
                            gameStep = "itemUserInput";
                        }
                        else {
                            System.out.println("Please make correct choice");
                        }
                    }
                    break;
                case "itemUserInput":
                    playerChoice = -1;
                    computerChoice = -1;
                    gameCurrentRound += 1;
                    while (gameStep.equals("itemUserInput")) {
                        System.out.println("This is " + gameCurrentRound + " round of this game");
                        System.out.println("Please make your choice");
                        System.out.println("1 - Rock, 2 - Paper, 3 - Scissors, x - Exit Game, n - Start a new game");
                        keyboardInputString = keyboardInput.nextLine();
                        playerChoice = userInputs.userEntryToInteger(keyboardInputString, 1, 3) - 1;
                        if (keyboardInputString.equals("x")) {
                            if (userInputs.choiceConfirmation("quit game")) {
                                gameStep = "exitGame";
                            }
                        }
                        else if (keyboardInputString.equals("n")) {
                            if (userInputs.choiceConfirmation("start new game")) {
                                gameStep = "EnterNumberOfRounds";
                            }
                        }
                        else if (playerChoice >= 0){
                            gameStep = "itemComputerChoice";
                        }
                        else {
                            System.out.println("Please make correct choice");
                        }
                    }
                    break;
                case "itemComputerChoice":
                    computerChoice = randomNumber.nextInt(3 );
                    System.out.println("My random choice is : " + items.get(computerChoice).getItemName());
                    gameStep = "challenge";
                    break;
                case "challenge":
                    System.out.println("Your choice : " + items.get(playerChoice).getItemName() + " and my choice is : "
                            + items.get(computerChoice).getItemName());
                    System.out.println("Result of game is : " + items.get(playerChoice).challenge(items.get(computerChoice).getItemName()));

                    if (items.get(playerChoice).challenge(items.get(computerChoice).getItemName()).equals("You won")) {
                        playerWinnings += 1;
                    }

                    if (items.get(playerChoice).challenge(items.get(computerChoice).getItemName()).equals("I won")) {
                        computerWinnings += 1;
                    }
                    System.out.println("So far you won : " + playerWinnings + " games");
                    System.out.println("So far I won : " + computerWinnings  + " games");

                    if (playerWinnings == gameTotalWinningRounds || computerWinnings == gameTotalWinningRounds) {
                        gameStep = "gameEnd";
                    }
                    else {
                        gameStep = "itemUserInput";
                    }
                    break;
                case "gameEnd":
                    System.out.println("GAME OVER!!!");
                    if (playerWinnings == gameTotalWinningRounds) {
                        System.out.println("You won the whole game!");
                    }
                    else {
                        System.out.println("I won the whole game!");
                    }
                    System.out.println("Here you have some statistics :");
                    System.out.println("Total games played : " + gameCurrentRound);
                    System.out.println("You won : " + playerWinnings + " games");
                    System.out.println("I won : " + computerWinnings  + " games");
                    System.out.println("Do you want to play again?");
                    if (userInputs.choiceConfirmation("start new game")) {
                        gameStep = "EnterNumberOfRounds";
                    }
                    else {
                        gameStep = "exitGame";
                    }
                    break;
                case "exitGame":
                    System.out.println("Thank you for playing with me :)");
                    end = true;
                    break;
            }
        }
    }
}


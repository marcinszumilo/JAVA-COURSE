package com.kodilla.rps;

public class Item {

    private String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public String challenge (String inputItem) {
        if (itemName == inputItem) {
            return "Tie";
        }
        if ((itemName == "Rock" && inputItem == "Scissors") || (itemName == "Scissors" && inputItem == "Paper") ||
                (itemName == "Paper" && inputItem == "Rock")) {
            return "You won";
        }
        if ((itemName == "Scissors" && inputItem == "Rock") || (itemName == "Paper" && inputItem == "Scissors") ||
                (itemName == "Rock" && inputItem == "Paper")) {
            return "I won";
        }
        return "Error";
    }
}

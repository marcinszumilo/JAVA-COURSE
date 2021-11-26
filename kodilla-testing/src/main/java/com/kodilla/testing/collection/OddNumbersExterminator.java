package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {
    private ArrayList<Integer> listOfNumbers = new ArrayList<>();
    public OddNumbersExterminator (ArrayList<Integer> inputList) {
        this.listOfNumbers = inputList;
    }
    public List<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> listOfOddNumbers = new ArrayList<Integer>();
        for (Integer Item: numbers) {
            if (Item % 2 == 0){
                listOfOddNumbers.add(Item);
            }
        }
        return listOfOddNumbers;
    }
}

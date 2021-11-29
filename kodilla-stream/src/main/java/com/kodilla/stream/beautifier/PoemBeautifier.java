package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (String textToBeBeautiful, PoemDecorator beautifier) {
        String result = beautifier.decorate(textToBeBeautiful);
        System.out.println("Beautified text: " + result);
    }
}

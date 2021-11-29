package com.kodilla.stream;                                                   // [1]

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {                                                     // [3]

    public static void main(String[] args) {                                   // [4]
        PoemBeautifier beautifyExecutor = new PoemBeautifier();

        beautifyExecutor.beautify("Some text", (textToBeBeautiful) -> "ABC " + textToBeBeautiful + " ABC");
        beautifyExecutor.beautify("Some text", (textToBeBeautiful) -> textToBeBeautiful.toUpperCase());

        beautifyExecutor.beautify("Some text", (textToBeBeautiful) -> textToBeBeautiful + " : length is " + textToBeBeautiful.length());
        beautifyExecutor.beautify("Some text", (textToBeBeautiful) -> textToBeBeautiful.replace("e","Q"));
    }
}
package com.kodilla.stream.array;

import java.util.*;
import java.util.stream.*;

public interface ArrayOperations {
    static OptionalDouble getAverage(int[] numbers) {
            IntStream
                    .range(0 , numbers.length)
                    .map(n -> numbers[n])
//                    .mapToDouble(n -> double(n))
//                    .iterate(0 , n -> n + 1)
                    .forEach(System.out::println);
        return IntStream
                .range(0 , numbers.length)
                .map(n -> numbers[n])
                .average();
    }
}

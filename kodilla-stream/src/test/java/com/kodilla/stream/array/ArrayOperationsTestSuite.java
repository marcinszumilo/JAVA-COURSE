package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayOperationsTestSuite {

    @Test
    void testGetListUsingFor() {
        //Given
        int[] arrayOfIntegers = {5,8,1,2,5,0,9,5,8,3,2,7,9,44,33,11,8,40,357357};

        //When
        OptionalDouble resultAverage = ArrayOperations.getAverage(arrayOfIntegers);

        //Then
        assertEquals(OptionalDouble.of(18818.78947368421), resultAverage);
    }
}
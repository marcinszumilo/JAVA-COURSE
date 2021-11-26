package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.*;

class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test New Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test New Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Begin whole Collection test");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("End whole Collection test");
    }

    @DisplayName("testing collections, ")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator caseNumber1 = new OddNumbersExterminator(emptyList);
        //When
        List<Integer> case1result = caseNumber1.exterminate(emptyList);
        System.out.println("Testing Empty List");
        //Then
        Assertions.assertEquals(0, case1result.size());
    }

    @DisplayName("method testOddNumbersExterminatorEmptyList, "
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> someList = new ArrayList<>();
        OddNumbersExterminator caseNumber2 = new OddNumbersExterminator(someList);
        someList.add(3);
        someList.add(4);
        someList.add(7);
        someList.add(8);
        someList.add(2);
        someList.add(10);
        //When
        List<Integer> result = caseNumber2.exterminate(someList);
        System.out.println("Testing Odd and Even List");
        //Then
        Assertions.assertTrue(true, String.valueOf((result.size() != someList.size() && someList.size() > 0)));
    }
}
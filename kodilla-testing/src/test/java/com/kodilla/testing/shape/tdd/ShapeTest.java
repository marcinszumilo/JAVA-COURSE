package com.kodilla.testing.shape.tdd;

import com.kodilla.testing.forum.*;
import org.junit.jupiter.api.*;
import com.kodilla.testing.shape.*;

@DisplayName("TDD: SHape Test Suite")
class ShapeTest {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("Tests for shapes")
    class TestShapes {
        @Test
        void testAddShape() {
        }

        @Test
        void testRemoveShape() {
        }

        @Test
        void testGetFigure() {
        }
        @Test
        void testShowFigure() {
        }
    }
}
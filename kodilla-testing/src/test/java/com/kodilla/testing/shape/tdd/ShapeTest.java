package com.kodilla.testing.shape.tdd;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

@DisplayName("TDD: Shape Test Suite")
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
            //Given
            ArrayList<Shape> collectionOfShapesTest = new ArrayList<>();
            ShapeCollector classToBeTested = new ShapeCollector(collectionOfShapesTest);
            Shape circle = new Circle("Circle 1", "Field is 50 square cm");
            //When
            boolean result = classToBeTested.addFigure(circle);
            //Then
            Assertions.assertTrue(result && classToBeTested.getNumerOfFigures() == 1);
        }

        @Test
        void testRemoveShape() {
            //Given
            ArrayList<Shape> collectionOfShapesTest = new ArrayList<>();
            ShapeCollector classToBeTested = new ShapeCollector(collectionOfShapesTest);
            Shape circle = new Circle("Circle 1", "Field is 50 square cm");
            Shape circle1 = new Circle("Circle 2", "Field is 150 square cm");
            Shape triangle = new Circle("Big triangle", "Field is 111 square cm");
            Shape rectangle = new Circle("Old rectyangle", "Field is 1131 square cm");
            classToBeTested.addFigure(circle);
            classToBeTested.addFigure(circle1);
            classToBeTested.addFigure(triangle);
            classToBeTested.addFigure(rectangle);
            //When
            boolean result = classToBeTested.removeFigure(circle1);
            //Then
            Assertions.assertTrue(result && classToBeTested.getNumerOfFigures() == 3);
        }

        @Test
        void testGetFigure() {
            //Given
            ArrayList<Shape> collectionOfShapesTest = new ArrayList<>();
            ShapeCollector classToBeTested = new ShapeCollector(collectionOfShapesTest);
            Shape circle = new Circle("Circle 1", "Field is 50 square cm");
            Shape circle1 = new Circle("Circle 2", "Field is 150 square cm");
            Shape triangle = new Circle("Big triangle", "Field is 111 square cm");
            Shape rectangle = new Circle("Old rectyangle", "Field is 1131 square cm");
            classToBeTested.addFigure(circle);
            classToBeTested.addFigure(circle1);
            classToBeTested.addFigure(triangle);
            classToBeTested.addFigure(rectangle);
            //When
            Shape returnedFigure = classToBeTested.getFigure(2);
            //Then
            Assertions.assertEquals(returnedFigure, triangle);
        }
        @Test
        void testShowFigure() {
            //Given
            ArrayList<Shape> collectionOfShapesTest = new ArrayList<>();
            ShapeCollector classToBeTested = new ShapeCollector(collectionOfShapesTest);
            Shape circle = new Circle("Circle 1", "Field is 50 square cm");
            Shape circle1 = new Circle("Circle 2", "Field is 150 square cm");
            Shape triangle = new Circle("Big triangle", "Field is 111 square cm");
            Shape rectangle = new Circle("Old rectyangle", "Field is 1131 square cm");
            classToBeTested.addFigure(circle);
            collectionOfShapesTest.add(circle);
            classToBeTested.addFigure(circle1);
            collectionOfShapesTest.add(circle1);
            classToBeTested.addFigure(triangle);
            collectionOfShapesTest.add(triangle);
            classToBeTested.addFigure(rectangle);
            collectionOfShapesTest.add(rectangle);
            //When
            ArrayList<Shape> returnedListOfFigures= classToBeTested.showFigures();
            //Then
            Assertions.assertEquals(returnedListOfFigures, collectionOfShapesTest);
        }
    }
}
package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private ArrayList<Shape> collectionOfShapes = new ArrayList<>();

    public ShapeCollector (ArrayList<Shape> collectionOfShapes) {
        this.collectionOfShapes = collectionOfShapes;
    }
    public void addFigure(Shape shape) {
        collectionOfShapes.add(shape);
    }
    public void removeFigure(Shape shape) {
        collectionOfShapes.remove(shape);
    }
    public Shape getFigure(int n) {
        return collectionOfShapes.get(n);
    }
    public ArrayList<Shape> showFigures() {
        return collectionOfShapes;
    }
}

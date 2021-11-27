package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private ArrayList<Shape> collectionOfShapes = new ArrayList<>();

    public ShapeCollector (ArrayList<Shape> collectionOfShapes) {
        this.collectionOfShapes = collectionOfShapes;
    }
    public boolean addFigure(Shape shape) {
        boolean result = collectionOfShapes.add(shape);
        return result;
    }
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (collectionOfShapes.size() == 0 || collectionOfShapes.contains(shape)) {
            result = collectionOfShapes.remove(shape);
            return result;
        }
        return false;
    }

    public Shape getFigure(int n) {
        return collectionOfShapes.get(n);
    }
    public ArrayList<Shape> showFigures() {
        return collectionOfShapes;
    }

    public int getNumerOfFigures() {
        return collectionOfShapes.size();
    }
}

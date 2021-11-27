package com.kodilla.testing.shape;

public class Rectangle implements Shape{

    private String shapeName;
    private String field;

    public Rectangle(String shapeName, String field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public String getField() {
        return field;
    }

}

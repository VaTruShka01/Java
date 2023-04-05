package com.example.w23comp1008s1w10;

public class Rectangle {
    private double height, width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height == 0) {
            throw new IllegalArgumentException("cant be 0");
        }
        else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("can't be 0 or less");
        }
        this.width = width;
    }

    public boolean isSquare()
    {
        return false;
    }

    public double getArea()
    {
        return 0.0;
    }
}

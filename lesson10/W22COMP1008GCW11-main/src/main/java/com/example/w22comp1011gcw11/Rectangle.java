package com.example.w22comp1011gcw11;

public class Rectangle {
    private double width, height;

    public Rectangle(double width, double height) {
        setHeight(height);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    /**
     * The width must be greater than 0
     * @param width
     */
    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            throw new IllegalArgumentException("width must be greater than 0");
    }

    public double getHeight() {
        return height;
    }

    /**
     * The height must be greater than 0
     * @param height
     */
    public void setHeight(double height) {
        if (height > 0 && height<200)
            this.height = height;
        else
            throw new IllegalArgumentException("Height must be greater than 0");
    }

    /**
     * Returns true if the height and width are the same
     * @return
     */
    public boolean isSquare()
    {
        return height == width;
    }

    /**
     * This method returns the area of the rectangle
     * @return double representing the area
     */
    public double getArea()
    {
        return height * width;
    }

    /**
     * This is the length of all the sides added up
     * @return
     */
    public double getPerimeter()
    {
        return 2*width + 2*height;
    }
}


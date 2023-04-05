package com.example.w22comp1011gcw11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;
    private Rectangle square;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(30,20);
        square = new Rectangle(20,20);
    }

    @Test
    void setWidth() {
        square.setWidth(100);
        assertEquals(100, square.getWidth());
    }

    @Test
    void setWidthInvalid0() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            square.setWidth(0);
        });
    }

    @Test
    void setWidthInvalidNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            square.setWidth(-5);
        });
    }


    @Test
    void setHeight() {
        square.setHeight(100);
        assertEquals(100, square.getHeight());
    }

    @Test
    void setHeightInvalid0() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            square.setHeight(0);
        });
    }

    @Test
    void setHeightInvalidNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            square.setHeight(-5);
        });
    }

    @Test
    void setHeightRectangle() {
        double expected = 100;
        rectangle.setHeight(expected);
        assertEquals(expected, rectangle.getHeight());
    }

    @Test
    void setHeightInvalid0Rectangle() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            rectangle.setHeight(0);
        });
    }

    @Test
    void setHeightInvalidNegativeRectangle() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            rectangle.setHeight(-5);
        });
    }

    @Test
    void isSquare() {
        assertTrue(square.isSquare());
    }

    @Test
    void isSquareRectangle() {
        assertFalse(rectangle.isSquare());
    }

    @Test
    void getArea() {
        assertEquals(400, square.getArea());
    }

    //height was 30, width was 20 30*20 = 600
    @Test
    void getAreaRectangle() {
        assertEquals(600, rectangle.getArea());
    }


    @Test
    void getPerimeter() {
        assertEquals(80, square.getPerimeter());
    }

    @Test
    void getPerimeterRectangle() {
        assertEquals(100, rectangle.getPerimeter());
    }

    @Test
    void constructorInvalidHeight()
    {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Rectangle(10,0);
        });
    }

    @Test
    void constructorInvalidWidth()
    {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Rectangle(0,10);
        });
    }
}
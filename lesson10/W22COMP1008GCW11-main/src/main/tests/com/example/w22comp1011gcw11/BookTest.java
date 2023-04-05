package com.example.w22comp1011gcw11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book("Java 101", "Jaret Wright", "images/book.png",9.99);
    }

    @Test
    void setTitle() {
        book.setTitle("I love Java");
        assertEquals("I love Java", book.getTitle());
    }

    @Test
    void setTitleEmpty(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            book.setTitle("");
        });
    }

    @Test
    void setTitleSpaces(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            book.setTitle("      ");
        });
    }

    @Test
    void setTitleWithTrimming() {
        book.setTitle("    I love Java   ");
        assertEquals("I love Java", book.getTitle());
    }

    @Test
    void setAuthor() {
    }

    @Test
    void setImageLocation() {
    }

    @Test
    void setPrice() {
    }


    @Test
    void testToString() {
    }
}
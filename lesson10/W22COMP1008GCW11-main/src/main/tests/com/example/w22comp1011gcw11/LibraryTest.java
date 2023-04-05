package com.example.w22comp1011gcw11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;
    private Book book;

    @BeforeEach
    void setUp() {
        library = new Library("Jaret's Library","55 Happyvale Dr. Barrie");
        book = new Book("Java 101", "Jaret Wright", "images/book.png",9.99);
        library.addBook(book);
    }

    @Test
    void setLibraryName() {
    }

    @Test
    void setAddress() {
    }
}
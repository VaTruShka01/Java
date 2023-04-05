package com.example.w22comp1011gcw11;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private String libraryName, address;

    public Library(String libraryName, String address) {
        this.books = new ArrayList<>();
        this.libraryName = libraryName;
        this.address = address;
    }

    public void addBook(Book book)
    {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

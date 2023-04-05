package com.example.w22comp1011gcw11;

public class Book {
//

    private String title, author, imageLocation;
    private double price;

    public Book(String title, String author, String imageLocation, double price) {
        this.title = title;
        this.author = author;
        this.imageLocation = imageLocation;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString()
    {
        return title;
    }
}

package com.cmcglobal.Baitap4;


public class Book {
    // Private attributes
    private String title;
    private String author;
    private String isbn;
    public boolean isAvailable;

    // Constructor to initialize the Book object
    public Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    // Public method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    // Public method to check availability
    public boolean checkAvailability() {
        return isAvailable;
    }
}

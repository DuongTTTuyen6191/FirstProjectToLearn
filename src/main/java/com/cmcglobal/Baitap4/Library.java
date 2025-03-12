package com.cmcglobal.Baitap4;


public class Library {
    // Private attributes
    private Book[] books;
    private int bookCount;

    // Constructor to initialize the Library with a maximum capacity
    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }
    // Method to add a new book to the library
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full! Cannot add more books.");
        }
    }
    // Method to display all books in the library
    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books available");
            return;
        }
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookDetails();
            System.out.println("-----------------------------");
        }
    }

}
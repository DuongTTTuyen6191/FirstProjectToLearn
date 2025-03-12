package com.cmcglobal.Baitap4;


public class Main {
    public static void main(String[] args) {
        // Instantiate the Library class with a capacity of 5 books
        Library library = new Library(4);

        // Add some books to the library
        Book book1 = new Book("Thép Đã Tôi Thế Đấy1", "Nikolai A Ostrovsky", "1111", true);
        Book book2 = new Book("Thép Đã Tôi Thế Đấy2", "Nikolai A Ostrovsky", "2222", true);
        Book book3 = new Book("Thép Đã Tôi Thế Đấy 3", "Nikolai A Ostrovsky", "3333", false);
        Book book4 = new Book("Thép Đã Tôi Thế Đấy 4", "Nikolai A Ostrovsky", "4444", true);
        Book book5 = new Book("Thép Đã Tôi Thế Đấy 5", "HNikolai A Ostrovsky", "5555", false);
        Book book6 = new Book("Thép Đã Tôi Thế Đấy 6", "Nikolai A Ostrovsky", "6666", false);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);



        // Display all books in the library
        System.out.println("List of all books in the library:");
        library.displayAllBooks();
    }
}
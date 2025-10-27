package com.Rijul.day54;

// Book.java
public class Book {
    private String title;
    private String author;

    // Parameterized constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        System.out.println("Original Book:");
        book1.display();

        // Using the copy constructor
        Book book2 = new Book(book1);
        System.out.println("\nCopied Book:");
        book2.display();
    }
}

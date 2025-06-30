package com.example.challenges77__90.challenge80;

public class LibraryItem {
    protected int itemID;
    protected String title;
    protected String author;


    public LibraryItem(String author, int itemID, String title) {

        this.author = author;
        this.itemID = itemID;
        this.title = title;

    }

    protected void checkOut(){

        System.out.println("Check Out");

    }

    protected void returnBook(){

        System.out.println("Returning Items");

    }
}

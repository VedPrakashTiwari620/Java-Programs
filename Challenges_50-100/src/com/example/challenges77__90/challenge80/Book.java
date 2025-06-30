package com.example.challenges77__90.challenge80;

public class Book extends LibraryItem{
    private String isbn;

    int noOfBooks;



    public Book(String author, int itemID, String title, String isbn) {
        super(author, itemID, title);
        this.isbn = isbn;
        noOfBooks++;
    }

    @Override
    protected void checkOut() {
        if (!(noOfBooks==1)){
            System.out.println("The Book is already checkout.");
        }else {
            noOfBooks=0;
            System.out.println("Check Out.");
        }
    }

    @Override
    protected void returnBook() {
        if (noOfBooks==0) {
            noOfBooks++;
            System.out.println("Return Book Successfully.");
        }else {
            System.out.println("The Book is already return.");
        }
    }
}

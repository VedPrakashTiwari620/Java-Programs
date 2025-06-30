package com.example.challenges77__90.challenge80;

public class Magazine extends LibraryItem{
    private int issueNumber;

    public Magazine(String author, int itemID, String title, int issueNumber) {
        super(author, itemID, title);
        this.issueNumber = issueNumber;
    }
}

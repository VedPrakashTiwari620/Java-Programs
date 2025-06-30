package com.example.challenges77__90.challenge80;

public class DVD extends LibraryItem{

    private int duration;

    public DVD(String author, int itemID, String title, int duration) {
        super(author, itemID, title);
        this.duration = duration;
    }
}

package com.example.challenges77__90.challenge80;

public class Test {
    public static void main(String[] args) {
        Book b1= new Book("RK Sinha", 001, "Python","abc101");
        b1.checkOut();
        b1.checkOut();
        b1.returnBook();
        b1.checkOut();
        b1.checkOut();
        b1.checkOut();
        b1.returnBook();
        b1.returnBook();
        b1.returnBook();

    }
}

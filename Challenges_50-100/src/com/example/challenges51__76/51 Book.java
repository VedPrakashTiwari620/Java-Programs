package com.example.challenges51__76;

class Book {

    String author;
    String title;
    String isbn;
    static int totalNoOfBooks;
    boolean isBorrowed;



    static {
        totalNoOfBooks=0;
    }

    {
        totalNoOfBooks++;
    }

    Book(String author,String title,String isbn){
        this.isbn=isbn;
        this.title=title;
        this.author=author;

    }

    Book(String isbn){
        this("None","Unknown",isbn);
    }

    Book(String isbn,String title){
        this("None",title,isbn);
    }

    void borrowBook(){
        if (isBorrowed){
            System.out.println("Sry, this book isn't available Already borrowed by someone.");
        }else {
            isBorrowed=true;
            System.out.println("Enjoy the com.example.challenges51__76.Book,"+this.title);
        }
    }

    void returnBook(){
        if(isBorrowed){
            isBorrowed=false;
            System.out.println("Hope you enjoyed, please leave a review");
        }else {
            System.out.println("This book is already in the library.");
        }
    }

    static int getTotalBooks(){
        return totalNoOfBooks;
    }

    public static void main(String[] args) {
        Book b1=new Book("RK Agrawal","Java Fundamentals","ISBN01234");
        Book b2=new Book("RK Agrawal","Java Fundamentals","ISBN05434");
        Book b3=new Book("RK Agrawal","Java Fundamentals","ISBN14234");
        Book b4=new Book("RK Agrawal","Java Fundamentals","ISBN86104");
        Book b5=new Book("RK Agrawal","Java Fundamentals","ISBN54334");
        Book b6=new Book("RK Agrawal","Java Fundamentals","ISBN98234");

        b1.borrowBook();
        b2.borrowBook();
        b1.returnBook();
        System.out.println(Book.totalNoOfBooks);
        b2 .returnBook();
        System.out.println(Book.getTotalBooks());

    }
}

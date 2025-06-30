package com.example.challenges51__76;

import java.util.Scanner;

class FindAbsolute {
    int num;
    int numIs;
    static int no;

    static {
        System.out.println("The Class has been loaded into the JVM");
    }

    {
        no++;
        System.out.println("The "+no+" no object has created.");
    }

    FindAbsolute(){
        System.out.println("Default constructor called.");
    }

    FindAbsolute(int num){
        this.num=num;
        System.out.println("Parameterized Constructor called.");
    }

    public void absolute(){
        numIs=num<0?-num:num;
        System.out.println(numIs);
        System.out.println("Instance Method called");
    }




    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number to find absolute");

        int num=input.nextInt();
        FindAbsolute abs =new FindAbsolute();
        abs.absolute();
        FindAbsolute abs1 =new FindAbsolute(num);
        abs1.absolute();
        FindAbsolute abs2 =new FindAbsolute(num);
        abs2.absolute();



    }
}

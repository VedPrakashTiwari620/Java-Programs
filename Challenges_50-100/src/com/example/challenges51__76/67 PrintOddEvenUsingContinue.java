package com.example.challenges51__76;

class PrintOddEvenUsingContinue {

    static void printOdd(int n){
        for (int i = 1; i <=n; i++) {
            if(i%2==0){
                continue;
            }else {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }


    static void printEven(int n){
        for (int i = 1; i <=n; i++) {
            if(i%2==1){
                continue;
            }else {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to print all even and odd numbers between 1 to 50.");
        System.out.println("All Odd Numbers b/w 1 to 50.");
        printOdd(50);
        System.out.println("All Even Numbers b/w 1 to 50.");
        printEven(50);
    }
}

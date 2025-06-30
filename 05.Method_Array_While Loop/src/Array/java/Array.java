package Array.java;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[]={12,25,14,05,54,24,25,3,54,125,4,4,2,5};
        System.out.println("Welcome to Array element Searching");
        System.out.println("Enter the number you want to search");
        int num = input.nextInt();

        ArraySearching s1 = new ArraySearching();
        s1.arrSearch(arr,num);


    }
}

package com.example.challenges51__76;

import java.util.Scanner;

class UsingContSumPositive {

    static int[] inputArr(int size){
        Scanner input= new Scanner(System.in);
        int arr[]=new int[size];
        for (int i=0;i< arr.length;i++){
            arr[i]=input.nextInt();
        }
        return arr;
    }

    static int addPositiveNo(int arr[]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                continue;
            }else {
                sum+=arr[i];
            }

        }
        return sum;

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to adding positive numbers");
        System.out.println("Enter the size of the array");
        int size= input.nextInt();
        int arr[]=inputArr(size);
        int sum=addPositiveNo(arr);
        System.out.println("Sum of the all positive numbers is: "+sum);


    }
}

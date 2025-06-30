package com.example.challenges51__76;

import java.util.Scanner;

class OccurencesOfSpecificElement {

    static int findOccurence(int arr[],int k){
        int count=0;

        for (int i:arr) {
            if (i==k){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{1,2,2,3,3,3,4,4,5,5,6,6,7,7,7,7,7};
        System.out.println("Enter the element from the arra to find occurrences");
        Scanner input = new Scanner(System.in);
        int k=input.nextInt();
        int occur=findOccurence(arr,k);
        System.out.println("occurrences is of element  is :"+occur);
    }
}

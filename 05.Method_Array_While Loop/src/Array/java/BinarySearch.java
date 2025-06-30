package Array.java;

import java.util.Scanner;

public class BinarySearch{

    public static int binarySearch(int[] arr, int tar){
        int low = 0;
        int high = arr.length-1;

        while (low<high){
            int mid = (high+low)/2;
            if (arr[mid]>tar){
                high=mid-1;
            }else if (arr[mid]<tar){
                low = mid+1;
            }else{
                return mid;
            }
        }
        return -1;

    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(binarySearch(arr,9));

    }
}

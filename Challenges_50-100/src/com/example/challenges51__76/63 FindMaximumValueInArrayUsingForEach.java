package com.example.challenges51__76;

class FindMaximumValueInArrayUsingForEach {

    static int findMax(int arr[]){
        int ind=0;

        int max=Integer.MIN_VALUE;

        for (int i:arr){
            if (i>max){
                max=i;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int arr[]=new int[]{1,2,3,4,5,6,7};
        int max=findMax(arr);
        System.out.println("Maximum is "+max);

    }
}

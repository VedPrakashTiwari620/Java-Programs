package com.kgCoding.VarArgs;

public class VariableArgument {

    public static int sum(int a, int b){
        return a+b;
    }

//    public static int sum(int arr[]){
//        int sumE=0;
//        for (int i = 0; i < arr.length; i++) {
//            sumE+=arr[i];
//        }
//        return sumE;
//    }



    //Variable Argument method to sum
    public static int sum(int first, int sec, int... arr){
        int sumE=0;
        for (int i = 0; i < arr.length; i++) {
            sumE+=arr[i];
        }
        return sumE+first+sec;
    }

    public static void printString(String a, String b, String... c){
        System.out.print(a+" "+b+" ");
        for (String s : c) {
            System.out.print(s+" ");
        }
        System.out.println();
    }

    public static void main(String... args) {

        System.out.println(sum(1,2));

        int a[]={1,2,3,4};

        System.out.println(sum(1,1,1,1,1));





        //Variable Argument method call
        System.out.println(sum(1,1,1,1,1));


        System.out.println();
        printString("Ved","Prakash", "Tiwari");
    }
}

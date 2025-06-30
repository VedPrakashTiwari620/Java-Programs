package com.example.challenges51__76;

import java.util.Scanner;

class CheckStringPalindrome {

    static boolean isPalindrome(String str){
       if (str.length() <=1){
           return true;
       }
       int lastChar=str.length()-1;
       if (str.charAt(0)!=str.charAt(lastChar)){
           return false;
       }
        String newStr=str.substring(1,lastChar);
        return isPalindrome(newStr);
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Palindrome check ");
        System.out.println("Enter the string to be checked: ");

        String name=input.next();

        System.out.println("Your string is " + ((isPalindrome(name))?"Palindrome":"Not Palindrome"));

    }
}
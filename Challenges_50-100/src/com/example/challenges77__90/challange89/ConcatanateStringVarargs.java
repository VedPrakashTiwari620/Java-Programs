/**
 * Write a method concatenate Strings that takes variable arguments of String types and concatenate them into a single String.
 */
package com.example.challenges77__90.challange89;

public class ConcatanateStringVarargs {

    public static String concat(String... str){
        StringBuilder concatStr= new StringBuilder();

        for (String s : str) {
            concatStr.append(s);
        }


        return concatStr.toString();

    }

    public static void main(String[] args) {

        String concatanatedString = concat("Ved","Prakash","Tiwari");
        System.out.println(concatanatedString);

    }
}

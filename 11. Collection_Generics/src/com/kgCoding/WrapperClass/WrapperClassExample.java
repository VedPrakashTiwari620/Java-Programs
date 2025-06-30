package com.kgCoding.WrapperClass;

public class WrapperClassExample {
    public static void main(String[] args) {

        Integer a = Integer.valueOf(12);
        System.out.println("Integer Value of a : " + a);
        a=121;
        System.out.println("Integer Value of a : " + a);

        Integer a1 = Integer.valueOf("124");
        System.out.println("Converted String into Integer" + a1);

        String s1 = a1.toString();
        System.out.println("Converted Integer to String :"+ s1);


        //xxxValue() ---> Convert Object to Primitive

        int a2 = a;
        System.out.println("Primitive integer : "+ a2);



        double a3 = a.doubleValue();
        System.out.println("Converted Integer to double Primitive : "+a3);


        String s2 = "123";
        int a5 = Integer.parseInt(s2);
        System.out.println(a5);


        Integer num1 = 15;
        Integer num2 = 14;

        String string1 = "abc";
        String string2 = "abc";

        System.out.println(string1.equals(string2));


        System.out.println(num1.compareTo(num2));
        System.out.println();





    }
}

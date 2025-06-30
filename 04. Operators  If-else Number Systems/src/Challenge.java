import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



//        System.out.println("Here Floating Points Num Sum");
//        System.out.print("Enter 1st floating point number:-");
//        float a = input.nextFloat();
//        System.out.print("Enter 2nd floating point number:-");
//        float b = input.nextFloat();
//
//
//        System.out.println("The Sum of floating no is:-"+ (a+b));
//


//        *******************************************************************8



//        System.out.println("Perimeter of Triangle");
//
//        System.out.println("Enter the Length of Rectangle");
//        int a=input.nextInt();
//        int b=input.nextInt();
//        int c=input.nextInt();
//        int d=input.nextInt();
//
//        System.out.println("Perimeter Of the Rectangle is:-"+(a+b+c+d));
//
//*********************************************************************************
//
//
//        System.out.println("Area of Triangle");
//
//        System.out.println("Enter The base & Height");
//        double b = input.nextInt();
//        double h = input.nextInt();
//
//
//        double result = b*h/2;
//
//        System.out.println("The Area of the Triangle is:-"+ result+"cms");
//
//*******************************************************************************
//
//        System.out.println("Calculate Simple Interest");
//        System.out.print("Please enter the principle amount Rs");
//        int principle = input.nextInt();
//        System.out.println("Now tell me the Rate of Interest");
//        float rate= input.nextFloat();;
//        System.out.println("Now tell me for how many years are you borrowing the Amount");
//        float years = input.nextFloat();
//
//        float interest= (principle*rate*years)/100;
//
//        System.out.println("Your simple interest is:"+ interest);
//
//
//**********************************************************************************
//
//        System.out.println("Calculate compound interest");
//        System.out.println("Please enter the principle amount");
//        int principle = input.nextInt();
//        System.out.println("Now tell me the Rate of Interest");
//        float rate= input.nextFloat();;
//        System.out.println("Now tell me for how many years are you borrowing the Amount");
//        float years = input.nextFloat();
//
//        double compInt = principle * Math.pow((1 + rate / 100), years);
//
//        System.out.println("Your Compound Interest is:"+ compInt);
//
//
//
//************************************************************************************


        System.out.println("Welcome to Temperature Converter");
        System.out.println("Enter your Temperature in Farenheit");
        float fah = input.nextFloat();
        float cel = (fah - 32)*5/9;
        System.out.println("Your Temperature is"+ cel +" Cel");



    }
}

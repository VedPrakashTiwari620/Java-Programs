import java.util.Scanner;

public class Relational {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to The Driving Portal");
        System.out.print("Enter Your Age pls:-");
        int age = input.nextInt();

        if (age>=18){
            System.out.println("You are eligible for Applying Driving Licence");
        }
        else{
            System.out.println("You are NOt Eligible For Applying DL");
        }

//***************************************************************************


        System.out.println("Welcome to Voting");
        System.out.println("Pls Enter Your Age PLS:");


        if (age>=18){
            System.out.println("You are eligible for Voting");
        }
        else{
            System.out.println("You are not eligible For Voting");
        }





//*******************************************************************************

        System.out.println("Ticket Pricing(If Female Ticket price 50% off)");
        System.out.println("Enter your Name Pls:");
        String name = input.next();
        System.out.println("Gender If you are Male Type M , Female type F");
        char g = input.next().charAt(0);
        System.out.println("Ticket Price is 100rs");

        if (g=='F') {
            System.out.println("Hey " + name + " Your Ticket Price is " + (100 / 2) +" After 50% off");
        }
    }
}

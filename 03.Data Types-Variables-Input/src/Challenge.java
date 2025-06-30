import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name pls");
        String name = input.nextLine();
        System.out.println("Welcome "+ name + " to KG Coding");

        // Add two Numbers


        System.out.print("Enter the First Number:-");
        int first = input.nextInt();
        System.out.print("Enter the Second Number:-");
        int second = input.nextInt();
//        int sum=first+second;
        System.out.print("Sum of the two number is " + (first +second));

    }
}

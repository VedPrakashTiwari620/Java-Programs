import java.util.Scanner;
public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Ticket Discount Calculator");
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Are you Female? (True/False)");
        boolean isFemale = input.nextBoolean();


        if(age<5){
            System.out.println("You got 75% Discount");
        } else if (isFemale) {
            System.out.println("You got 50% Discount");
        } else if (age>60 && !isFemale) {
            System.out.println("You got only 25%");
        }else {
            System.out.println("You got no any Discount");
        }
    }
}

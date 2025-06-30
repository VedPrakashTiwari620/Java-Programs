import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Now we are playing a guesser game ");

        int number = 23;// Number which is Correct
        System.out.println("The Guesser Number B/W the range of 1 to 50");

        while (true){
            System.out.println("Please enter the number :");
            int num = input.nextInt();
            if (num>number){
                System.out.println("Your guessed number is greater than the number.");
            }else if (num<number){
                System.out.println("Your guessed number is less than the number.");
            }else {
                System.out.println("You nailed it.");
                break;
            }
        }



    }
}
import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd/Even Calculator");
        System.out.println("Please enter a number");
        int num = input.nextInt();


        if ((num & 1) == 1){
            System.out.println("Your number is Odd");
        }else {
            System.out.println("Your number is Even");
        }

    }
}

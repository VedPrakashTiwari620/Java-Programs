import java.util.Scanner;

public class ChallengePositiveNegativeZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Checker");
        System.out.println("Please enter your Number");
        int num = input.nextInt();

        if (num>0){
            System.out.println("The entered number"+num+" is Positive");
        } else if (num<0) {
            System.out.println("The entered number"+num+" is Negative");
        } else if (num==0) {
            System.out.println("The entered number"+num+" is Zero");
        }else {
            System.out.println("Please enter a valid Number");
        }


    }
}

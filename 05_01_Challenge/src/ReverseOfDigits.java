import java.util.Scanner;

public class ReverseOfDigits {

    public static void reversee(int num){
        int digits=0;
        while (num>0){
            digits=num%10;
            num/=10;
            System.out.print(digits);
        }
        System.out.println();
    }

    public static int reverse(int num){
        int digit;
        int newNum=0;
        while (num>0){
            digit=num%10;
            num/=10;
            newNum=newNum*10+digit;
        }
        return newNum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse the digits of a numb Program");
        System.out.println("Enter the two or more digit numbers");
        int num= input.nextInt();

        reversee(num);
        System.out.println(reverse(num));
    }
}

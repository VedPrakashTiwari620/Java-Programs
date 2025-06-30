import java.util.Scanner;

public class Palindrome {

    public static void palindrome(int num){
        int reverse=reverseDigit(num);
        if (reverse==num) System.out.println("The "+num+" is Palindrome");
        else System.out.println("The "+num+" is Not Palindrome");
    }
    public static int reverseDigit(int num){
        int digit;
        int result=0;
        while (num>0){
            digit=num%10;
            result=result*10+digit;
            num/=10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Palindrome Check");
        System.out.println("Hey, User Pls Enter the Number which you want to check");
        int num=input.nextInt();

        palindrome(num);
    }
}

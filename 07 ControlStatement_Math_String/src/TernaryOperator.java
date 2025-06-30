import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to number checker");
        System.out.println("Enter your first number");
        int a= input.nextInt();
        System.out.println("Enter your second number");
        int b= input.nextInt();

        int gr=a>b?a:b;
        System.out.println(gr);


    }
}

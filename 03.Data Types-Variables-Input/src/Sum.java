import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Here is Addition of two numbers");
        System.out.print("Enter the First number:-");
        int first= input.nextInt();
        System.out.print("Enter the Second number:-");
        int Second = input.nextInt();
        System.out.println("Sum of the two Numbers is "+ (first+Second));

    }
}

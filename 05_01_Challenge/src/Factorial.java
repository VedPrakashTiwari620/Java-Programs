import java.util.Scanner;

public class Factorial {
    public static long factorial(int num){
        if (num <2){
            return 1;
        }
        long fact=1;
        for (int i=1;i<=num;i++){
            fact*=i;
        }
//        int i = 2;
//        while (i<=num){
//            fact*=i;
//            i++;
//        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Calculates Factorial");
        System.out.println("Enter the number");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        System.out.println("Factorial is "+factorial(num));

    }
}

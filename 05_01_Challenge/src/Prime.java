import java.util.Scanner;

public class Prime {
    public static void isPrime(int num){
        int count=0;
        for (int i=1;i<=num;i++){
            if (num%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println(num+" This is prime Number");
        }else {
            System.out.println("This number not a Prime Number");
        }
    }

    public static void isPrimee(int num){
        boolean prime=primeCheck(num);
        if (prime) System.out.println("This is Prime Number");
        else System.out.println("This number not a Prime Number");
    }

    public static boolean primeCheck(int num){
        if (num<2){
            return false;
        }
        int i=2;
        while (i<num){
            if (num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Check whether a Number is Prime or not");

        System.out.println("Pls Enter the Number");
        int num= input.nextInt();

        isPrime(num);
        isPrimee(num);
    }
}

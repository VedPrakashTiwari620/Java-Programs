import java.util.Scanner;

public class FibonacciSeries {

    public static void fibonacci(int num)
    {   if (num<0)return;
        System.out.print("0 ");
        if (num==0)return;
        System.out.print("1 ");

        int first = 0, second = 1;
        for (int i=3;i<=num;i++){
            int third= first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Print Fibonacci Series");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a certain number to print the Fibonacci Series");
        int num= input.nextInt();

        fibonacci(num);

        var num1 = 15;
        var str = "Ved";
        var chare = 'A';
        var qwe = 1267.2144;
    }
}

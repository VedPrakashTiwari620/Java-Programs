import java.util.Scanner;

public class SumOfAllOdd {

    public static int oddSum(int num){
        int sum=0;
        int i=1;
        while (i<=num){
            sum+=i;
            i+=2;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum");
        System.out.println("Enter your Number");
        int num=input.nextInt();
        System.out.println("Sum of all Odd from 1 to "+num+" "+oddSum(num));



//        System.out.println("Sum of all Integers b/w 1 to 100");
//        int sum=0;
//        for (int i=0;i<=500;i++){
//            if (i%2!=0){
//                sum+=i;
//            }
//        }
//        System.out.println(sum);
    }
}

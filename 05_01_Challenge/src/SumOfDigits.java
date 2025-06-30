import java.util.Scanner;

class SumOfDigit{

    public int sumOfD(int num){
        int sum=0;
        while (num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}

public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println("Welcome to the Sum of Digits");
        System.out.println("Enter the Number");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();

        SumOfDigit obj = new SumOfDigit();
        int sum= obj.sumOfD(num);
        System.out.println(sum);

    }

}

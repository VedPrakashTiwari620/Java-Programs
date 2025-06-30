import java.util.Scanner;

public class Armstrong {

    public static boolean isArmstrong(int num) {   // Armstrong means 153    153 total digit=3    1@3 + 5@3 + 3@3  == 153  if = then it is an armstrong
        int numCopy=num;
        int digits=numberOfDigits(num);
        int finalNumber=0;

        while (num>0){
            int lastDigit = num%10;
            num/=10;
            finalNumber+=pow(lastDigit,digits);
        }
        return finalNumber == numCopy;
    }

    public static int pow(int num1, int num2){
        int result = 1;
        int i=0;
        while (i<num2){
            result*=num1;
            i++;
        }
        return result;
    }

    public static int numberOfDigits(int num){
        int digits=0;
        while (num>0){
            digits++;
            num=num/10;
        }
        return digits;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to checking a number is Armstrong or Not");
        System.out.println("Enter the Number");
        int num= input.nextInt();

        boolean isArmstrong=isArmstrong(num);
        if (isArmstrong){
            System.out.println("This is an Armstrong");
        }else {
            System.out.println("This is Not an Armstrong");
        }
    }
}

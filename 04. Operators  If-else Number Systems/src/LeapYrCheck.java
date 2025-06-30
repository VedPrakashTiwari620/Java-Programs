import java.util.Scanner;

public class LeapYrCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Check Given Year is Leap Year or Not");
        System.out.println("Pls enter the year that you want to check");
        int year = input.nextInt();

        if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
            System.out.println("The entered year is Leap Year");
        }else {
            System.out.println("The entered Year is Not a Leap year");
        }
    }
}

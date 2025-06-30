import java.util.Scanner;

public class GreatestOfThreeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Greatest of the three Numbers");
        System.out.println("Enter the 1st No:");
        int a = input.nextInt();
        System.out.println("Enter the 2nd No:");
        int b = input.nextInt();
        System.out.println("Enter the 3rd No:");
        int c = input.nextInt();


        if (a >= b && a >= c){
            System.out.println("The 1st Number"+ a +" is Greater.");
        } else if (b >= c && b >= a) {
            System.out.println("The 2nd Number"+ b +" is Greater.");
        }else {
            System.out.println("The 3rd Number"+ c +"is Greater");
        }
    }
}

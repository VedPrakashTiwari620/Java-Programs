import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 1; //initialization

        while (num <= 10){ //conditions
            System.out.println(num); //actual work
            num++; // update

        }

        int count = 500;
        while (count >= 200){
            System.out.println(count);
            count--;
        }

        int i = 0;
        while (i<20){
            int abc = input.nextInt();
            System.out.println("Enter a Number");
        }
    }
}

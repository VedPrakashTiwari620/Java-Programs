import java.util.Scanner;

public class Pattern {

    public static void rightTraingle(int row){
        for (int i=0;i<row;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void leftTraingle(int row){
        for (int i=0;i<row;i++){
            for (int j=0;j<row-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to pattern printing");
        System.out.println("Enter th no. of Rows");
        int row= input.nextInt();

        rightTraingle(row);
        leftTraingle(row);


    }
}

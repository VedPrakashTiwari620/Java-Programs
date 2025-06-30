import java.util.Scanner;

public class ArrayElementCheck {
    public static void main(String[] args) {
        //Take m and n input from the user and m*n integer inputs and print
        /*
        no of positive numbers
        no of negative numbers
        no of odd numbers
        no of even numbers
        no of Zero 0

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row size of arrays");
        int m=input.nextInt();
        System.out.println("Enter the column size of arrays");
        int n=input.nextInt();


        int arr[][]=new int[m][n];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=input.nextInt();
            }
        }
        int sumP=0;
        int sumN=0;
        int sumO=0;
        int sumE=0;
        int sumZ=0;

        for (int i[]:arr){
            for (int j:i){
                if (j>0){
                    sumP++;
                }
                if (j<0) {
                    sumN++;
                }
                if (j%2!=0) {
                    sumO++;
                }
                if (j%2==0) {
                    sumE++;
                }
                if (j==0){
                    sumZ++;
                }
            }
        }
        System.out.println(sumP);
        System.out.println(sumN);
        System.out.println(sumO);
        System.out.println(sumE);
        System.out.println(sumZ);

    }
}

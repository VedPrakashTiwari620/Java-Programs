import java.util.Scanner;

public class PrintAboveSecondaryDiagonal {
    public static void main(String[] args) {
        /*
        Write a program to print the elements above the secondary diagonal elements
         */
        Scanner input= new Scanner(System.in);
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

//        for (int i = 0; i < m; i++) {
//            for (int j = n-1; j > n-1-i; j--) {
//                System.out.print(arr[i][j]+" ");
//            }
//        }
        for(int i=0; i<n; i++){
            for(int j=n-i; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
}

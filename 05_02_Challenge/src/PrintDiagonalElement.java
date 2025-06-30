import java.util.Scanner;

public class PrintDiagonalElement {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of 2D array row*column");
        int m=input.nextInt();


        int arr[][]=new int[m][m];

        for (int i=0;i<m;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=input.nextInt();
            }
        }

        for (int i=0;i<m;i++){
            for (int j=0;j<m;j++){
                if (i==j || i+j==m-1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j=0;j<m;j++){
                if (j==m/2 || i==m/2){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}

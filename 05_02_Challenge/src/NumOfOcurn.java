import java.util.Scanner;

public class NumOfOcurn {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to find the number of occurrences of an element in an array");
        int arr[]=ArrayUtility.inputArray();
        System.out.println("Enter the number you want to find");
        int num= input.nextInt();
        ArrayUtility.print(arr);
        ArrayUtility.numOccur(arr,num);


    }

}

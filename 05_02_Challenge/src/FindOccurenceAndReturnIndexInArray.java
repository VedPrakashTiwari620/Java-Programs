import java.util.Scanner;

public class FindOccurenceAndReturnIndexInArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int arr[]=ArrayUtility.inputArray();
        System.out.println("Enter the element to find");
        int num=input.nextInt();

        int noOcc=ArrayUtility.numOccur1(arr,num);
        System.out.println(noOcc);


        int newArr[]=ArrayUtility.returnInd(arr,noOcc, num);
        ArrayUtility.print(newArr);


    }

}

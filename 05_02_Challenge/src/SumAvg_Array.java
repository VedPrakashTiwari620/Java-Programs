import java.util.Scanner;

public class SumAvg_Array {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum And Avg of Array Element");

        int arr[]=ArrayUtility.inputArray();
        int sum=ArrayUtility.sumArrEle(arr);
        System.out.println(sum);
        int avg = ArrayUtility.avgArrEle(arr);
        System.out.println("The avg of the array element is "+avg);
    }
}

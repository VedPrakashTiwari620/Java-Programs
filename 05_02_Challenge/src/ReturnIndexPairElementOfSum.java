import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReturnIndexPairElementOfSum {
    static int returnPari(int[] arr, int target){
       int pair=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
               if(arr[i]+arr[j]==target) pair++;
            }
        }
        System.out.println(pair);
        return pair;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int arr[]=ArrayUtility.inputArray();
        System.out.println("Enter the target sum:");
        int target=input.nextInt();

        ArrayList<int[]> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans.add(new int[]{i, j});
                }
            }
        }

        for (int[] pair : ans) {
            System.out.println(Arrays.toString(pair));
        }
        }
    }

import java.util.*;
class Solution {

    public int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int count=0;


       while(i<j){
           if (arr[i]+arr[j]==target){
               count++;
               j--;
           }else if (arr[i]+arr[j]>target){
               j--;
           }else{
               i++;
           }

       }
        return count;
    }
}
public class Prct {
    public static void main(String[] args) {
        int arr[]={1, 5, 7, -1, 5};
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        Solution s=new Solution();
        System.out.println(s.countPairs(arr,6));

    }
}

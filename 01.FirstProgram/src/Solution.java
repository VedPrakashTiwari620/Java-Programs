import java.util.*;

class Solution {
    public static List<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> numList = new ArrayList<>();


        Arrays.sort(arr);


        for(int i=0;i<arr.length-1;i++){

            if(arr[i]==arr[i+1]){
                if (!numList.contains(arr[i])){
                    numList.add(arr[i]);
                }

            }
        }
        return numList;
    }

    public static void main(String[] args) {
        int a[] = {1,2,2,3,3,3,4,4,5};
        ArrayList<Integer> numList ;
        numList = (ArrayList<Integer>) findDuplicates(a);

        for (Integer i : numList) {
            System.out.print(i + " ");
        }

    }

}
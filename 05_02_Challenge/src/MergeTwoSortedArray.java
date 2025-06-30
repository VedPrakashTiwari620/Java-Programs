public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[]=ArrayUtility.inputArray();
        int arr2[]=ArrayUtility.inputArray();
        int mergeArr[]=ArrayUtility.mergeArr(arr1,arr2);
        ArrayUtility.print(mergeArr);
    }
}

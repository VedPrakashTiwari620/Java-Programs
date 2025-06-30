public class Add_Two_Matrices {
    public static void main(String[] args) {
        int arr1[][]=ArrayUtility.inputTwoDArray();
        ArrayUtility.printTwoDArray(arr1);
        int arr2[][]=ArrayUtility.inputTwoDArray();
        ArrayUtility.printTwoDArray(arr2);
        int arr3[][]=ArrayUtility.sumOfTwoDArray(arr1,arr2);
        System.out.println("The Sum of The Element Of Two 2DArray");
        ArrayUtility.printTwoDArray(arr3);
    }
}

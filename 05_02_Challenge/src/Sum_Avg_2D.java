public class Sum_Avg_2D {
    public static void main(String[] args) {
        int arr[][]=ArrayUtility.inputTwoDArray();
        ArrayUtility.printTwoDArray(arr);
        int sumOf2DArr=ArrayUtility.sumTwoD(arr);
        System.out.println("Sum of the Arr is "+sumOf2DArr);
        int avgOf2DArr=ArrayUtility.avgTwoD(arr);
        System.out.println("Avg of the Arr is "+avgOf2DArr);
    }
}

public class SumOfTwoDiagonalElement {
    public static void main(String[] args) {
        int arr[][]=ArrayUtility.inputTwoDArray();
        ArrayUtility.printTwoDArray(arr);
        int sum = ArrayUtility.sumOfDiagElem(arr);
        System.out.println("Sum of Diagonal Element is :"+sum);
    }
}

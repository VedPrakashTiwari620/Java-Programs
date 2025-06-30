public class IsSorted {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sorting Check");
        int arr[]=ArrayUtility.inputArray();

        boolean isInc= ArrayUtility.isIncreasing(arr);
        boolean isDec= ArrayUtility.isDecreasing(arr);

        if (isInc||isDec) {
            ArrayUtility.print(arr);
            if (isInc) {
                System.out.println("The array element is sorted in Incr.");
            }
            if (isDec){
                System.out.println("The array element is sorted in Decr.");
            }
        }else {
            System.out.println("The array element is not sorted");
        }
    }
}

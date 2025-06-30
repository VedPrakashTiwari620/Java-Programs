public class PalindromeArrayCheck {
    public static void main(String[] args) {
        int arr[]=ArrayUtility.inputArray();
        boolean isPalin=ArrayUtility.isPalindrome(arr);
        if (isPalin){
            System.out.println("The array is Palindrome ");
        }else {
            System.out.println("The array is Not Palindrome ");
        }
    }
}

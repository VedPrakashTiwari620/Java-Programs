import java.util.Scanner;

public class ArrayUtility {
    Scanner input = new Scanner(System.in);




    //To take element of the array
    public static int[] inputArray (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size= input.nextInt();

        int arr[]=new  int[size];
        int i=0;

        System.out.println("Please enter the element of the array");
        while(i<size){
            arr[i]=input.nextInt();
            i++;
        }
        return arr;
    }



    //Sum of the Array  Element
    public static int sumArrEle(int arr[]){
        int i=0;
        int sum=0;
        while (i<arr.length){
            sum+=arr[i];
            i++;
        }
        return sum;
    }



    //Find the average of Array element
    public static int avgArrEle(int arr[]){
        int sum=sumArrEle(arr);
        int avg= sum/arr.length;
        return avg;
    }



    //Element Occurrence int array(How many times )
    public static void numOccur(int arr[],int num){
        int no=0;
        int i=0;

        while (i<arr.length){
            if (arr[i]==num){
                no++;
            }
            i++;
        }
        System.out.println("Your no "+ num +" is found "+ no +" times in array.");

    }
    //Element Occurrence int array(How many times )
    public static int numOccur1(int arr[],int num){
        int no=0;
        int i=0;

        while (i<arr.length){
            if (arr[i]==num){
                no++;
            }
            i++;
        }
        return no;

    }



    //Print the array element
    public static void print(int arr[]){
        int i=0;
        System.out.println("Your array element is ");
        while (i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
    }



    //Find Minimum element in the array
    public static void minimum(int arr[]){
        int i=0;
        int min=Integer.MAX_VALUE;
        while (i<arr.length){
            if (arr[i]<min){
                min=arr[i];
            }
            i++;
        }
        System.out.println("The Minimum array in the element in the Array is "+min);
    }


    //Find Maximum element in the array
    public static void maximum(int arr[]){
        int i=0;
        int max=Integer.MIN_VALUE;
        while (i<arr.length){
            if (arr[i]>max){
                max=arr[i];
            }
            i++;
        }
        System.out.println("The Maximum array in the element in the Array is "+max);
    }


    //Checking Decreasing
    public static boolean isIncreasing(int arr[]){
        int i=1;
        while (i<arr.length){
            if (arr[i]<arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    //Checking Decreasing
    public static boolean isDecreasing(int arr[]){
        int i=1;
        while (i<arr.length){
            if (arr[i]>arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }



    //Delete an element and return the array
    public static int []rerurnArray (int arr[]){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Number you want to delete");
        int num=input.nextInt();
        int i=0;
        int no=0;
        int j=0;
        while (i<arr.length){
            if (arr[i]==num){
                no++;
            }
            i++;
        }
        if (no==0){
            System.out.println("The no is Not Found");
            return arr;
        }

        int newArr[]=new int[arr.length-no];

        for (i=0;i<arr.length;i++){
            if (arr[i]!=num){
                newArr[j]=arr[i];
                j++;
            }
        }
        return newArr;
    }


    //Revere an Array Element
    public static int[] reverseArray(int arr[]) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = temp;
        }
        return arr;
    }


    //Palindrome Check
    public static boolean isPalindrome(int arr[]){
       for (int i=0;i<arr.length/2;i++){
           if (arr[i]!=arr[(arr.length-1)-i]){
               return false;
           }
       }
        return true;
    }




    //Merge two sorted Array
    public static int[] mergeArr(int arr1[], int arr2[]){
        int mergeArr[]=new int[(arr1.length)+(arr2.length)];

        int i=0;
        int j=0;
        int k=0;
        while (i<arr1.length || j<arr2.length){
            if (j == arr2.length || (i<arr1.length && arr1[i]<arr2[j])) {
                mergeArr[k]=arr1[i];
                k++;
                i++;
            }else {
                mergeArr[k]=arr2[j];
                k++;
                j++;
            }
        }
        return mergeArr;
    }


    //Input Two D Array
    public static int[][] inputTwoDArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of an 2D Array");
        int size = input.nextInt();
        int twoDArray[][]= new int[size][size];

        System.out.println("Enter the Element of the Array");
        for (int i=0;i<twoDArray.length;i++){
            for (int j=0;j<twoDArray[i].length;j++){
                twoDArray[i][j]=input.nextInt();
            }
            System.out.println();
        }

        return twoDArray;
    }


    //Printing 2D Array Element
    public static void printTwoDArray(int arr[][]){
        for (int n[]:arr){
            for (int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }


    //Searching in 2D Array
    public static void searchTwoD(int arr[][]){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the no you want to search");
        int num = input.nextInt();

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==num){
                    System.out.println("The num is found at ind "+i+" "+j);
                    return;
                }
            }
        }
        System.out.println("The number is not found.");
    }



    //Sum and Avg of 2D Array
    public static int sumTwoD(int arr[][]){
        int sum=0;
        for (int n[]:arr){
            for (int m:n){
                sum+=m;
            }
        }
        return sum;
    }



    //Avg of 2 d Array

    public static int avgTwoD(int arr[][]) {
        int sum = sumTwoD(arr);
        int size=(arr.length*arr.length);
        return sum/size;
    }



    // Sum Of Diagonal Element

    public static int sumOfDiagElem(int arr[][]){
        int sum = 0;
        int ind=arr.length/2;

        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (i==j || i+j==arr.length-1){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }




    // Sum of twoD Array element
    public static int[][] sumOfTwoDArray(int arr1[][], int arr2[][]){
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j< arr1[i].length;j++){
                arr1[i][j]+=arr2[i][j];
            }
        }
        return arr1;
    }



    public static int[] returnInd(int arr[],int noOcc,int num){

        int newArr[]=new int[noOcc];
        int j=0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]==num){
                newArr[j++]=i;
            }
        }
        return newArr;
    }




    public static int[] returnArrWithInd(int arr[], int sum){

        int no1=0;

        for (int i=0;i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i]+arr[j]==sum){
                    no1+=2;
                }

            }
        }
        System.out.println(no1);



        int newArr[]=new int[no1];

        int k=0;
        for (int i=0;i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==sum){
                    newArr[k++]=i;
                    newArr[k]=j;

                }
            }
        }
    return newArr;
    }
}

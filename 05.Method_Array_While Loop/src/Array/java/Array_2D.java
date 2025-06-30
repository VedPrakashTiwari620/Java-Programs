package Array.java;

public class Array_2D {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        System.out.println(arr.length);
        int myArr[][]=new int[3][3];
        myArr[0][0]=1;
        myArr[0][1]=2;
        myArr[0][2]=3;

        myArr[1][0]=4;
        myArr[1][1]=5;
        myArr[1][2]=6;

        myArr[2][0]=7;
        myArr[2][1]=8;
        myArr[2][2]=9;

        int i=0;
        while (i< myArr.length){
            int j=0;
            while (j< myArr[i].length){
                System.out.print(myArr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }


    }


}

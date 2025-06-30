package Array.java;

public class ArraySearching {
    public void arrSearch(int a[], int num){
        int isFound=arrIndex(a,num);
        if (isFound==0){
            System.out.println("The number is not found");
        }
        else {
            System.out.println("The element is found in th array at index "+isFound);
        }
    }
    public int arrIndex(int a[], int num){
        int index=0;
        for (int i=0;i<a.length;i++){
            if (a[i]==num){
                index=i;
                return i;
            }
        }
        return 0;
    }
}

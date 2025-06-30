import java.util.Arrays;

public class MergeTwoArr_Find_Elem {

        public static int kthElement(int a[], int b[], int k) {
            // code here
            int c[]= new int[a.length+b.length];

            int j=0;

            for(int i=0;i<a.length;i++){
                c[j]=a[i];
                j++;
            }
            for (int i=0;i<b.length;i++){
                c[j]=b[i];
                j++;
            }

            Arrays.sort(c);
            System.out.println(c[0]);
            return c[0];
        }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={3,4,5};
        kthElement(a,b,4);
    }
}
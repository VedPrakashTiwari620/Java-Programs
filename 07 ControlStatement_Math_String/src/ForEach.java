public class ForEach {
    public static void main(String[] args) {
        String names[]=new String[]{"Ram","Sohan","Sita","Geeta"};


        for(String name:names){
            System.out.println(name);
        }


        int arr[]=new int[]{1,2,3,4,5,6,7};

        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}

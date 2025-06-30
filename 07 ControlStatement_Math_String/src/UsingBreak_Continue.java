public class UsingBreak_Continue {
    public static void main(String[] args) {

        //print even number b/w 0 to 10
        int i=0;
        while(i<=10){

            i++;
            if (i%2==1){
                continue;
            }
            System.out.print(i);

        }

        //print 1 to 10
        i=1;
        while (i<=100){
            if(i<=10){
                System.out.print(i);
            }else {
                break;
            }
            i++;
        }



        System.out.println();


        for (i=1;i<100;i++){
            System.out.print(i+" ");
            if (i==50){
                break;
            }
        }
        System.out.println();

        for (i=1;i<25;i++){
            if (i%5==0){
                continue;
            }
            System.out.print(i+" ");
        }

    }
}

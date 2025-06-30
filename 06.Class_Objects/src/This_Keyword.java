class This{
    int roll;

    public This take(int roll){
        this.roll=roll;
        return this;
    }

    public void print(){

        System.out.println("Roll no is "+roll);
    }

}
public class This_Keyword {

    public static void main(String[] args) {
        This t1= new This();
        t1.take(216).print();







    }
}

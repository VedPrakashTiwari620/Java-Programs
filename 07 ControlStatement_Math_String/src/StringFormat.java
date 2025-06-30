public class StringFormat {
    public static void main(String[] args) {
        String name="Ved Prakash Tiwari";
        int marks=93;

        System.out.println("Hello, "+name+" your marks are: "+marks);

        System.out.printf("Hello, %S Your marks are: %d  %b %x",name,marks,12>23,10);
 
        System.out.printf("'%(0,15d'",-123457890);
    }
}

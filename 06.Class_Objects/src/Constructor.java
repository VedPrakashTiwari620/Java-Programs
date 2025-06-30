public class Constructor {

    int roll;

    public Constructor take(int roll){
        this.roll=roll;
        return this;
    }

    Constructor(){
        System.out.println("Default constructor Called");
    }

    Constructor(char sec,int roll){
        System.out.println("Parameterized Constructor Called");
        System.out.println("Section: "+sec+"Roll no is "+roll);
    }




    public static void main(String[] args) {
        Constructor c1 = new Constructor('A',216);

    }
}

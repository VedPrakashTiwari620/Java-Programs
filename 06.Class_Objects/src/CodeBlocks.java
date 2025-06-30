
class CodeBlocks {

    static {
        System.out.println("Class has been loaded. This will be run only one time when the class is loaded into the JVM First time.");
    }



    {

        System.out.println("This is initialization block INIT Block. \n This is a Code Blocks.  Which will be run every time when the any object creation.");
    }


    public static void main(String[] args) {
        CodeBlocks c1= new CodeBlocks();
        CodeBlocks c2= new CodeBlocks();

    }
}

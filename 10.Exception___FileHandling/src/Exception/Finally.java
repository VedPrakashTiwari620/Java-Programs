package Exception;

public class Finally {
    public static void main(String[] args) {
        try {
            try {
                int a = 1 / 0;
            }catch (IllegalArgumentException e){
                System.out.println("Something caught");
            }finally {
                System.out.println("Not quite finally");
            }

        }catch (ArithmeticException ex){
            System.out.printf("%s",ex.getMessage());
            throw ex;
        }finally {
            System.out.println("Finally");
        }
    }
}

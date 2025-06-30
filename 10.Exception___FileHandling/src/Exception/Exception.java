package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    static void stName(String name) throws IllegalArgumentException{
        if (name.contains("-")){
            throw new IllegalArgumentException("Name contains -");
        }
        System.out.println(name);
    }


    private static void a(){
        b();
    }
    private static void b(){
        c();
    }
    private static void c(){
        d();
    }
    private static void d(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator");
        System.out.println("Please enter your two numbers: ");
        int first=input.nextInt();
        int second=input.nextInt();


        try{


            int result=first/second;
            System.out.printf("Result is %d",result);

        }catch (InputMismatchException exception){
            System.out.printf("%s",exception.getMessage());
//            System.out.println("Divide by 0, enter a valid values.");
        }catch (IndexOutOfBoundsException exc){
            System.out.println("Array Index out of Bound Exception");
        }catch (Throwable th){
            System.out.println("Multiple Exception");
            throw th;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name to print.");
        String name = input.nextLine();
        stName(name);


        a();


    }
}

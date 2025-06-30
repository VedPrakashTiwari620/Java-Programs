import java.util.Random;
import java.util.Scanner;

public class Cars {


    //These all are instance variable

    int price;
    int puchaseYear;
    static int noOfWheels;
    String colours;
    float maxSpeed;
    float currentFuelInLitres;

    Cars(){
        this(2000000,"Black");
        currentFuelInLitres=12;
    }

    Cars(int price, String colours){
        this.colours=colours;
        this.price=price;
    }


    public Cars start(){
        if(currentFuelInLitres<0){
            System.out.println("Car is out of fuel. Car can't Start.");
        }else if(currentFuelInLitres<5){
            System.out.println("Car is in reserved mode, please refuel.");
        }else {
            System.out.println("Car is Started.");
        }
        return this;
    }

    public void drive(){
            System.out.println("Car is driving.");
            currentFuelInLitres--;
    }

    public void addFuel(float currentFuelInLitres){
        this.currentFuelInLitres+=currentFuelInLitres;
    }


    public float getCurrentFuel(){
        System.out.println("The current fuel litres in the car is ");
        return currentFuelInLitres;
    }


    //Finalize method

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("I am in finalize. ");
//    }




    public static void main(String[] args) {
//        Random sc = new Random();
//        int r= sc.nextInt(0,3);
//        System.out.println(r);


        Cars.noOfWheels=4;  //Statics Variable

        Cars swift= new Cars();

        System.out.println(swift.currentFuelInLitres);
//        Cars dezire= new Cars(200000,"Black");
//        System.out.println(dezire.colours);
//        System.out.println(dezire.price);






        swift.price=200000;  //Instance Variable


//        swift.addFuel(10.0f);
        swift.start().drive();
//        Cars started = swift.start();
//        started.drive();
        System.out.println(swift.getCurrentFuel());
    }
}

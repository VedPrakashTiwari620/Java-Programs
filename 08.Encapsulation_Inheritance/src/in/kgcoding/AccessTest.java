package in.kgcoding;

public class AccessTest {
    public static void main(String[] args) {
        Car swift = new Car("Red",1200000,15.5,"Swift");
//        swift.colour="Red";
//        swift.model="Maruti";
        swift.costOfPurchase=1100000;
//        swift.fuelLevel=12.5;

        System.out.println(swift);
    }
}

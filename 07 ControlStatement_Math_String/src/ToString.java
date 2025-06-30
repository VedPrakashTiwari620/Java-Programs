class Car{
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String model;
    String company;
    String name;

    public Car() {

    }

    public Car(String company, int maxSpeed, String model, int noOfDoors, int noOfWheels, String name) {
        this.company = company;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.noOfDoors = noOfDoors;
        this.noOfWheels = noOfWheels;
        this.name=name;

    }


//    @Override
//    public String toString() {
//        return "Car{" +
//                "company='" + company + '\'' +
//                ", noOfWheels=" + noOfWheels +
//                ", noOfDoors=" + noOfDoors +
//                ", maxSpeed=" + maxSpeed +
//                ", model='" + model + '\'' +
//                ", name='" + name + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("company='").append(company).append('\'');
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", model='").append(model).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", noOfWheels=").append(noOfWheels);
        sb.append('}');
        return sb.toString();
    }
}
public class ToString {
    public static void main(String[] args) {
        Car swift=new Car("Maruti",180,"2024",4,4,"Swift");
//        System.out.println(swift.toString());
        System.out.println(swift.toString());

        Car c1 =new Car();
        System.out.println(c1);


    }
}

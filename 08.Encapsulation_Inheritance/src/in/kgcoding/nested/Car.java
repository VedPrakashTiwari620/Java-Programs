package in.kgcoding.nested;

public class Car {
    private String model;

    public void repair(){
        Tyre t = new Tyre();
    }
    protected class Tyre{
        private double width;
        private double pressor;
        private String material;


        public void modelS(){
            model="Maruti";
        }
    }
}

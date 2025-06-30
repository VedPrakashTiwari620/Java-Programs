package com.example.challenges51__76;

class UsingMathPI {
    int rad;
    double areaOfCircle;
    double circumOfCircle;

    public UsingMathPI(int rad) {
        this.rad = rad;
    }

    public double area(){
        areaOfCircle=Math.pow(rad,2)*Math.PI;
//        System.out.printf("Area of circle: %f",areaOfCircle);
    return areaOfCircle;
    }

    public double circumference(){
        circumOfCircle=2*Math.PI*rad;
//        System.out.printf("Area of circle: %f",circumOfCircle);
        return circumOfCircle;
    }

    @Override
    public String toString() {
        return "Circle Radius:"+rad+", Area: "+area()+", Circumferences: "+circumference();
    }

    public static void main(String[] args) {
        UsingMathPI cal1= new UsingMathPI(7);
        System.out.println(cal1);
        UsingMathPI cal2= new UsingMathPI(6);
        System.out.println(cal2);
    }
}

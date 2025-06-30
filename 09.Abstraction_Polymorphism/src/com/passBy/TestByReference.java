package com.passBy;

public class TestByReference {


    public static void main(String[] args) {
        Point point= new Point(4,8);
        System.out.println(point.toString());
        move(point);
        System.out.println(point.toString());
    }


    public static void move(Point p){
        p.x++;
        p.y++;
    }


    public static class Point{

        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }


        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }
}

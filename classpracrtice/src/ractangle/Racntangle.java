package ractangle;

public class Racntangle {
    double withdrwa;
    double length;

    public Racntangle(double length, double withdrwa) {
        this.length = length;
        this.withdrwa = withdrwa;
    }

    public double getArea(){
        return this.length * this.withdrwa;
    }

    public  double  getCircumference(){
        return this.length*2 + this.withdrwa*2;
    }

}

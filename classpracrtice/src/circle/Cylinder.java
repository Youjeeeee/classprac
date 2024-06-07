package circle;

public class Cylinder {
    public Cylinder(Circle circle, double height) {
        this.circle = circle;
        this.height = height;
    }

    Circle circle;
    double height;

    public double getVolume(){

        double radi = circle.getArea() * height;

        return radi;

    }


}

package BTAccessModifier;

public class Circle {
    double radius = 1.0;
    String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*2*Math.PI;
    }

    public double getRadius() {
        return radius;
    }
}

package circleandcylinder;

public class Circle {
    double radius;
    String color;

    public Circle() {
        radius = 2;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return " Circle co ban kinh: "
                + getRadius()
                + " va mau: "
                + getColor()
                + " dien tich la: "
                + getArea();
    }
}

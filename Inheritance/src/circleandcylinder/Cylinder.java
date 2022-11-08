package circleandcylinder;

public class Cylinder extends Circle {
    double height;

    public Cylinder() {
        height = 5;
    }

    public Cylinder(double radius, String color, double height) {
        this.radius = radius;
        this.color = color;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return 2*Math.PI*this.radius*(this.radius+this.height);
    }

    @Override
    public String toString() {
        return " Cylinder co ban kinh: "
                + getRadius()
                + " , chieu cao: "
                + getHeight()
                + " va mau sac la: "
                + getColor()
                + " dien tich la : "
                + getArea()
                + super.toString();
    }
}

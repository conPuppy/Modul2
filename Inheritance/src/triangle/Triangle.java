package triangle;

import java.util.Scanner;

public class Triangle {
    double side1 = 1;
    double side2 = 1;
    double side3 = 1;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        Scanner scanner = new Scanner(System.in);
        while (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1 || side1==0 || side2==0 || side3==0) {
            System.out.println("Khong la tam giac");
            System.out.println("Hay nhap lai side 1");
            side1 = scanner.nextDouble();
            System.out.println("Nhap lai side 2:");
            side2 = scanner.nextDouble();
            System.out.println("Nhap lai side 3:");
            side3 = scanner.nextDouble();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", P=" + getPerimeter() +
                ", S=" + getArea() +
                '}';
    }
}

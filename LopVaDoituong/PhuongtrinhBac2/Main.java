package PhuongtrinhBac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation quadraticEquation= new QuadraticEquation();
        System.out.print("Nhap he so a: ");
        quadraticEquation.setA(scanner.nextDouble());
        System.out.print("Nhap he so b: ");
        quadraticEquation.setB(scanner.nextDouble());
        System.out.print("Nhap he so c: ");
        quadraticEquation.setC(scanner.nextDouble());

        System.out.println(quadraticEquation.getA()+"* x^2 "+ quadraticEquation.getB()+"*x"+ quadraticEquation.getC()+"= 0");
        if(quadraticEquation.getDiscriminant()<0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if(quadraticEquation.getDiscriminant()==0) {
            System.out.println("Phuong trinh co nghiem nhu sau: "+quadraticEquation.getRoot1());
        } else {
        System.out.println("Phuong trinh co nghiem nhu sau: "+quadraticEquation.getRoot1());
        System.out.println("Phuong trinh co nghiem nhu sau: "+quadraticEquation.getRoot2());
        }
    }
}

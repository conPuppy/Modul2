package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x+b=0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        if(a!=0) {
            double ketqua = -b/a;
            System.out.println("x = " + ketqua);
        } else {
            if(b==0) {
                System.out.println("phuong trinh vo so nghiem");
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        }

    }
}

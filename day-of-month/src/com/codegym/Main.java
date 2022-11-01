package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Kiểm tra số ngày trong tháng");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("Tháng" + month+ "có: 31 ngày " );
                break;
            case 2:
                System.out.println("Tháng" + month+ "có: 28 hoặc 29 ngày " );
                break;
            case 3:
                System.out.println("Tháng" + month+ "có: 31 ngày " );
                break;
            case 4:
                System.out.println("Tháng" + month+ "có: 30 ngày " );
                break;
            case 5:
                System.out.println("Tháng" + month+ "có: 31 ngày " );
                break;
            case 6:
                System.out.println("Tháng" + month+ "có: 30 ngày " );
                break;
            case 7:
                System.out.println("Tháng" + month+ "có: 31 ngày " );
                break;
            case 8:
                System.out.println("Tháng" + month+ "có: 31 ngày " );
                break;
            case 9:
                System.out.println("Tháng" + month+ "có: 30 ngày " );
                break;
            case 10:
                System.out.println("Tháng" + month+ "có: 31 ngày " );
                break;
            case 11:
                System.out.println("Tháng" + month+ "có: 30 ngày " );
                break;
            case 12:
                System.out.println("Tháng" + month+ "có: 31 ngày " );
                break;
        }
    }
}

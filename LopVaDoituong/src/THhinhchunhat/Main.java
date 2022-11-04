package THhinhchunhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter width: ");
        int width= scanner.nextInt();
        System.out.print("Enter height: ");
        int height= scanner.nextInt();
        HinhChuNhat hinhchunhat=new HinhChuNhat(width,height);
        System.out.println("Hinh chu nhat \n"+ hinhchunhat.display());
        System.out.println("Dien tich hinh chu nhat \n"+hinhchunhat.getArea());
        System.out.println("Chu vi hinh chu nhat \n"+ hinhchunhat.getPerimeter());
    }
}

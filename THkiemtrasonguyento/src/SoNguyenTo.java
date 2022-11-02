import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number<2) {
            System.out.println(number + "khong la so nguyen to");
        }
        if(number>2) {
            boolean check= true;
            for (int i = 2; i <= Math.sqrt(number) ; i++) {
                if(number%i==0) {
                    check=false;
                    break;
                }
            }
            if (check) {
                System.out.println(number + " la so nguyen to");
            } else System.out.println(number + " khong la so nguyen to");
        }
    }
}

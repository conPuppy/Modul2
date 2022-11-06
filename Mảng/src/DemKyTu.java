import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String string = scanner.nextLine();
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int dem = 0;
        System.out.print("\n"+"Nhap ky tu muon kiem tra: ");
        String x = scanner.nextLine();

        for (int i = 0; i < array.length; i++) {
            if (x.toCharArray()[0] == array[i]) {
                dem++;
            }
        }
        System.out.print("Ky tu "+x+" xuat hien "+dem+" lan trong chuoi");
    }
}


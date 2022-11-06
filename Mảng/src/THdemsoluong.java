import java.util.Scanner;

public class THdemsoluong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soluong;
        do {
            System.out.println("Nhap so luong sinh vien muon nhap diem: ");
            soluong = scanner.nextInt();
            if (soluong > 30) {
                System.out.println("Khong nhap duoc qua 30 sinh vien: ");
            }
        }
        while (soluong > 30);
        int[] diemSinhvien = new int[soluong];

        for (int i = 0; i < soluong; i++) {
            System.out.print("Nhap diem sinh vien " + (i + 1) + " : " + "\n");
            diemSinhvien[i] = scanner.nextInt();
        }
        for (int i = 0; i < soluong; i++) {
            System.out.print("Diem sinh vien " + (i + 1) + ": " + diemSinhvien[i] + "\n");
        }
        int dem = 0;
        for (int i = 0; i < soluong; i++) {
            if (diemSinhvien[i] >= 5) {
                dem++;
            }
        }
        System.out.print("Co " + dem + " sinh vien da thi do!");
    }
}

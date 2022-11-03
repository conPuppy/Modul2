import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap size mang 1: ");
        int size1 = scanner.nextInt();
        int[] a = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < size1; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.print("\n" + "Nhap size mang 2: ");
        int size2 = scanner.nextInt();
        int[] b = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Nhap b[" + i + "]: ");
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < size2; i++) {
            System.out.print(b[i] + "\t");
        }
        int size3 = size1 + size2;
        int[] c = new int[size3];
        for (int i = 0; i < size1; i++) {
            c[i] = a[i];
        }
        for (int i = a.length; i < size3; i++) {
            c[i] = b[i - a.length];
        }
        System.out.print("\n"+"Gop mang 1 va mang 2 ta duoc: "+"\n");
        for (int i = 0; i < size3; i++) {
            System.out.print(c[i]+"\t");
        }
    }
}

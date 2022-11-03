import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) {
        int size;
        double[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Khong duoc lon hon 20 phan tu");
            }
        }
        while (size > 20);

        array = new double[size];
        System.out.println("Nhap vao day: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        double max = array[0];
        int i = 0;
        while (i < array.length) {
            if (max < array[i]) max = array[i];
            i++;
        }
        int j = 0;
        while (j < array.length) {
            if (max == array[j]) {
                System.out.println("Max = " + max + " o vi tri: " + j);
                j++;
            }
        }
    }
}

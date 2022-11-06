import java.util.Arrays;
import java.util.Scanner;

public class BTtimMin {
    public static void main(String[] args) {
        System.out.print("Nhap size cua mang: " + "\t");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap a[" + i + "]: " + "\t");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang: " + Arrays.toString(array) + "\t");
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        System.out.print("Min is: " + min + " o vi tri: " + index);

    }
}

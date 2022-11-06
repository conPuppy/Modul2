import java.util.Arrays;
import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap size mang da chieu: ");
        int size = scanner.nextInt();
        int[][] array = new int[size][];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhap size mang array["+i+"]: ");
            int sizea= scanner.nextInt();
            array[i]= new int[sizea];
            for (int j = 0; j < sizea; j++) {
                System.out.print("Nhap array["+i+"]["+j+"]"+"\t");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.print("Nhap so cot muon tinh tong: ");
        int column= scanner.nextInt();
        int sum=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(column==j) {
                    sum+=array[i][j];
                }
            }
        }
        System.out.println("Tong cot "+column+" la: "+ sum);
    }
}

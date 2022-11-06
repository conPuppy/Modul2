import java.util.Arrays;
import java.util.Scanner;

public class SumDuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap kich thuoc ma tran vuong: ");
        int size = scanner.nextInt();
        int[][] matran = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhap phan tu matran ["+i+"]["+j+"]: ");
                matran[i][j]= scanner.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(matran[i]));
        }
        int sum=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==j) {
                    sum+=matran[i][j];
                }
            }
        }
        System.out.println("Tong duong cheo chinh cua ma tran la: "+ sum);
    }
}

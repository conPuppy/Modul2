import java.util.Scanner;

public class Xoa {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] b= new int[a.length-1];
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap vi tri can xoa: ");
        int index= scanner.nextInt();
        for(int i=0;i<b.length;i++) {
            if(i<index) b[i]=a[i];
            else b[i]=a[i+1];
            System.out.print(b[i]);
        }
    }
}

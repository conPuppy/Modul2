import java.util.Scanner;

public class Them {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap size mang: ");
        int size= scanner.nextInt();
        int[] a= new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap a["+i+"]: ");
            a[i]= scanner.nextInt();
        }
        System.out.println("Before:");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println("\n"+"Nhap vi tri muon them: ");
        int index= scanner.nextInt();
        int[] b= new int[size+1];
        System.out.println("Nhap so muon them: ");
        int number= scanner.nextInt();
        for (int i = 0; i < b.length; i++) {
            if(i<index) b[i]=a[i];
            if(i==index) b[i]=number;
            if(i>index) b[i]=a[i-1];
        }
        System.out.println("After: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+"\t");
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class MaxManghaichieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap size mang hai chieu: "+"\n");
        int size = scanner.nextInt();
        int[][] array = new int[size][];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhap size mang array["+i+"]: "+"\n");
            int sizea= scanner.nextInt();
            array[i]= new int[sizea];
            for (int j = 0; j < sizea; j++) {
                System.out.print("Nhap array["+i+"]["+j+"]"+"\t");
                array[i][j]= scanner.nextInt();
            }
            System.out.println(Arrays.toString(array[i])+"\t");
        }
        String string= "";
        for (int i = 0; i < array.length; i++) {
            string += Arrays.toString(array[i]);
        }
        System.out.print(string+"\t");

        int max= array[0][0];
        int indexi=0;
        int indexj=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(max<array[i][j]) {
                    max= array[i][j];
                    indexi=i;
                    indexj=j;
                }
            }
        }
        System.out.println("Max is: "+max+" o vi tri array["+indexi+"]["+indexj+"]");
    }
}

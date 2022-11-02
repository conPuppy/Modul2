import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        char c = '*';
        String b = " * ";
        switch (a) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print(b);
                    }
                    System.out.println('\n');
                }
                break;
            case 2:
                String s = "";
                for (int i = 6; i > 0; i--) {
                    s += c;
                    System.out.println(s);
                }
                break;
            case 3:
//                for(int i=1;i<=5;i++) {
//                    for(int j=4;j>=i;j++) {
//                        System.out.println(" ");
//                    }
//                    for(int j=1;j<=i;j++) {
//                        System.out.println("*");
//                    }
//                    System.out.println("\n");
//                }
        }
    }
}

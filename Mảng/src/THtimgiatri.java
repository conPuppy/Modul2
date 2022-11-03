import java.util.Scanner;

public class THtimgiatri {
    public static void main(String[] args) {
        String[] list= {"Linh", "Phuong" ,"Tien", "Cuong", "Ngat"};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter name: ");
        String name= scanner.nextLine();
        boolean check= false;
        for (int i = 0; i < list.length; i++) {
            if(name.equals(list[i])) {
                System.out.println(name + " o vi tri "+i);
                check=true;
                break;
            }
        }
        if(!check)
        {System.out.println("Khong co ten!");
        }
    }
}

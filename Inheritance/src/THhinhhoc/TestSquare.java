package THhinhhoc;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(4);
        System.out.println(square);

        square = new Square(5,"blue",false);
        System.out.println(square);
    }
}

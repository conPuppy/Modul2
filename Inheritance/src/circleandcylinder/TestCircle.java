package circleandcylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("blue");
        System.out.println(circle);

        circle = new Circle(5,"red");
        System.out.println(circle);
    }
}

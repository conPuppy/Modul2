package BTAccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        double r = circle.getRadius();
        double c = circle.getArea();
        System.out.println(r);
        System.out.println(c);
    }
}

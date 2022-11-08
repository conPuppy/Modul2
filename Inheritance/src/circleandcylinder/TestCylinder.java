package circleandcylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setColor("black");
        System.out.println(cylinder);

        cylinder = new Cylinder(6,"yellow",10);
        System.out.println(cylinder);
    }
}

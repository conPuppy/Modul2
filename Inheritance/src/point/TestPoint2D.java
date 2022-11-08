package point;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX(15);
        point2D.setY(10);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}

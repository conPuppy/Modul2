package pointandmove;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(10.5f);
        point.setY(15.5f);
        System.out.println(point);
        point.setXY(5.5f,9.5f);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));
    }
}

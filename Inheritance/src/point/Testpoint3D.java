package point;

import java.util.Arrays;

public class Testpoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setX(12);
        point3D.setY(18);
        point3D.setZ(20);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}

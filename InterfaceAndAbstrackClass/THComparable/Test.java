package THComparable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle(3.8);
        comparableCircles[1] = new ComparableCircle();
        comparableCircles[2] = new ComparableCircle(2.0,"blue",false);

        System.out.println("Truoc khi sort: ");
        for (ComparableCircle comparableCircle : comparableCircles) {
            System.out.println(comparableCircle);
        }
        Arrays.sort(comparableCircles);

        System.out.println("Sau khi sort: ");
        for (ComparableCircle comparableCircle : comparableCircles) {
            System.out.println(comparableCircle);
        }

    }
}

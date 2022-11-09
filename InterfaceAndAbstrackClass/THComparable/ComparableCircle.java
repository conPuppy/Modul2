package THComparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle() {
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        System.out.println("T1: " + getRadius() + ", T2: " + o.getRadius());
        if(getRadius()>o.getRadius()) {
            System.out.println("nho hon");
            return 1;
        }
        else if (getRadius()<o.getRadius()) {
            System.out.println("lon hon");
            return -1;
        }
        else {
            System.out.println("bang nhau");
            return 0;}
    }

    @Override
    public String toString() {
        return "ComparableCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

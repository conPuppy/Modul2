package pointandmove;

public class TestMoveable {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2,2,3,3);
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(5,5);
        System.out.println(moveablePoint);

        System.out.println(moveablePoint.move());

        moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

    }
}

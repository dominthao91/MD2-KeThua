package classPointMoveablePoint;

public class Main {
    public static void main(String[] args) {

    Point point1 = new Point();
    Point point2 = new Point(1.0f, 2.0f);
        System.out.println(point2);
        System.out.println(point1);


    MoveablePoint move1 = new MoveablePoint();
        System.out.println(move1);
    MoveablePoint move2 = new MoveablePoint(0.0f, 0.0f, 2.0f,2.0f);
        System.out.println(move2);
        move2.move();
        move2.move();
        System.out.println(move2);
}
}
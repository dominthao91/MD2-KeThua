package classPoint2DPoint3D;

public class Main {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        Point2D point2 = new Point2D(1.0f,2.0f);
        System.out.println(point2);
        System.out.println(point1);

        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D(2.0f, 3.0f, 5.0f);
        System.out.println(p1);
        System.out.println(p2);
    }
}

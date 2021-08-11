package classPoint2DPoint3D;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
        super();
        z = 1.0f;
    }

    public Point3D(float _x, float _y, float _z) {
        super(_x, _y);
        z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = z;
        return arr;
    }

    public void setXYZ(float _x, float _y, float _z) {
        super.setXY(_x, _y);
        z = _z;
    }

    public String toString() {
        return super.toString() + " z is: " + z;
    }
}

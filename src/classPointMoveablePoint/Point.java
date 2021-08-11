package classPointMoveablePoint;

public class Point {

        private float x;
        private float y;

        public Point() {
            x = 0.0f;
            y = 0.0f;
        }

        public Point(float _x, float _y) {
            x = _x;
            y = _y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float[] getXY() {
            float[] arr = new float[2];
            arr[0] = x;
            arr[1] = y;
            return arr;
        }

        public String toString() {
            return "A point of x is: " + x +
                    " y is: " + y;
        }

    }

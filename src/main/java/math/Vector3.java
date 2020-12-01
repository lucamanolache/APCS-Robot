package math;

public class Vector3 {

    public double x, y, z; // this is 2d, however z is used if it is above or below

    public Vector3() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

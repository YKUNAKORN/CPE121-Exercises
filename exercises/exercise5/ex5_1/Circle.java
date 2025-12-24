package exercises.exercise5.ex5_1;

public class Circle {
    public static final  double CirclePi = 3.14;
    private double r;

    public Circle (double radius) {
        this.r = radius;
    }

    public double getArea () {
        return CirclePi * r * r;
    }

    public double getVolume () {
        return getArea() * 4;
    }

    public double getCircumference () {
        return 2 * CirclePi * r;
    }
}

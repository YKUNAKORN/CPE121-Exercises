package exercises.exercise5.ex5_2;

public class Triangle {
    private double s1, s2, s3;

    public Triangle () {
        this.s1 = 0.0;
        this.s2 = 0.0;
        this.s3 = 0.0;
    }

    public Triangle (double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public double getS3() {
        return s3;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    public double getPerimeter() {
        return s1 + s2 + s3;
    }
}

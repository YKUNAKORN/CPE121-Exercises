package exercises.exercise5.ex5_2;

public class Main {
    public static void main (String[] args) {
        Triangle t1 = new Triangle(4.0, 5.0, 6.0);
        System.out.println("First Triangle (T1)");
        System.out.println("----------");
        System.out.println("Triangle's area = " + t1.getArea());
        System.out.println("Triangle's perimeter = " + t1.getPerimeter());

        System.out.println();

        Triangle t2 = new Triangle(2.0, 2.5, 3.0);
        System.out.println("Second Triangle (T2)");
        System.out.println("----------");
        System.out.println("Triangle's area = " + t2.getArea());
        System.out.println("Triangle's perimeter = " + t2.getPerimeter());
    }
}

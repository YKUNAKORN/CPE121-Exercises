package exercises.exercise5.ex5_1;

public class Main {
    public static void main (String[] args) {
        Circle c1 = new Circle(4.0);
        System.out.println("First Circle (C1)");
        System.out.println("----------");
        System.out.println("Circle's Area = " + c1.getArea());
        System.out.println("Circle's Volume = " + c1.getVolume());
        System.out.println("Circle's Circumference = " + c1.getCircumference());

        System.out.println();

        Circle c2 = new Circle(1.5);
        System.out.println("Second Circle (C2)");
        System.out.println("----------");
        System.out.println("Circle's Area = " + c2.getArea());
        System.out.println("Circle's Volume = " + c2.getVolume());
        System.out.println("Circle's Circumference = " + c2.getCircumference());
    }
}

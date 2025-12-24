package exercises.exercise4.ex4_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalArea {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter total of line: ");
            int n = sn.nextInt();
            if (n < 3) {
                System.err.println("Error: A polygon must have at least 3 sides.");
                return;
            }
            System.out.print("Enter length: ");
            double side = sn.nextDouble();
            if (side <= 0) {
                System.err.println("Error: Length must be greater than 0.");
                return;
            }

            double callArea = area(n, side);
            System.out.printf("%.2f", callArea);
            sn.close();
        } catch (InputMismatchException ex) {
            System.err.println("Invalid input, Please try again");
        }
    }

    public static double area(int n, double side) {
        return (n * Math.pow((side), 2)) / (4 * Math.tan((Math.PI / n)));
    }
}
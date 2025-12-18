package exercises.exercise2.ex2_1;

import java.util.Scanner;

public class equationXnY {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = sn.nextDouble();
        double b = sn.nextDouble();
        double c = sn.nextDouble();
        double d = sn.nextDouble();
        double e = sn.nextDouble();
        double f = sn.nextDouble();

        double divider = ((a * d) - (b * c));
        double findX = ((e * d) - (b * f)) / divider;
        double findY = ((a * f) - (e * c)) / divider;

        if (divider == 0) {
            System.out.println("The equation has no solution");
        }
        else {
            System.out.println("x is " + findX + " and y is " + findY);
        }
        sn.close();
    }
}

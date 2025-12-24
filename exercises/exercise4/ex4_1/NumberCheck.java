package exercises.exercise4.ex4_1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NumberCheck {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter 3 numbers: ");
            int a = sn.nextInt();
            int b = sn.nextInt();
            int c = sn.nextInt();

            System.out.println(isValid(a, b, c));
            sn.close();
        } catch (InputMismatchException ex) {
            System.err.println("Invalid input, please try again");
        }
    }

    public static boolean isValid(int a, int b, int c) {
        return (a > b && a > c) || (c < a && c < b);
    }
}
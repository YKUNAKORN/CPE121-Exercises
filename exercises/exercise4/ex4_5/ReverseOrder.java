package exercises.exercise4.ex4_5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ReverseOrder {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = sn.nextInt();
            boolean shouldContinue = true;
            while (shouldContinue) {
                int display = reverse(number);
                System.out.print(display);
                number /= 10;
                if (number == 0) shouldContinue = false;
            }
        } catch (InputMismatchException ex) {
            System.err.println("Invalid input, please try again");
        }
    }

    public static int reverse (int number) {
        int digit;
        digit = number % 10;
        return digit;
    }
}
package exercises.exercise1.ex1_2;

import java.util.Scanner;

public class splitNumber {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter number between 0 and 999: ");
            int inNum = sn.nextInt();
            if (inNum < 0 || inNum > 999) {
                throw new IllegalArgumentException("Number out of range");
            }

            int digit1 = inNum % 10;
            int digit2 = (inNum / 10) % 10;
            int digit3 = (inNum / 100) % 10;
            int sumDigits = digit1 * digit2 * digit3;

            System.out.println("The product of digits is: " + sumDigits);
        }
        catch (IllegalArgumentException ex) {
            System.err.println("Error: The number must be between 0 and 999.");
        }
    }
}
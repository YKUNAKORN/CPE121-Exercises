package exercises.exercise4.ex4_4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SumDigit {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sn.nextInt();
            System.out.printf("The sum of digits for %d is %d", n, sumDigit(n));
            sn.close();
        } catch (InputMismatchException ex) {
            System.err.println("Invalid input, Please try again");
        }
    }

    public static int sumDigit(int n) {
        int con = 1, sum = 0;
        for (int i = 1; i <= 10; i++) {
            int digit = (n / con) % 10;
            sum += digit;
            con *= 10;
        }
        return sum;
    }
}
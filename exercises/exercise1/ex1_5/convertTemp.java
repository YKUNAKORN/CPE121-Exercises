package exercises.exercise1.ex1_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class convertTemp {
    public static void main (String[] args) {
        try (Scanner sn = new Scanner(System.in)){
            System.out.print("Enter a degree in Fahrenheit: ");
            double inF = sn.nextDouble();

            double toC = (((double) 5 / 9) * (inF - 32));

            System.out.printf("%.1f Fahrenheit is %.2f Celsius", inF, toC);
        }
        catch (InputMismatchException ex) {
            System.err.println("Invalid input, please try again");
        }
    }
}

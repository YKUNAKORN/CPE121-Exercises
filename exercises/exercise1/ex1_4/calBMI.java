package exercises.exercise1.ex1_4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class calBMI {
    public static void main (String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter weight in kg: ");
            float inWeight = sn.nextFloat();
            System.out.print("Enter height in cm: ");
            float inHeight = sn.nextFloat();
            float height2 = (float) Math.pow((inHeight / 100), 2);
            float finalBMI = inWeight / height2;

            System.out.printf("BMI is %f", finalBMI);
        }
        catch (InputMismatchException ex) {
            System.err.println("Invalid input, Please try again");
        }
    }
}
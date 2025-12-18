package exercises.exercise1.ex1_3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class convertTime {
    public static void main (String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter the number of seconds: ");
            int inputSec = sn.nextInt();

            int hrs = inputSec / 3600;
            int remainingSecs = inputSec % 3600;
            int mins = remainingSecs / 60;
            int secs = remainingSecs % 60;

            System.out.println(inputSec + " seconds is " + hrs + " hours, " + mins + " minutes, and " + secs + " seconds");
        }
        catch (InputMismatchException ex) {
            System.err.println("Invalid input, Please try again");
        }
    }
}
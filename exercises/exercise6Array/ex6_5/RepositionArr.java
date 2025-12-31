package exercises.exercise6Array.ex6_5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RepositionArr {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            double[] numArr = new double[5];

            for (int i = 0; i < numArr.length; i++) {
                System.out.print("Read a number: ");
                numArr[i] = sn.nextDouble();
            }

            for (int i = numArr.length - 1; i > 0; i--) {
                int rdInx = ThreadLocalRandom.current().nextInt(i + 1);
                double temp = numArr[i];
                numArr[i] = numArr[rdInx];
                numArr[rdInx] = temp;
            }

            for (double val : numArr) {
                System.out.println(val);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
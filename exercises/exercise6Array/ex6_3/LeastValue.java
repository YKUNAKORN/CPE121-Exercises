package exercises.exercise6Array.ex6_3;

import java.util.Scanner;

public class LeastValue {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter ten numbers: ");
            double[] array = new double[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = sn.nextDouble();
            }

            System.out.println("The index of the min is " + indexOfSmallestElement(array));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int indexOfSmallestElement(double[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
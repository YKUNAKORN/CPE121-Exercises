package exercises.exercise6Array.ex6_6;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            double[][] a = readMatrix(sn, "Enter matrix1: ");
            double[][] b = readMatrix(sn, "Enter matrix2: ");
            double[][] c = multiplyMatrix(a, b);

            System.out.println("The multiplication of the matrices is:");
            displayResult(a, b, c);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static double[][] readMatrix(Scanner sn, String prompt) {
        System.out.print(prompt);
        double[][] m = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = sn.nextDouble();
        return m;
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void displayResult(double[][] a, double[][] b, double[][] c) {
        for (int i = 0; i < 3; i++) {
            printRow(a[i]);
            System.out.print(i == 1 ? "*    " : "     ");
            printRow(b[i]);
            System.out.print(i == 1 ? "=    " : "     ");
            printRow(c[i]);
            System.out.println();
        }
    }

    private static void printRow(double[] row) {
        for (double val : row) {
            System.out.printf("%-5.1f ", val);
        }
    }
}
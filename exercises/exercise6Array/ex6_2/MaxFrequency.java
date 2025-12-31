package exercises.exercise6Array.ex6_2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MaxFrequency {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter the number of array size: ");
            int size =  sn.nextInt();
            System.out.print("Your number 1: ");
            int n1 = sn.nextInt();
            System.out.print("Your number 2: ");
            int n2 = sn.nextInt();
            System.out.print("Your number 3: ");
            int n3 = sn.nextInt();
            System.out.print("Your number 4: ");
            int n4 = sn.nextInt();

            int[] fMax = new int[4];
            int[] uArr = new int[size];
            for (int i = 0; i < size; i++) {
                int rd = ThreadLocalRandom.current().nextInt(0, 9);
                uArr[i] = rd;

                if (uArr[i] == n1) {
                    fMax[0]++;
                } else if (uArr[i] == n2) {
                    fMax[1]++;
                } else if (uArr[i] == n3) {
                    fMax[2]++;
                } else if (uArr[i] == n4) {
                    fMax[3]++;
                }
            }

            int max = 0;
            Arrays.sort(fMax);
            max = fMax[fMax.length-1];
            System.out.print("Your array: { ");
            for (int j = 0; j < size; j++) {
                System.out.print(uArr[j] + " ");
            }
            System.out.println("}");
            System.out.println("MaxFrequency: " + max);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
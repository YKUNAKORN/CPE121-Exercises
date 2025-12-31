package exercises.exercise6Array.ex6_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArray {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = sn.nextInt();

            int[] uArr = new int[size];
            for (int i = 0; i < size; i++) {
                int rd = ThreadLocalRandom.current().nextInt(1, 100);
                uArr[i] = rd;
            }

            System.out.println("Your array: " + Arrays.toString(uArr));
            System.out.println("Your array score: " + calScore(uArr));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int calScore(int[] num) {
        int score = 0;
        for (int i = 0; i < num.length; i++) {
            int value = num[i];
            if (value % 10 == 4 || value % 10 == 9) {
                score++;
            } else if (value % 7 == 0) {
                score += 2;
            }
        }
        return score;
    }
}
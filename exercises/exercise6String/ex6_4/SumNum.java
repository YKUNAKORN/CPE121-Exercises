package exercises.exercise6String.ex6_4;

import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter your message: ");
            String str = sn.nextLine();
            System.out.println("The summation of numbers is: " + sumNumbers(str));
        } catch (NumberFormatException e) {
            System.err.println("Error: The number is too large for an integer.");
        }
    }

    public static int sumNumbers(String str) {
        int sum = 0;
        String temp = "0";
        for (int i = 0; i < str.length(); i++) {
            char chAt = str.charAt(i);
            if (Character.isDigit(chAt)) {
                temp += chAt;
            } else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }
}
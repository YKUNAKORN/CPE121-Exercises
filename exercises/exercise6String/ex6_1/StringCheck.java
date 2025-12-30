package exercises.exercise6String.ex6_1;

import java.util.*;

public class StringCheck {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter your message: ");
            String inMessage = sn.nextLine();
            if (!inMessage.matches("[a-zA-Z]+")) {
                throw new InputMismatchException("Invalid Input, please try again");
            }
            boolean result = isTrue(inMessage.toLowerCase());
            System.out.println("Your message is: " + result);
        } catch (IllegalArgumentException ex) {
            System.err.println("Invalid Input: " + ex.getMessage());
        }
    }

    public static boolean isTrue(String inMessage) {
        for (int i = 0; i < inMessage.length(); i++) {
            char currentChar = inMessage.charAt(i);
            if ((i == 1 && currentChar == 'e') || (i == 3 && currentChar == 'e')) {
                return true;
            }
        }
        return false;
    }
}
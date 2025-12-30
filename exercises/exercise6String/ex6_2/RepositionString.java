package exercises.exercise6String.ex6_2;

import java.util.Scanner;

public class RepositionString {
    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter your message: ");
            String inMessage = sn.nextLine();
            if(inMessage.length() < 2) {
                throw new IllegalArgumentException("Invalid Input, The message must at least 2 characters");
            }
            String result = reposition(inMessage);
            System.out.println(result);
        } catch (IllegalArgumentException ex) {
            System.err.println("Invalid Input: " + ex.getMessage());
        }
    }

    public static String reposition(String inMessage) {
        String toBack = "", toFront = "";
        for (int i = 0; i < inMessage.length(); i++) {
            char currentChar = inMessage.charAt(i);
            if (i == 0 || i == 1) {
                toBack += currentChar;
            } else {
                toFront += currentChar;
            }
        }
        return toFront + toBack;
    }
}
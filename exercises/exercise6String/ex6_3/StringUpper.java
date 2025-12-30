package exercises.exercise6String.ex6_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringUpper {
    public static void main(String[] args) {
        try(Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String inMessage = sn.nextLine();
            String result = toUpper(inMessage);
            System.out.println("Your message is: " + result);
        } catch (InputMismatchException ex) {
            System.err.println("Invalid Input: " + ex.getMessage());
        }
    }

    public static String toUpper(String inMessage) {
        String toFront = "", toBack = "";
        for (int i = 0; i < inMessage.length(); i++) {
            if (i < inMessage.length() - 3) {
                toFront += inMessage.charAt(i);
            }  else {
                toBack += inMessage.charAt(i);
            }
        }
        return  toFront + toBack.toUpperCase();
    }
}
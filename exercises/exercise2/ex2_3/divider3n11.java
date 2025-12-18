package exercises.exercise2.ex2_3;

import java.util.Scanner;

public class divider3n11 {
    public static void main (String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = sn.nextInt();

        if (userInput % 3 == 0 && userInput % 11 == 0) {
            System.out.println(userInput + " is divisible by both 3 and 11");
        }
        else if (userInput % 3 == 0 || userInput % 11 == 0) {
            System.out.println(userInput + " is divisible by both 3 or 11, but not both");
        }
        else {
            System.out.println(userInput + " is not divisible by either 3 or 11");
        }
        sn.close();
    }
}

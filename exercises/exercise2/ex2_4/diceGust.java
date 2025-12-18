package exercises.exercise2.ex2_4;

import java.util.Scanner;
import java.util.Random;

public class diceGust {
    public static void main (String[] args) {
        Scanner sn = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Guess the roll [1-6]: ");

        int userGuest = sn.nextInt();
        int comGuest = rd.nextInt(2);

        if (userGuest != comGuest) {
            System.out.println("Your guest is incorrect.");
        }
        else {
            System.out.println("Your guest is correct.");
        }
        sn.close();
    }
}

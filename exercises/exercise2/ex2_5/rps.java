package exercises.exercise2.ex2_5;

import java.util.Scanner;
import java.util.Random;

public class rps {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("scissor(0), rock(1), paper(2): ");
        int userChoose = sn.nextInt();
        int comChoose = rd.nextInt(3);

        switch (comChoose) {
            case 0:
                System.out.print("The computer is scissor. ");
                break;
            case 1:
                System.out.print("The computer is rock. ");
                break;
            case 2:
                System.out.print("The computer is paper. ");
                break;
        }

        switch (userChoose) {
            case 0:
                System.out.print("You are scissor. ");
                break;
            case 1:
                System.out.print("You are rock. ");
                break;
            case 2:
                System.out.print("You are paper. ");
                break;
        }

        int winner = userChoose - comChoose;

        switch (winner) {
            case 0:
                System.out.println("It is a draw.");
                break;
            case 1:
            case -2:
                System.out.println("You won.");
                break;
            case -1:
            case 2:
                System.out.println("Com won.");
                break;
        }
        sn.close();
    }
}
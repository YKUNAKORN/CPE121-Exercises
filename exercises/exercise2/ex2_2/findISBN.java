package exercises.exercise2.ex2_2;

import java.util.Scanner;

public class findISBN {
    public static void main (String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int d1 = sn.nextInt();
        int d2 = sn.nextInt();
        int d3 = sn.nextInt();
        int d4 = sn.nextInt();
        int d5 = sn.nextInt();
        int d6 = sn.nextInt();
        int d7 = sn.nextInt();
        int d8 = sn.nextInt();
        int d9 = sn.nextInt();

        int d10 = ((d1 + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11);

        if (d10 == 10) {
            System.out.println("The ISBN-10 Number is " + d1 + d2 + d3 + d4 + d5 + d6 +d7 + d8 + d9 + "X");
        }
        else {
            System.out.println("The ISBN-10 Number is " + d1 + d2 + d3 + d4 + d5 + d6 +d7 + d8 + d9 + d10);
        }
        sn.close();
    }
}

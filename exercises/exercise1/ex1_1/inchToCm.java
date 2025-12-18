package exercises.exercise1.ex1_1;

import java.util.Scanner;

public class inchToCm {
    public static void main (String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter inches as an integer: ");
        int getInches = sn.nextInt();

        float toCm = getInches / 0.3937f;

        System.out.println("The value in centimeters is " + toCm);
        sn.close();
    }
}

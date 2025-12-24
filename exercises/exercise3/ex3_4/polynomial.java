package exercises.exercise3.ex3_4;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class polynomial {
    public static void main (String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter a, x , n: ");
            double inA = sn.nextDouble();
            double inX = sn.nextDouble();
            int inN = sn.nextInt();
            double pow = 0, result;
            switch (inN) {
                case 0:
                    pow = 1;
                    break;
                case 1:
                    pow = inX * 1;
                    break;
                case 2:
                    pow = inX * inN;
                    break;
                case 3:
                    pow = inX * inN * inN;
                    break;
                case 4:
                    pow = inX * inN * inX * inN;
                    break;
                case 5:
                    pow = inX * inN * inX * inN * inX;
                    break;
                default:
                    throw new IllegalArgumentException("It's out of the range (0 - 5)");
            }
            result = inA * pow;
            JOptionPane.showMessageDialog(null, "ax^n where a = " + inA + ", x = " + inX + " , n = " +  inN + " is " + result);
        } catch (IllegalArgumentException ex) {
            System.err.println("Invalid input, please try again");
        }
    }
}
package exercises.exercise4.ex4_6;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Distance {
    public static void main (String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            double x1 = 3.0, y1 = 4.0, x2 = 7.0, y2 = 5.0, pointInt, pointDouble;
            pointInt = distance(x1, y1, x2, y2);
            pointDouble = distance(x1, y1, x2, y2);
            System.out.println("The distance value of point (" + (int)x1 + "," + (int)y1 + ") and point (" + (int)x2 + "," + (int)y2 + ") is " + (int)pointInt);
            System.out.println("The distance value of point (" + x1 + "," + y1 + ") and point (" + x2 + "," + y2 + ") is "+ pointDouble);
            sn.close();
        } catch (InputMismatchException ex) {
            System.err.println("Invalid input, please try again");
        }
  }
  
  public static int distance (int x1, int y1, int x2, int y2) {
    int sumInt;
    sumInt = (int)Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    return sumInt;
  }
  
  public static double distance (double x1, double y1, double x2, double y2) {
    double sumDouble;
    sumDouble = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
    return sumDouble;
  }
}
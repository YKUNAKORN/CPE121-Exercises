package exercises.exercise4.ex4_7;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Average {
  public static void main(String[] args) { 
    try (Scanner sn = new Scanner(System.in)) {
        double i1, i2, i3, i4, i5, avgDouble, avgInt;
        int type;
        System.out.print("Select data type of all numbers 1.int 2.double");
        type = sn.nextInt();
        if (type == 1) {
            System.out.print("Enter five numbers : ");
            i1 = sn.nextInt();
            i2 = sn.nextInt();
            i3 = sn.nextInt();
            i4 = sn.nextInt();
            i5 = sn.nextInt();
            avgInt = average(i1, i2, i3, i4, i5);
            System.out.println("Average value : " + (int)avgInt);
        } else if(type==2) {
            System.out.print("Enter five numbers : ");
            i1 = sn.nextDouble();
            i2 = sn.nextDouble();
            i3 = sn.nextDouble();
            i4 = sn.nextDouble();
            i5 = sn.nextDouble();
            avgDouble = average(i1, i2, i3, i4, i5);
            System.out.println("Average value : " + (double)avgDouble);
        }
        sn.close();
    } catch (InputMismatchException ex) {
        System.err.println("Invalid input, please try again");
    }
  }
  
  public static int average(int i1, int i2, int i3, int i4, int i5){
    int sumInt;
    sumInt = (i1 + i2 + i3 + i4 + i5) / 5;
    return sumInt;
  }
  
  public static double average(double i1, double i2, double i3, double i4, double i5){
    double sumDouble;
    sumDouble = (i1 + i2 + i3 + i4 + i5) / 5;
    return sumDouble;
  }
}
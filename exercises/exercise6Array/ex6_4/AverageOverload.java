package exercises.exercise6Array.ex6_4;

public class AverageOverload {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 6};
        double[] doubleArr = {6.0, 4.4, 1.9, 3.4, 3.5};

        System.out.println("The average value as integer is " + average(intArr));
        System.out.println("The average value as double is " + average(doubleArr));
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double j : array) {
            sum += j;
        }
        return sum / array.length;
    }
}
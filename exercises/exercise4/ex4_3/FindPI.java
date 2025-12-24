package exercises.exercise4.ex4_3;

public class FindPI {
    public static void main (String[] args) {
        System.out.printf("i\t\t\t m(i)\n");
        System.out.println("___________________");
        for (int i = 1; i < 1000; i += 100) {
            double mi = m(i);
            System.out.printf("%d\t\t\t %.4f\n", i, mi);
        }
    }

    public static double m (int i) {
        double estPI = 0;
        for (int j = 1; j <= i; j++) {
            estPI = estPI + (Math.pow(-1 , (j + 1)) / ((2 * j) - 1));
        }
        return 4 * estPI;
    }
}
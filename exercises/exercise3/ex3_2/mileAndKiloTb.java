package exercises.exercise3.ex3_2;

public class mileAndKiloTb {
    public static void main (String[] args) {
        System.out.println("Miles\t Kilometer\t |\t Kilometer\t Miles");
        int mile = 1, kilo = 20;
        for (int i = 0; i <= 9; i++) {
            double toKm = mile / 0.621f;
            double toMi = kilo * 0.621f;
            System.out.printf("%d\t\t %.3f\t\t |\t %d\t\t\t %.3f\n", mile, toKm, kilo, toMi);
            mile += 1;
            kilo += 5;
        }
    }
}
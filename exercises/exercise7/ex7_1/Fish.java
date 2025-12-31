package exercises.exercise7.ex7_1;

public class Fish {
    private double weight;

    public Fish(double weight) {
        this.weight = weight;
    }
    public void swim() {
        System.out.println("All fish swim.");
    }
    public double getWeight() {
        return this.weight;
    }
}
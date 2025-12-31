package exercises.exercise7.ex7_1;

public class Main {
    public static void main(String[] args) {
        Fish f = new Fish(0.3);
        Shark s = new Shark(200);
        MechanicalFish m = new MechanicalFish(1.2);

        System.out.print("I'm a " + f.getWeight() + " kg fish. ");
        f.swim();
        System.out.print("I'm a " + s.getWeight() + " kg shark. ");
        s.swim();
        System.out.print("I'm a " + m.getWeight() + " kg mechanical fish. ");
        m.swim();
    }
}
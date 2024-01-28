package test_28_jan_23.multipleInheritance;

public class Piegon implements MultipleInheritance.Animal, MultipleInheritance.Bird {
    String name;

    public Piegon(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(name + " says Squawk!");

    }

    @Override
    public void layEggs() {
        System.out.println(name + " is laying eggs.");

    }

    public static void main(String[] args) {
        Piegon polly = new Piegon("Polly");
        polly.speak();
        polly.layEggs();

    }
}

package test_28_jan_23.multipleInheritance;

public class Dog implements MultipleInheritance.Animal, MultipleInheritance.Mammal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(name + " bark ");

    }

    @Override
    public void giveBirth() {
        System.out.println(name + " is gives birth ");

    }

    public static void main(String[] args) {
        Dog buddy = new Dog("Tuffy");
        buddy.speak();
        buddy.giveBirth();

    }
}

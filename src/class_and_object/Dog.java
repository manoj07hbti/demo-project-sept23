package class_and_object;

public class Dog {
    // data member
    String name="Tommy";
    String breedName="Labra";
    double weight=34.56;

    public static void main(String[] args) {
        Dog obj= new Dog();

        System.out.println("Printing : "+obj.breedName);
    }

}

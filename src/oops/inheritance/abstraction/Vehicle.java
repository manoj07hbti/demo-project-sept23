package oops.inheritance.abstraction;

public abstract class Vehicle {

    public void displayInformation(String engineNo, int power, double millage){

        System.out.println("Engine number is :"+engineNo);
        System.out.println("Engine Power is :"+power);
        System.out.println("Engine millage is :"+millage);
    }

    public abstract void servicing();

    public abstract void pricing();
}

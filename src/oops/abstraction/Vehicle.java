package oops.abstraction;

public abstract class Vehicle {

    public void displayinformation(String engineNo,int power,double mileage){

        System.out.println("This is Engine number: "+engineNo);
        System.out.println("This is Engine power: "+power);
        System.out.println("This is Engine mileage: "+mileage);

    }


    public abstract void pricing(double price);

    public abstract void servicing(String service);
}

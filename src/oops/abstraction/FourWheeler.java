package oops.abstraction;

public class FourWheeler extends Vehicle{
    @Override
    public void servicing() {
        System.out.println("This is Servicing of FourWheeler");
    }

    @Override
    public void pricing() {
        System.out.println("This is Pricing of FourWheeler");
    }
}

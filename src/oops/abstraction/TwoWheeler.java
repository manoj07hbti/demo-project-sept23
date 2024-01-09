package oops.abstraction;

public class TwoWheeler extends Vehicle{

    @Override
    public void servicing() {

        System.out.println("This is Servicing of TwoWheeler");
    }

    @Override
    public void pricing() {
        System.out.println("This is Pricing of TwoWheeler");
    }

    public static void main(String[] args) {

        TwoWheeler obj = new TwoWheeler();

        obj.displayInformation("ABC1213",200,60.5);
    }
}

package oops.abstraction;

public class PayTm implements Payment{

    @Override
    public void checkBalance() {

        System.out.println("This is PayTm check Balance method ");
    }

    @Override
    public void makePayment() {
        System.out.println("This is PayTm makePayment method ");
    }
}

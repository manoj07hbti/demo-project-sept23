package oops.abstraction;

public class PhonePe implements Payment{
    @Override
    public void checkBalance() {

        System.out.println("This is PhonePe check Balance method ");
    }

    @Override
    public void makePayment() {
        System.out.println("This is PhonePe makePayment  method ");
    }
}

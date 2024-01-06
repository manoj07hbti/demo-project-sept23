package oops.inheritance.abstraction;

public class GooglePay implements Payment{
    @Override
    public void checkBalance() {

        System.out.println("This is GooglePay check Balance method ");
    }

    @Override
    public void makePayment() {
        System.out.println("This is GooglePay make payment method ");

    }
}

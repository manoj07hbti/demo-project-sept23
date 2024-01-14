package oops.abstraction;

public class FourWheeler extends Vehicle{

    @Override
    public void pricing(double price) {
        System.out.println("this is the price of four wheeler:"+price);

    }

    @Override
    public void servicing(String service) {
        System.out.println("this is the service centre: "+service);

    }

    public static void main(String[] args) {
        FourWheeler obj = new FourWheeler();
        obj.displayinformation("iojjn203268",110,50.1);
        obj.pricing(500000);
        obj.servicing("bhagwan talkies");
    }
}

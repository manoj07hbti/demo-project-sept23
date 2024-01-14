package oops.abstraction;

public class DemoAbs2 extends DemoAbs {

    @Override
    public void m2() {
        System.out.println("this is abstraction class");

    }

    @Override
    public void m3() {
        System.out.println("this also one of the important question");

    }

    public static void main(String[] args) {
        DemoAbs2 obj=new DemoAbs2();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}

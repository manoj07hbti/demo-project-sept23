package oops.inheritance.abstraction;

import revision.Demo;

public class AbstractChild extends DemoAbstract {
    @Override
    public void m1() {
        System.out.println("This is m1 normal method");
    }

    @Override
    public void m4() {
        System.out.println("This is m4 normal method");
    }
}

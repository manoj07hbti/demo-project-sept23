package oops.Interface;

public class ChildClass implements DemoInterface{

    @Override
    public void N1() {
        System.out.println("this is demo interface class");
    }

    @Override
    public void N2() {
        System.out.println("this is demo interface class1");

    }

    @Override
    public void N3() {
        System.out.println("this is demo interface class2");

    }

    public static void main(String[] args) {
        ChildClass obj= new ChildClass();
        obj.N1();
        obj.N2();
        obj.N3();
    }
}

package oops.abstraction;

public abstract class DemoAbstract {

    //Syntax: access_specifier abstract return_type method_name(input param);
    // we have achieved 50% abstraction
    //Abstract class can provide partial abstraction as it can have normal methods

    public abstract void m1(); // this is an abstract method
    public void m2(){
        System.out.println("This is normal method ...");
    }
    public void m3(){
        System.out.println("This is normal method m3...");
    }
    public abstract void m4();

    public static void main(String[] args) {

       /* DemoAbstract obj = new DemoAbstract();

        obj.m1(); //
        obj.m4(); //*/
    }
}

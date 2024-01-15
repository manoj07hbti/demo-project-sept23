package oops.polymorphism;

public class MethodOverloading {

    public void class1(){
        System.out.println("this is normal method ");
    }
    public void class1(int a){
        System.out.println("this is overloading method with int param...."+a);
    }
    public void class1(int a,String b){
        System.out.println("this is overloading method with multi param...."+a+" and "+b);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.class1();
        obj.class1(2);
        obj.class1(45,"atharv");
    }
}

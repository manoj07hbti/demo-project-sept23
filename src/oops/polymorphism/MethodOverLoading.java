package oops.polymorphism;

public class MethodOverLoading {

    public void m1(){
        System.out.println("This is normal method m1...");
    }
    public void m1(int a){
        System.out.println("This is overloaded method m1 with one int param..."+a);
    }
    public void m1(String a){
        System.out.println("This is overloaded method m1 with String param..."+a);
    }
    public void m1(int a,String b){
        System.out.println("This is overloaded method m1 with 2 overloaded params..."+a);
    }

    public static void main(String[] args) {

        MethodOverLoading obj = new MethodOverLoading();
        obj.m1();
        obj.m1(33);
        obj.m1("ABC");
        obj.m1(2,"XYZ");
    }

}

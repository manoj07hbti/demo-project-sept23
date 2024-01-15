package oops.polymorphism;

public class ChildMethodOverriding extends ParentMethodOverriding {
    @Override
    public void class2(){
        System.out.println("this is child class");
    }

    public static void main(String[] args) {
        ParentMethodOverriding obj = new ParentMethodOverriding();
        obj.class2();//this obj call parent class because i have created obj of parent class
        ParentMethodOverriding obj1 = new ChildMethodOverriding();
        obj1.class2();//this obj call child class because i have created obj of child class with new keyword
    }
}

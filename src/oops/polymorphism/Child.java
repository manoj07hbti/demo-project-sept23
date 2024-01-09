package oops.polymorphism;

public class Child extends Parent{
  @Override
  public void m1(){
        System.out.println("This is m1 method of Child class...");
    }

    public static void main(String[] args) {

      Parent obj= new Parent(); // Whatever object you create with new keyword that class method will be executed
      obj.m1(); // it will always call parent class m1 method as we have created object of Parent class with new keyword

      Parent obj1= new Child();
      obj1.m1();//it will always call child class m1 as  we have created object of Child class with new keyword

     /* Child obj2= new Parent(); // This will give compile time error child can not store parent object

      obj2.m1(); //*/

    }
}

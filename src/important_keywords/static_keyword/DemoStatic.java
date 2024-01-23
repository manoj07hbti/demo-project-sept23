package important_keywords.static_keyword;

public class DemoStatic {

    static String name="Java";
    int age=23; // this is non-static data
    public static void m1(){
        System.out.println("This is static method of Java");

    }

    //TODO Q.1: Can we override static method ?
    // YES, we can override but we can not achieve overriding because we are not creating any object to call static method

    //TODO Q.2: Can we overload static method ? : Yes , overloading is fully supported
    public static void m1(int age){
        System.out.println("This is static method of Java: "+age);

    }
//TODO Q.3: Can we use non static data inside a static method ? : NO
// NO , we can not use as non static data will get initialized only when object is created but for static method we do not create object to call it.

    public static void printing(){
       // System.out.println("Printing no static data "+age);
    }
    public static void main(String[] args) {

        //  ClassName.methodName();

        DemoStatic.m1();
        DemoStatic.m1(23);

        System.out.println("Printing static variable: "+DemoStatic.name);

    }

}

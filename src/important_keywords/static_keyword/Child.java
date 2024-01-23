package important_keywords.static_keyword;

public class Child extends  DemoStatic{

    public static void m1(){
        System.out.println("This is static method of CHILD Java");
    }

    public static void main(String[] args) {
        Child.m1();
    }
}

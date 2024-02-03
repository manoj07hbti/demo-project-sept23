package test_28_jan_23.immutableEx;

public final class Immutable {
    private String name;

    public String getName(String s) {
        return name;
    }

    public final void m(){
    System.out.println("This is the final method");
    }

    public static void main(String[] args) {
        Immutable obj=new Immutable();
        System.out.println(obj.getName("Ram"));
    }
}

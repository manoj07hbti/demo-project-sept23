package test_28_jan_sunday;

public class Child_Class implements Multiple_Inheritence.Car,Multiple_Inheritence.Bike {


    @Override
    public void test() {
        System.out.println("This is test method");
    }

    @Override
    public void Speed() {
        System.out.println("This is speed method");

    }

    public static void main(String[] args) {
        Child_Class obj=new Child_Class();
        obj.Speed();
        obj.test();
    }
}


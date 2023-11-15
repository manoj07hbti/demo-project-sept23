package class_and_object;

public class EngineerClass {

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void softwareMethod() {
        System.out.println("This is a Software Method of Engineer Class");
    }

    public void salaryMethod() {
        System.out.println("This is a Salary Method of Engineer Class");
    }

    public void walkMethod() {
        System.out.println("This is a Walk Method of Engineer Class");
    }

    public static void main(String[] args) {

        //CALLING A METHOD  step 2: objName.MethodName();
        EngineerClass obj = new EngineerClass();
        obj.softwareMethod();
        obj.salaryMethod();
        obj.walkMethod();
    }
}

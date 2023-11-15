package class_and_object;

public class DoctorClass {

    //capabilities or methods or functions : operations , Eat , Walk

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void operationMethod() {
        System.out.println("This is a Operation Method of Doctor Class");
    }

    public void eatMethod() {
        System.out.println("This is a Eat Method of Doctor Class");
    }

    public void walkMethod() {
        System.out.println("This is a Walk Method of Doctor Class");
    }

    public static void main(String[] args) {

        //CALLING A METHOD  step 2: objName.MethodName();
        DoctorClass obj = new DoctorClass();
        obj.operationMethod();
        obj.eatMethod();
        obj.walkMethod();
    }
}

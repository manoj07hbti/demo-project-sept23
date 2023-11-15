package class_and_object;

public class EmployeeClass {

    //Create Employee class and create methods

//capabilities or methods or functions : Work , Eat , Walk

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void workMethod() {
        System.out.println("This is a Work Method of Employee");
    }

    public void eatMethod() {
        System.out.println("This is a Eat Method of Employee");
    }

    public void walkMethod() {
        System.out.println("This is a Walk Method of Employee");
    }

    public static void main(String[] args) {
        //CALLING A METHOD  step 2: objName.MethodName();
        EmployeeClass obj = new EmployeeClass();
        obj.workMethod();
        obj.eatMethod();
        obj.walkMethod();

    }
}

package class_and_object;

public class EmployeeMethodsOrFunctions {

    //capabilities or methods or functions : work , walk , eat;

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    // method1
    public void workMethod() {

        System.out.println("This is work method of Employee....");
    }

    // method2
    public void walkMethod() {

        System.out.println("This is walk method of Employee....");
    }

    // method 3
    public void eatMethod() {

        System.out.println("This is eat method of Employee...");
    }

    public static void main(String[] args) {

        //SYNTAX : ClassName objName= new ClassName();
        //step 1: create Object;

        EmployeeMethodsOrFunctions obj = new EmployeeMethodsOrFunctions(); // we have created obj Object of class employee;

        //CALLING A METHOD;
        //step 2: objName.MethodName();

        obj.workMethod();

        obj.walkMethod();

        obj.eatMethod();





    }

}

package class_and_object;

public class EngineerMethod {

    //capabilities or methods or functions : work , walk , eat;

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    // Method 1;

    public void workMethod(){

        System.out.println("This is work method of Engineer ....");
    }
    // Method 2;
    public void walkMethod(){

        System.out.println("This is walk method of Engineer....");
    }
    // Method 3;
    public void eatMethod(){

        System.out.println("This is eat method of Engineer....");
    }

    public static void main(String[] args) {

        //SYNTAX : ClassName objName= new ClassName();
        //step 1: create Object;

        EngineerMethod obj = new EngineerMethod(); // we have created obj Object of class Engineer;

        //CALLING A METHOD;
        //step 2: objName.MethodName();

        obj.workMethod();

        obj.walkMethod();

        obj.eatMethod();
    }
}

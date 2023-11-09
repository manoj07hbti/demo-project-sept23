package class_and_object;

public class Employee {

    // Data Members;

    String name="Mohit";

    int id=200;

    int employee=10000;

    int age=25;

    double salary=45000.55;

    public static void main(String[] args) {

        //SYNTAX : ClassName objName= new ClassName();
        Employee obj1= new Employee(); // we have created obj Object of class employee;

        System.out.println("Printing info of employee object: "+ obj1.name +" "+ obj1.id +" "+obj1.employee +" "+obj1.age +" "+obj1.salary);

        Employee obj2= new Employee();

        System.out.println("Printing info of employee object: "+ obj2.name +" "+ obj2.id +" "+obj2.employee +" "+obj2.age +" "+obj2.salary);

        Employee obj3= new Employee();

        System.out.println("Printing info of employee object: "+ obj3.name +" "+ obj3.id +" "+obj3.employee +" "+obj3.age +" "+obj3.salary);

        Employee obj4= new Employee();

        System.out.println("Printing info of employee object: "+ obj4.name +" "+ obj4.id +" "+obj4.employee +" "+obj4.age +" "+obj4.salary);

        Employee obj5= new Employee();

        System.out.println("Printing info of employee object: "+ obj5.name +" "+ obj5.id +" "+obj5.employee +" "+obj5.age +" "+obj5.salary);


    }
}

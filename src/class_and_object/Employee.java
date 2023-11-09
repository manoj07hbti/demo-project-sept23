package class_and_object;

public class Employee {

    String name = "Virat";
    int age = 34;
    double salary = 98000.45;
    int employeeID = 244567;
    String company = "TATA";

    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println("Employee name: " + obj.name + " ..Age: " + obj.age);

        Employee obj2 = new Employee();
        System.out.println("Employee salary: " + obj2.salary);

        Employee obj3 = new Employee();
        System.out.println("Company name: "+obj3.company);

        Employee obj4 = new Employee();
        System.out.println("Employee ID: "+obj4.employeeID);

        Employee obj5 = new Employee();
        System.out.println("Age is: "+obj5.age);


    }
}

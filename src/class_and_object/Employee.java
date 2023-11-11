package class_and_object;

public class Employee {

    String name ="Akash";
    int age = 29;

    String companyname ="Google";
    String dept ="Coding";
    double salary=29987.97;

    public static void main(String[] args) {

        Employee obj= new Employee();
        System.out.println(" Print name of Employee = " +obj.name);

        Employee obj2 =new Employee();
        System.out.println(" Print age of Employee = " +obj2.age);

        Employee obj3= new Employee();
        System.out.println(" Print company name of Employee = " +obj.companyname);

        Employee obj4= new Employee();
        System.out.println(" Print name of Department = " +obj.dept);

        Employee obj5= new Employee();
        System.out.println(" Print Salary of Employee = " +obj.salary);
    }
}

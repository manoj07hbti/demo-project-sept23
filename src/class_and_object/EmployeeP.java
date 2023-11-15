package class_and_object;

public class EmployeeP {
    String Name;
    int age;
    String Dept;
    double salary;

    public EmployeeP(String name, int age, String dept, double salary) {
        Name = name;
        this.age = age;
        Dept = dept;
        this.salary = salary;
    }

    public static void main(String[] args) {
        EmployeeP Employee=new EmployeeP("Rajendra",32, "Finance",34000.50);
        System.out.println("Name: "+Employee.Name+" age: "+Employee.age+" dept: "+Employee.Dept+" salary :"+Employee.salary);
        EmployeeP Employee2=new EmployeeP("kapil", 36, "Revenue", 56008.66);
        System.out.println("Name: "+Employee2.Name+" age: "+Employee2.age+" dept: "+Employee2.Dept+" salary: "+Employee2.salary);
        EmployeeP Employee3=new EmployeeP("Nikhil",  22,"Account",52000);
        System.out.println("Name :"+Employee3.Name+" age: "+Employee.age+" dept: "+Employee3.Dept+" salary: "+Employee3.salary);
        EmployeeP Employee4=new EmployeeP("Rk",21,"ABC",9804.10);
        System.out.println("Name: "+Employee4.Name+" age: "+Employee4.age+" dept: "+Employee4.Dept+" salary: "+Employee4.salary);
    }
}

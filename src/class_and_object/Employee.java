package class_and_object;

public class Employee {
    String Name=" Rajendra";
    int age=45;
    double salary=45000;
    String dept="Railways";

    public static void main(String[] args) {
        Employee obj=new Employee();
        System.out.println("print info:"+" "+obj.Name +" "+obj.age +" "+ obj.salary +" "+obj.dept);
        Employee obj2=new Employee();
        System.out.println("print info:"+" "+obj2.Name+" "+obj.age+" "+obj.salary+" "+obj.dept);


    }
}



package methods;

public class Employee {

    String name;
    int employeeid;
    String workplace;
    double salary;

    public Employee(String name, int employeeid, String workplace, double salary) {
        this.name = name;
        this.employeeid = employeeid;
        this.workplace = workplace;
        this.salary = salary;
    }

    public void createProject(){
        System.out.println(name+" is creating java project");

    }
    public void laptop(){
        System.out.println(name+ " is working on laptop");
    }
    public void target(){
        System.out.println(name+" have daily targets");
    }

    public static void main(String[] args) {
        Employee obj=new Employee("Vidit",361193,"Agra",60000);
        obj.createProject();
        obj.laptop();
        obj.target();
    }
}

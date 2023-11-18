package class_and_object;

public class Employee_Param {

    String name;
    String companyname;
    int employeeid;
    double salary;

    public Employee_Param(String name, String companyname, int employeeid, double salary) {
        this.name = name;
        this.companyname = companyname;
        this.employeeid = employeeid;
        this.salary = salary;
    }

    public static void main(String[] args) {


        Employee_Param emp=new Employee_Param("Deepak","Axis bank ltd",361193,50054.60);

        System.out.println("Emp name: "+emp.name+", Company name: "+emp.companyname+", Emp id: "+emp.employeeid+",Salary: "+emp.salary);

        Employee_Param emp2=new Employee_Param("Vishal","Aditya birla",44956,80584.05);

        System.out.println("Emp name: "+emp2.name+", Company name: "+emp2.companyname+", Emp id: "+emp2.employeeid+",Salary: "+emp2.salary);

        Employee_Param emp3=new Employee_Param("Manish","S B I",7896,180000);

        System.out.println("Emp name: "+emp3.name+", Company name: "+emp3.companyname+", Emp id: "+emp3.employeeid+",Salary: "+emp3.salary);

        Employee_Param emp4=new Employee_Param("Arihant","Indiabulls",75634,54600);

        System.out.println("Emp name: "+emp4.name+", Company name: "+emp4.companyname+", Emp id: "+emp4.employeeid+",Salary: "+emp4.salary);
    }
}

package collection;

import model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArraylistScanner {
    public Employee createEmployee(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter employee name: ");
        String name=scanner.nextLine();
        System.out.println("Enter employee id: ");
        int empid=scanner.nextInt();
        System.out.println("Enter employee salary: ");
        double salary=scanner.nextDouble();

        Employee employee=new Employee(name,empid,salary);

        return employee;
    }

    public static void main(String[] args) {
       EmployeeArraylistScanner obj=new EmployeeArraylistScanner();

       ArrayList<Employee> employeeArrayList=new ArrayList<>();

       String choice="Y";
       Scanner scanner=new Scanner(System.in);
       while(choice.equals("Y")){
           Employee employee=obj.createEmployee();
           employeeArrayList.add(employee);

           System.out.println("do you want to add more employee? press Y for continue and press any key to exit");
           String newchoice=scanner.nextLine();
           choice=newchoice;
       }
       for(Employee var:employeeArrayList){
           System.out.println("Employee name: "+var.getName()+", empid: "+var.getEmpid()+", salary: "+var.getSalary());
       }

    }


}

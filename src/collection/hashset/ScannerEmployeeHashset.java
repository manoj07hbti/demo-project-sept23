package collection.hashset;

import model.Employee;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ScannerEmployeeHashset {
    public Employee createScannerEmployee(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        String name= scanner.nextLine();
        System.out.println("Enter Emp id: ");
        int empid= scanner.nextInt();
        System.out.println("Enter Salary: ");
        Double salary= scanner.nextDouble();

        Employee employee=new Employee(name,empid,salary);

        return employee;

    }

    public static void main(String[] args) {
        ScannerEmployeeHashset obj=new ScannerEmployeeHashset();
        LinkedHashSet<Employee> emp=new LinkedHashSet<>();

       String choice="y";
        Scanner scanner=new Scanner(System.in);
        while (choice.equals("y")){
            Employee employee=obj.createScannerEmployee();
            emp.add(employee);

            System.out.println("do you want to continue? press y for continue or press any key to exit ");
            String newchoice= scanner.nextLine();
            choice=newchoice;
        }
        for(Employee var:emp){
            System.out.println("Employee name: "+var.getName()+", empid: "+var.getEmpid()+", salary: "+var.getSalary());
        }

    }
}

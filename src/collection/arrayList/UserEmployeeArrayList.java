package collection.arrayList;

import model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class UserEmployeeArrayList {
    // I want to ask user to input data for employee and user should have choice to stop entering the data.
    public Employee createEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the Name of the Employee..");
        String name = sc.nextLine();

        System.out.println("Please enter the Id of the Employee..");
        int id = sc.nextInt();

        System.out.println("Please enter the Age of the Employee..");
        int age = sc.nextInt();

        System.out.println("Please enter the Salary of the Employee");
        double salary = sc.nextDouble();

        Employee  employee=new Employee(name,id,age,salary);
        return employee;
    }

    public ArrayList<Employee> createEmployeeList() {
        ArrayList<Employee> EmployeeArrayList = new ArrayList<>();

        return EmployeeArrayList;
    }

    public static void main(String[] args) {
        UserEmployeeArrayList obj = new UserEmployeeArrayList();
        ArrayList<Employee> employeeArrayList = obj.createEmployeeList();


        String choice = "y";
        while (choice.equals("y")) {
            Employee employee = obj.createEmployee(); // we will get new Student which is entered by User
            employeeArrayList.add(employee);


            System.out.print("Do you want to enter another employee? (y/n): ");
            Scanner sc = new Scanner(System.in);
            String newchoice = sc.next();
            choice = newchoice;
        }
        for (Employee employee : employeeArrayList) {
            System.out.println("Employee Name: " + employee.getEmployeeName() + "\n" +
                    "Employee Id: " + employee.getEmployeeId() + "\n" +
                    "Employee Age: " + employee.getEmployeeAge() + "\n" +
                    "Employee Salary: " + employee.getEmployeeSalary() + "\n");
        }
    }
}







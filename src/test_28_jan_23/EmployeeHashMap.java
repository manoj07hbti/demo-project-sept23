package test_28_jan_23;
import test_28_jan_23.model.Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class EmployeeHashMap {
    public static void addData(HashMap<String, HashSet<Employee>> employeeMap, String companyName) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Employee> employees = new HashSet<>();

        String choice = "y";
        while (choice.equals("y")) {

            System.out.println("Enter employee details for " + companyName);

            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();


            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter employee city: ");
            String city = scanner.nextLine();

            System.out.print("Enter employee department: ");
            String department = scanner.nextLine();

            System.out.print("enter y  another employee || enter n to start another company data : ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextLine();


            employees.add(new Employee(name, salary, city, department));

        }
        // Add the HashSet to the HashMap with the company name as the key
        employeeMap.put(companyName, employees);
    }
    public static void main(String[] args) {
        HashMap<String, HashSet<Employee>> employeeMap = new HashMap<>();

        // Add data using Scanner for IBM, TCS, WIPRO, and CTS
        addData(employeeMap, "IBM");
        addData(employeeMap, "TCS");
        addData(employeeMap, "WIPRO");
        addData(employeeMap, "CTS");

        System.out.println("display all employee data together who is having same city ");
        for (String companyName : employeeMap.keySet()) {
            HashSet<Employee> list = employeeMap.get(companyName);
            for (Employee employee : list) {
                if (employee.getCity().equals("Delhi")) {
                    System.out.println("companyName: " + companyName);
                    System.out.println("Employee details: ");
                    System.out.println("Printing name: " + employee.getName()
                            + "Salary: " + employee.getSalary()
                            + "City: " + employee.getCity()
                            + "Department: " + employee.getDepartment());
                    System.out.println();
                }
            }
            for (Employee employee : list) {
                if (employee.getCity().equals("Pune")) {
                    System.out.println("companyName: " + companyName);
                    System.out.println("Employee details: ");
                    System.out.println("Printing name: " + employee.getName()
                            + "Salary: " + employee.getSalary()
                            + "City: " + employee.getCity()
                            + "Department: " + employee.getDepartment());
                    System.out.println();
                }
            }
            for (Employee employee : list) {
                if (employee.getCity().equals("Agra")) {
                    System.out.println("companyName: " + companyName);
                    System.out.println("Employee details: ");
                    System.out.println("Printing name: " + employee.getName()
                            + "Salary: " + employee.getSalary()
                            + "City: " + employee.getCity()
                            + "Department: " + employee.getDepartment());
                    System.out.println();
                }
            }
        }
        // Create a HashMap to store employees with the same salary
        HashMap<Double, HashSet<String>> salaryMap = new HashMap<>();


        for (String companyName : employeeMap.keySet()) {
            HashSet<Employee> list = employeeMap.get(companyName);
            for (Employee employee : list) {
                double salary = employee.getSalary();
                String employeeDetails = employee.getName() + " " + salary + " " + companyName;

                // Check if salary already exists in salaryMap
                if (salaryMap.containsKey(salary)) {
                    salaryMap.get(salary).add(employeeDetails);
                } else {
                    HashSet<String> employeesWithSameSalary = new HashSet<>();
                    employeesWithSameSalary.add(employeeDetails);
                    salaryMap.put(salary, employeesWithSameSalary);
                }
            }
        }

        // Display employees with the same salary
        for (double salary : salaryMap.keySet()) {
            HashSet<String> employeesWithSameSalary = salaryMap.get(salary);

            if (employeesWithSameSalary.size() > 1) {
                System.out.println("Same Salary: " + salary);
                for (String employeeDetails : employeesWithSameSalary) {
                    System.out.println(employeeDetails);
                }
                System.out.println();
            }
        }
    }
}

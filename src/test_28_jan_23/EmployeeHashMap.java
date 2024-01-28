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
    public static void displayEmployeesBySalary(HashMap<String, Employee> employeeMap) {
        HashMap<Double, StringBuilder> salaryEmployeesMap = new HashMap<>();
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
                if (employee.getCity().equals("Delhi") || employee.getCity().equals("Pune") || employee.getCity().equals("Agra")) {
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
    }
}

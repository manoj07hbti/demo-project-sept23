package test_24_dec_23;

import test_24_dec_23.model.Employee;

import java.util.*;

public class EmployeeHashMap {
    public static void addData(HashMap<String, HashSet<Employee>> employeeMap, String companyName) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Employee> employees = new HashSet<>();

        System.out.println("Enter employee details for " + companyName + " (Type 'done' to finish):");

        String choice = "y";
        if (choice.equals("y")) {

            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();


            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter employee city: ");
            String city = scanner.nextLine();

            System.out.print("Enter employee department: ");
            String department = scanner.nextLine();

            System.out.print("enter y  another employee || enter n to start another company data : ");
            Scanner sc = new Scanner(System.in);
            String newchoice = sc.next();
            choice = newchoice;

            employees.add(new Employee(name, salary, city, department));

        } else if (choice == "n") {
            System.out.println("enter n to start another company data : ");

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


        HashSet<Employee> emp = new HashSet<>();
        for (String employee : employeeMap.keySet()) {
            HashSet<Employee> list = employeeMap.get(employee);
            for (Employee e : list) {
                System.out.println("Printing name: " + e.getName() + " "
                        + "Salary: " + e.getSalary() + " " + "City: " + e.getCity() + " "
                        + "Department: " + e.getDepartment());
                System.out.println();
            }
        }
        //1. display employee who is having salary greater than 50,0000 and belongs to Pune city for IBM and TCS.
        System.out.println("display employee who is having salary greater than 50,0000 and belongs to Pune city for IBM and TCS.");
        for (String employee : employeeMap.keySet()) {
            HashSet<Employee> list = employeeMap.get(employee);
            if (employee.equals("IBM") || employee.equals("TCS")) {
                for (Employee e : list) {
                    if (e.getSalary() > 50000 && e.getCity().equalsIgnoreCase("Pune")) {
                        System.out.println("Printing name: " + e.getName()
                                + " Salary: " + e.getSalary() + " " + " City: " + e.getCity()
                                + " Department: " + e.getDepartment());
                        System.out.println();
                    }
                }
            }
        }
        //2. highest salary employee and lowest salary employee
        System.out.println("highest salary employee and lowest salary employee:");
        Employee max = new Employee("", 0, "", "");
        Employee min = new Employee("", 0, "", "");
        for (HashSet<Employee> employees : employeeMap.values()) {
            for (Employee employee : employees) {
                if (employee.getSalary() > max.getSalary()) {
                    max = employee;
                }

                if (employee.getSalary() < min.getSalary() || min.getSalary() == 0) {
                    min = employee;
                }

            }
        }
        System.out.println("Highest Salary Employee: " + max.getSalary());
        System.out.println("Lowest Salary Employee: " + min.getSalary());

        //4. display all employee data together who is having same city Like
        System.out.println("display all employee data together who is having same city ");
        for (String employee : employeeMap.keySet()) {
            HashSet<Employee> list = employeeMap.get(employee);
            for (Employee e : list) {
                if (e.getCity().equals("Delhi")) {
                    System.out.println("Printing name: " + e.getName() + " "
                            + "Salary: " + e.getSalary() + " " + "City: " + e.getCity() + " "
                            + "Department: " + e.getDepartment());
                }
            }
        }
        for (String employee : employeeMap.keySet()) {
            HashSet<Employee> list = employeeMap.get(employee);
            for (Employee e : list) {
                if (e.getCity().equals("Pune")) {
                    System.out.println("Printing name: " + e.getName() + " "
                            + "Salary: " + e.getSalary() + " " + "City: " + e.getCity() + " "
                            + "Department: " + e.getDepartment());
                }
            }
        }
        for (String employee : employeeMap.keySet()) {
            HashSet<Employee> list = employeeMap.get(employee);
            for (Employee e : list) {
                if (e.getCity().equals("Agra")) {
                    System.out.println("Printing name: " + e.getName() + " "
                            + "Salary: " + e.getSalary() + " " + "City: " + e.getCity() + " "
                            + "Department: " + e.getDepartment());
                }
            }
        }
    }
}





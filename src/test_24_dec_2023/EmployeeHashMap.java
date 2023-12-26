package test_24_dec_2023;

import model.Employee;

import java.util.HashSet;

import java.util.HashMap;

public class EmployeeHashMap {
    public static void main(String[] args) {
        HashMap<String, HashSet<Employee>> employeeHashMap = new HashMap<>();

        Employee employee1 = new Employee("Monika", 53000, "Pune", "Cs");
        Employee employee2 = new Employee("Ayushi", 61000, "Agra", "Cs");
        Employee employee3 = new Employee("Mandar", 49000, "Kota", "IT");

        HashSet<Employee> IBMlist = new HashSet<>();
        IBMlist.add(employee1);
        IBMlist.add(employee2);
        IBMlist.add(employee3);
        employeeHashMap.put("IBM", IBMlist);


        Employee employee4 = new Employee("Akash", 53000, "Pune", "Cs");
        Employee employee5 = new Employee("Pankaj", 60000, "Noida", "IT");
        Employee employee6 = new Employee("Rutuja", 49000, "Kota", "IT");

        HashSet<Employee> TCSlist = new HashSet<>();
        TCSlist.add(employee4);
        TCSlist.add(employee5);
        TCSlist.add(employee6);
        employeeHashMap.put("TCS", TCSlist);


        Employee employee7 = new Employee("Rupesh", 63000, "Pune", "Cs");
        Employee employee8 = new Employee("Madhuri", 61000, "Pune", "IT");
        Employee employee9 = new Employee("Rituraj", 49000, "Noida", "IT");

        HashSet<Employee> WIPROlist = new HashSet<>();
        WIPROlist.add(employee7);
        WIPROlist.add(employee8);
        WIPROlist.add(employee9);
        employeeHashMap.put("WIPRO", WIPROlist);

        Employee employee10 = new Employee("Karan", 65000, "Pune", "Cs");
        Employee employee11 = new Employee("Raghav", 15000, "Agra", "Cs");
        Employee employee12 = new Employee("Yash", 70000, "Delhi", "Cs");

        HashSet<Employee> CTSlist = new HashSet<>();
        CTSlist.add(employee10);
        CTSlist.add(employee11);
        CTSlist.add(employee12);
        employeeHashMap.put("CTS", CTSlist);

         //DISPLAY ALL EMPLOYEES DATA COMPANY WISE

        System.out.println("DISPLAYING ALL EMPLOYEE DATA COMPANY WISE");
            for (String companyName : employeeHashMap.keySet()) {
                System.out.println("Company: " + companyName);
                HashSet<Employee> employees = employeeHashMap.get(companyName);

                for (Employee employee : employees) {
                    System.out.println("Employee details:");
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Salary: " + employee.getSalary());
                    System.out.println("City: " + employee.getCity());
                    System.out.println("Department: " + employee.getDepartment());
                    System.out.println("----------------------");
                }
            }
        System.out.println("***************************************************************************************");

            // DISPLAY HIGHEST AND LOWEST SALARY COMPANY WISE

        System.out.println("Displaying Highest and Lowest salaries of employees company wise");


        for (String companyName : employeeHashMap.keySet()) {
            System.out.println("Company: " + companyName);
            HashSet<Employee> employees = employeeHashMap.get(companyName);

            Employee highestSalaryEmployee = null;
            Employee lowestSalaryEmployee = null;

            double maxSalary = Double.MIN_VALUE;
            double minSalary = Double.MAX_VALUE;

            for (Employee employee : employees) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    highestSalaryEmployee = employee;
                }
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    lowestSalaryEmployee = employee;
                }
            }

            if (highestSalaryEmployee != null) {
                System.out.println("Employee with highest salary:");
                displayEmployeeDetails(highestSalaryEmployee);
            }
            if (lowestSalaryEmployee != null) {
                System.out.println("Employee with lowest salary:");
                displayEmployeeDetails(lowestSalaryEmployee);
            }
            System.out.println("----------------------");
        }

        System.out.println("***************************************************************************************");

        // DISPLAY EMPLOYEE WHOSE SALARY IS GREATER THAN 50000 AND BELONGS TO PUNE CITY FOR IBM AND TCS

        System.out.println("DISPLAY EMPLOYEE WHOSE SALARY IS GREATER THAN 50000 AND BELONGS TO PUNE CITY FOR IBM AND TCS");
        for (String companyName : employeeHashMap.keySet()) {
                if (companyName.equals("IBM") || companyName.equals("TCS")) {
                    System.out.println("Company: " + companyName);

                    HashSet<Employee> employees = employeeHashMap.get(companyName);

                    for (Employee employee : employees) {
                        // Checking if salary > 50000 and city is "Pune"
                        if (employee.getSalary() > 50000 && employee.getCity().equalsIgnoreCase("Pune")) {
                            System.out.println("Employee details:");
                            System.out.println("Name: " + employee.getName());
                            System.out.println("Salary: " + employee.getSalary());
                            System.out.println("City: " + employee.getCity());
                            System.out.println("Department: " + employee.getDepartment());
                            System.out.println("----------------------");
                        }
                    };
                }
            }

        //DISPLAY ALL EMPLOYEES DATA TOGETHER WHO BELONGS TO SAME CITY LIKE PUNE, ALL EMP WILL BE PRINTED THEN AGRA AND SO ON
        // DISPLAY ONLY EMPLOYEES WHOSE SALARY IS SAME FOR ALL COMPANIES
    }

    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("City: " + employee.getCity());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("----------------------");
    }
}

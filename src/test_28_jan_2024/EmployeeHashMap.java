package test_28_jan_2024;

import test_28_jan_2024.Model.Employee;
import test_28_jan_2024.Model.Company;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class EmployeeHashMap
{
    public static Map<String, Company> companies = new HashMap<>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter number of companies:");
            int numCompanies = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            for (int i = 0; i < numCompanies; i++) {
                System.out.println("Enter details for Company " + (i + 1) + ":");
                System.out.print("Name: ");
                String companyName = scanner.nextLine();
                Company company = new Company(companyName);

                System.out.println("Enter number of employees for " + companyName + ":");
                int numEmployees = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                for (int j = 0; j < numEmployees; j++) {
                    System.out.println("Enter details for Employee " + (j + 1) + ":");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("City: ");
                    String city = scanner.nextLine();
                    System.out.print("Department: ");
                    String department = scanner.nextLine();

                    Employee employee = new Employee(name, salary, city, department);
                    company.addEmployee(employee);
                }

                companies.put(companyName, company);
            }

            // Displaying all employees for each company
            for (Company company : companies.values()) {
                System.out.println("\nCompany: " + company.getName());
                Map<String, Employee> employees = company.getEmployees();
                for (Employee employee : employees.values()) {
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Salary: " + employee.getSalary());
                    System.out.println("City: " + employee.getCity());
                    System.out.println("Department: " + employee.getDepartment());
                    System.out.println();
                }
            }

            System.out.println("----------------------");
            // Display All Employees who are in the same city as specified by the user
            System.out.println("Question number 1: Displaying All Employees having the same city as user input");

            System.out.println("Enter the city to display employees:");
            String cityToSearch = scanner.nextLine();
            displayEmployeesByCity(cityToSearch);

            // Creating a map to store employees with their salaries
            Map<Double, List<Employee>> employeesBySalary = new HashMap<>();
            for (Company company : companies.values()) {
                for (Employee employee : company.getEmployees().values()) {
                    double salary = employee.getSalary();
                    List<Employee> employeesWithSameSalary = employeesBySalary.getOrDefault(salary, new ArrayList<>());
                    employeesWithSameSalary.add(employee);
                    employeesBySalary.put(salary, employeesWithSameSalary);
                }
            }

            // Displaying employees with the same salary across all companies
            for (List<Employee> employees : employeesBySalary.values()) {
                if (employees.size() > 1) { // Only consider if there are employees with the same salary across companies
                    System.out.println("\nEmployees with the same salary: " + employees.get(0).getSalary());
                    for (Employee employee : employees) {
                        System.out.println("Company: " + getCompanyName(employee));
                        System.out.println("Name: " + employee.getName());
                        System.out.println("City: " + employee.getCity());
                        System.out.println("Department: " + employee.getDepartment());
                        System.out.println();
                    }
                }
            }
        }

        public static void displayEmployeesByCity(String city) {
            boolean found = false;

            for (Company company : companies.values()) {
                for (Employee employee : company.getEmployees().values()) {
                    if (employee.getCity().equalsIgnoreCase(city)) {
                        System.out.println(employee);
                        found = true;
                    }
                }
            }

            if (!found) {
                System.out.println("No employees found in the specified city.");
            }
        }

        // Helper method to get the company name for an employee
        private static String getCompanyName(Employee employee) {
            for (Map.Entry<String, Company> entry : companies.entrySet()) {
                if (entry.getValue().getEmployees().containsValue(employee)) {
                    return entry.getKey();
                }
            }
            return "";
        }
    }
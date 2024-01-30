package test_28_jan_2024;

import test_28_jan_2024.Model.Employee;
import test_28_jan_2024.Model.Company;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Company> companies = new HashMap<>();

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
        //Display All Employees who is having same city like Pune all emp will be printed then Agra all emp will be printed

        System.out.println("Question number 1: Displaying All Employees having same city with user input");

        System.out.println("Enter the city to display employees:");
        String cityToSearch = scanner.nextLine();
        displayEmployeesByCity(cityToSearch, companies);
    }

    public static void displayEmployeesByCity (String city, Map<String, Company> companies) {
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
            System.out.println("City not available");
        }
    }

}


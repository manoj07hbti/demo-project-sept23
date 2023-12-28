package dec24_test;
import model.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class EmployeeCollection {
   //Write a program to create Employee(name, Salary, City, Dept) HashMap

    public static void main(String[] args) {

        HashMap<String, ArrayList<Employee>> employeeHashMap = new HashMap<>();

        Employee employee1 = new Employee("Puneet", 32000.66, "Faridabad", "Marketing");
        Employee employee2 = new Employee("Monty", 48000.79, "NewDelhi", "Marketing");
        Employee employee3 = new Employee("Himanshu", 53000.57, "Pune", "Finance");
        Employee employee4 = new Employee("Gaurav", 72000.33, "Agra", "Marketing");
        Employee employee5 = new Employee("Deepanshu", 82000.49, "Gurugram", "Finance");


        ArrayList<Employee> ibmList = new ArrayList<>();

        ibmList.add(employee1);
        ibmList.add(employee2);
        ibmList.add(employee3);
        ibmList.add(employee4);
        ibmList.add(employee5);


        System.out.println("Data of IBM company");

        employeeHashMap.put("IBM", ibmList);
        Employee employee6 = new Employee("Viraj", 44000.79, "Indore", "Marketing");
        Employee employee7 = new Employee("Ved", 98000.79, "Pune", "Marketing");
        Employee employee8 = new Employee("Manoj", 41000.79, "Banglore", "Finance");


        ArrayList<Employee> tcsList = new ArrayList<>();

        tcsList.add(employee6);
        tcsList.add(employee7);
        tcsList.add(employee8);

        System.out.println("Data of TCS company");

        employeeHashMap.put("TCS", tcsList);

        Employee employee9 = new Employee("Niyaz", 37000.94, "Mathura", "Marketing");
        Employee employee10 = new Employee("Neeraj", 84000.68, "Pune", "Marketing");
        Employee employee11 = new Employee("Harish", 63000.63, "Delhi", "Finance");

        ArrayList<Employee> wiproList = new ArrayList<>();

        wiproList.add(employee9);
        wiproList.add(employee10);
        wiproList.add(employee11);

        System.out.println("Data of WIPRO company");

        employeeHashMap.put("WIPRO", wiproList);

        Employee employee12 = new Employee("Ravi", 66000.89, "Jaipur", "Marketing");
        Employee employee13 = new Employee("Pradeep", 58000.69, "Jodhpur", "Finance");
        Employee employee14 = new Employee("Jatin", 28000.19, "Agra", "Finance");


        ArrayList<Employee> ctsList = new ArrayList<>();
        ctsList.add(employee12);
        ctsList.add(employee13);
        ctsList.add(employee14);

        System.out.println("Data of CTS company");

        employeeHashMap.put("CTS", ctsList);

        //Insert all the data using Scanner with IBM, TCS , WIPRO AND CTS and display employee who is having salary greater than 50,000 and belongs to Pune city for IBM and TCS.
        for (String key : employeeHashMap.keySet()) {
            if (key.equals("IBM") || key.equals("TCS")) {
                ArrayList<Employee> list = employeeHashMap.get(key);
                for (Employee var : list) {
                    if (var.getSalary() > 50000 && var.getCity().equals("Pune")) {
                        System.out.println("Printing Name: " + var.getName() + " " + "Salary : " + var.getSalary() + " " + "City : " + var.getCity() + " " + "Department : " + var.getDep());
                    }
                }
            }
        }
        //write a method which will find highest salary employee and lowest salary employee
        for (String var : employeeHashMap.keySet()) {
        ArrayList<Employee> list = employeeHashMap.get(var);
        for (Employee Salary : list) {
            System.out.println("Printing name: " + Salary.getName() + " "
                    + "Salary: " + Salary.getSalary() + " " + "City: " + Salary.getCity() + " "
                    + "Department: " + Salary.getDep());
        }
    }
        for (String var : employeeHashMap.keySet()) {
            ArrayList<Employee> list = employeeHashMap.get(var);
            for (Employee emp : list) {
                if (emp.getCity().equals("Pune")) {
                    System.out.println("Printing name: " + emp.getName() + " "
                            + "Salary: " + emp.getSalary() + " " + "City: " + emp.getCity() + " "
                            + "Department: " + emp.getDep());
                }

            }
        }
        for (String var : employeeHashMap.keySet()) {
            ArrayList<Employee> list = employeeHashMap.get(var);
            for (Employee emp : list) {
                if (emp.getCity().equals("Agra")) {
                    System.out.println("Printing name: " + emp.getName() + " "
                            + "Salary: " + emp.getSalary() + " " + "City: " + emp.getCity() + " "
                            + "Department: " + emp.getDep());
                }

            }
        }
        for (String var : employeeHashMap.keySet()) {
            ArrayList<Employee> list = employeeHashMap.get(var);
            for (Employee emp : list) {
                if (emp.getCity().equals("Banglore")) {
                    System.out.println("Printing name: " + emp.getName() + " "
                            + "Salary: " + emp.getSalary() + " " + "City: " + emp.getCity() + " "
                            + "Department: " + emp.getDep());
                }
            }
        }
        }

    }


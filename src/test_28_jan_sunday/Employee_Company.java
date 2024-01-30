package test_28_jan_sunday;

import model.Employee_Data;

import java.util.ArrayList;
import java.util.HashMap;

public class Employee_Company {

    public static void main(String[] args) {
        HashMap<String, ArrayList<Employee_Data>> employeeHashMap = new HashMap<>();

        Employee_Data employee1 = new Employee_Data("Sohan", 87000.79, "Agra", "Marketing");
        Employee_Data employee2 = new Employee_Data("Rohan", 88000.79, "Agra", "Marketing");
        Employee_Data employee3 = new Employee_Data("Shyam", 89000.57, "Pune", "Finance");
        Employee_Data employee4 = new Employee_Data("Ram", 98000.79, "Banglore", "Marketing");
        Employee_Data employee5 = new Employee_Data("Rohit", 82000.79, "Delhi", "Finance");


        ArrayList<Employee_Data> ibmList = new ArrayList<>();


        ibmList.add(employee1);
        ibmList.add(employee2);
        ibmList.add(employee3);
        ibmList.add(employee4);
        ibmList.add(employee5);

        employeeHashMap.put("IBM", ibmList);

        Employee_Data employee6 = new Employee_Data("Kohli", 44000.79, "Agra", "Marketing");
        Employee_Data employee7 = new Employee_Data("Dhoni", 98000.79, "Pune", "Marketing");
        Employee_Data employee8 = new Employee_Data("Rahul", 41000.79, "Agra", "Finance");

        ArrayList<Employee_Data> tcsList = new ArrayList<>();

        tcsList.add(employee6);
        tcsList.add(employee7);
        tcsList.add(employee8);

        employeeHashMap.put("TCS", tcsList);

        Employee_Data employee9 = new Employee_Data("Kovin", 45000.79, "Banglore", "Marketing");
        Employee_Data employee10 = new Employee_Data("Siraj", 84000.79, "Pune", "Marketing");
        Employee_Data employee11 = new Employee_Data("Shami", 49000.79, "Agra", "Finance");

        ArrayList<Employee_Data> wiproList = new ArrayList<>();

        wiproList.add(employee9);
        wiproList.add(employee10);
        wiproList.add(employee11);

        employeeHashMap.put("WIPRO", wiproList);

        Employee_Data employee12 = new Employee_Data("Hardik", 96000.79, "Agra", "Marketing");
        Employee_Data employee13 = new Employee_Data("Jadeja", 88000.79, "Pune", "Finance");
        Employee_Data employee14 = new Employee_Data("Bhumrah", 48000.79, "Agra", "Marketing");


        ArrayList<Employee_Data> ctsList = new ArrayList<>();
        ctsList.add(employee12);
        ctsList.add(employee13);
        ctsList.add(employee14);

        employeeHashMap.put("CTS", ctsList);

        // Display Employees from city Pune

        for (String var : employeeHashMap.keySet()) {
            ArrayList<Employee_Data> list = employeeHashMap.get(var);
            for (Employee_Data emp : list) {
                if (emp.getCity().equals("Pune")) {
                    System.out.println("Printing name: " + emp.getName() + " "
                            + "Salary: " + emp.getSalary() + " " + "City: " + emp.getCity() + " "
                            + "Department: " + emp.getDepartment());
                }

            }
        }
        System.out.println("****************************************");

        // Display Employees from city Agra

        for (String var : employeeHashMap.keySet()) {
            ArrayList<Employee_Data> list = employeeHashMap.get(var);
            for (Employee_Data emp : list) {
                if (emp.getCity().equals("Agra")) {
                    System.out.println("Printing name: " + emp.getName() + " "
                            + "Salary: " + emp.getSalary() + " " + "City: " + emp.getCity() + " "
                            + "Department: " + emp.getDepartment());
                }

            }
        }
        System.out.println("***********************************");


        // Display Employees from city Banglore

        for (String var : employeeHashMap.keySet()) {
            ArrayList<Employee_Data> list = employeeHashMap.get(var);
            for (Employee_Data emp : list) {
                if (emp.getCity().equals("Banglore")) {
                    System.out.println("Printing name: " + emp.getName() + " "
                            + "Salary: " + emp.getSalary() + " " + "City: " + emp.getCity() + " "
                            + "Department: " + emp.getDepartment());
                }
            }
        }


    }
}

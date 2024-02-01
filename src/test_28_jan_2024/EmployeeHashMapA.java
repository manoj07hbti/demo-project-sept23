package test_28_jan_2024;

import model.Employee;
import model.EmployeeHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class EmployeeHashMapA {

    public static void main(String[] args) {

        // .Write a program to create Employee(name, Salary, City, Dept) HashMap and isnert data using scanner:
        //a. display all employee data together who is having same city Like
        //   like Pune all emp will be printed then Agra all emp will be printed and so on
        //b. display only employees who is having same salary for all compapies
        //   like Raj works with IBM 55000 and Rahul works with TCS 55000
        //        RAJ 55000 IBM
        //		Rahul 55000 TCS
        //   all output should be like above format for same salary.

        // HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        HashMap<String, HashSet<EmployeeHashMap>> employeeHashMap= new HashMap<>();

        // Create Employee data;

        // 1;

        model.EmployeeHashMap employee1 = new model.EmployeeHashMap("Shiv", 45000.40, "Agra", "Developer");
        model.EmployeeHashMap employee2 = new model.EmployeeHashMap("Jai", 50000.40, "Pune", "CS");
        model.EmployeeHashMap employee3 = new model.EmployeeHashMap("Raj", 55000.40, "Noida", "IT");


        HashSet<model.EmployeeHashMap> employeeHashMapHashSet= new HashSet<>();

        //

        employeeHashMapHashSet.add(employee1);
        employeeHashMapHashSet.add(employee2);
        employeeHashMapHashSet.add(employee3);


        employeeHashMap.put("IBM", employeeHashMapHashSet);

        // 2;

        model.EmployeeHashMap employee4 = new model.EmployeeHashMap("Shiv", 45000.40, "Agra", "Developer");
        model.EmployeeHashMap employee5 = new model.EmployeeHashMap("Jai", 50000.40, "Pune", "CS");
        model.EmployeeHashMap employee6 = new model.EmployeeHashMap("Rahul", 55000.40, "Noida", "IT");

        HashSet<model.EmployeeHashMap> employeeHashMapHashSet2= new HashSet<>();

        employeeHashMapHashSet.add(employee4);
        employeeHashMapHashSet.add(employee5);
        employeeHashMapHashSet.add(employee6);

        employeeHashMap.put("TCS", employeeHashMapHashSet);

        // city pune;

        for (String var : employeeHashMap.keySet()) {
            HashSet<EmployeeHashMap> list = employeeHashMap.get(var);
            for (EmployeeHashMap emp : list) {
                if (emp.getCity().equals("Pune")) {
                    System.out.println("Printing name: " + emp.getName() + " "
                            + "Salary: " + emp.getSalary() + " " + "City: " + emp.getCity() + " "
                            + "Department: " + emp.getDept());
                }

            }
        }
        System.out.println(" City pune Employee   ");


        // city Agra;

        for (String var : employeeHashMap.keySet()) {
            HashSet<EmployeeHashMap> list = employeeHashMap.get(var);
            for (EmployeeHashMap emp : list) {
                if (emp.getCity().equals("Agra")) {
                    System.out.println("Printing name: " + emp.getName() + " "
                            + "Salary: " + emp.getSalary() + " " + "City: " + emp.getCity() + " "
                            + "Department: " + emp.getDept());
                }

            }
        }
        System.out.println(" City agra Employee   ");



    }

}

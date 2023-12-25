package test_24_dec_23;

import test_24_dec_23.model.Employee;

import java.util.*;

public class DemoEmployeeHashMap {
    public static void main(String[] args) {
        HashMap<String, HashSet<Employee>> employeeHashMap = new HashMap<>();

        Employee employee1 = new Employee("RAJ", 55000, "Pune", "IT");
        Employee employee2 = new Employee("Khushi", 600000, "Agra", "Cs");
        Employee employee3 = new Employee("Alen", 3000, "Pune", "IT");

        HashSet<Employee> IBMlist = new HashSet<>();
        IBMlist.add(employee1);
        IBMlist.add(employee2);
        IBMlist.add(employee3);
        employeeHashMap.put("IBM", IBMlist);


        Employee employee4 = new Employee("ROHAN", 55000, "Pune", "Cs");
        Employee employee5 = new Employee("Kunal", 2000, "Delhi", "IT");
        Employee employee6 = new Employee("Akshay", 350000, "Agra", "Cs");

        HashSet<Employee> TCSlist = new HashSet<>();
        TCSlist.add(employee4);
        TCSlist.add(employee5);
        TCSlist.add(employee6);
        employeeHashMap.put("TCS", TCSlist);


        Employee employee7 = new Employee("viki", 1000000, "Delhi", "Cs");
        Employee employee8 = new Employee("Keshav", 6700, "Pune", "IT");
        Employee employee9 = new Employee("Ajay", 300000, "Agra", "IT");

        HashSet<Employee> INFOSYSlist = new HashSet<>();
        INFOSYSlist.add(employee7);
        INFOSYSlist.add(employee8);
        INFOSYSlist.add(employee9);
        employeeHashMap.put("INFOSYS", INFOSYSlist);

        Employee employee10 = new Employee("pankaj", 80000, "Pune", "Cs");
        Employee employee11 = new Employee("firoz", 9500, "Pune", "IT");
        Employee employee12 = new Employee("yogesh", 10000, "Agra", "Cs");
        HashSet<Employee> WIPROlist = new HashSet<>();
        WIPROlist.add(employee10);
        WIPROlist.add(employee11);
        WIPROlist.add(employee12);
        employeeHashMap.put("WIPRO", WIPROlist);

        Employee employee13 = new Employee("anjali", 650000, "Pune", "IT");
        Employee employee14 = new Employee("priya", 10000, "Agra", "Cs");
        Employee employee15 = new Employee("mehak", 900000, "Delhi", "Cs");
        HashSet<Employee> CTSlist = new HashSet<>();
        CTSlist.add(employee13);
        CTSlist.add(employee14);
        CTSlist.add(employee15);
        employeeHashMap.put("CTS", CTSlist);


        //1. Display employees with salary > 50,000 and city = "Pune" for IBM and TCS
        System.out.println("Display employees with salary > 50,000 and city = Pune for IBM and TCS");
            for (Map.Entry<String, HashSet<Employee>> entry : employeeHashMap.entrySet()) {
                String companyName = entry.getKey();
                HashSet<Employee> employees = entry.getValue();
                if (companyName.equals("IBM") || companyName.equals("TCS")) {
                    for (Employee employee : employees) {
                        if (employee.getSalary() > 50000 && employee.getCity().equalsIgnoreCase("Pune")) {
                            System.out.println("Printing name: " + employee.getName() + " "
                                    + "Salary: " + employee.getSalary() + " " + "City: " + employee.getCity() + " "
                                    + "Department: " + employee.getDepartment());

                    }
                }
            }
            //3. display all companies employees data company wise
            System.out.println("display all companies employees data company wise");
            for (Map.Entry<String, HashSet<Employee>> key : employeeHashMap.entrySet()) {
                for (Employee employee : employees) {
                    System.out.println("Company: " + companyName);
                    System.out.println("Printing name: " + employee.getName() + " "
                            + "Salary: " + employee.getSalary() + " " + "City: " + employee.getCity() + " "
                            + "Department: " + employee.getDepartment());
                }


            }
            //4. display all employee data together who is having same city
            System.out.println("display all employee data together who is having same city");
            for (String var : employeeHashMap.keySet()) {
                HashSet<Employee> list = employeeHashMap.get(var);
                for (Employee employee : list) {
                    if (employee.getCity().equals("Pune")) {
                        System.out.println("Printing name: " + employee.getName() + " "
                                + "Salary: " + employee.getSalary() + " " + "City: " + employee.getCity() + " "
                                + "Department: " + employee.getDepartment());
                    }

                }

            }

            for (String var : employeeHashMap.keySet()) {
                HashSet<Employee> list = employeeHashMap.get(var);
                for (Employee employee : list) {
                    if (employee.getCity().equals("Agra")) {
                        System.out.println("Printing name: " + employee.getName() + " "
                                + "Salary: " + employee.getSalary() + " " + "City: " + employee.getCity() + " "
                                + "Department: " + employee.getDepartment());
                    }
                }
            }
            for (String var : employeeHashMap.keySet()) {
                HashSet<Employee> list = employeeHashMap.get(var);
                for (Employee employee : list) {
                    if (employee.getCity().equals("Delhi")) {
                        System.out.println("Printing name: " + employee.getName() + " "
                                + "Salary: " + employee.getSalary() + " " + "City: " + employee.getCity() + " "
                                + "Department: " + employee.getDepartment());
                    }
                }
            }
        }
    }
}






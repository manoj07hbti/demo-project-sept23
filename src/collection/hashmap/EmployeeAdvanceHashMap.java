package collection.hashmap;

import model.Employee;

import java.util.HashMap;
import java.util.HashSet;

public class EmployeeAdvanceHashMap {
    public static void main(String[] args) {
        HashMap<String, HashSet<Employee>> employeeHashMap = new HashMap<>();

        Employee employee1 = new Employee("Reem", 1, 21, 5000);
        Employee employee2 = new Employee("Khushi", 2, 18, 1098.87077);
        Employee employee3 = new Employee("Alen", 3, 35, 400.005);
        Employee employee4 = new Employee("john", 4, 20, 65000);
        Employee employee5 = new Employee("anil", 5, 16, 4009.87077);
        Employee employee6 = new Employee("riya", 6, 50, 2000.005);
        Employee employee7 = new Employee("meena", 7, 27, 5000);
        Employee employee8 = new Employee("jiya", 8, 19, 2000098.87077);
        Employee employee9 = new Employee("neha", 9, 40, 500);
        Employee employee10 = new Employee("zen", 10, 23, 900000);

        HashSet<Employee> IBMlist = new HashSet<>();
        IBMlist.add(employee1);
        IBMlist.add(employee2);
        IBMlist.add(employee3);
        IBMlist.add(employee4);
        IBMlist.add(employee5);
        IBMlist.add(employee6);
        IBMlist.add(employee7);
        IBMlist.add(employee8);
        IBMlist.add(employee9);
        IBMlist.add(employee10);
        employeeHashMap.put("IBM", IBMlist);


        Employee employee11 = new Employee("Rekha", 1, 20, 55000);
        Employee employee12 = new Employee("Kunal", 2, 38, 10098.87077);
        Employee employee13 = new Employee("Akshay", 3, 75, 70000.005);
        Employee employee14 = new Employee("joohi", 4, 29, 25000);
        Employee employee15 = new Employee("aniket", 5, 36, 110098.87077);
        Employee employee16 = new Employee("ridhi", 6, 57, 45000.005);
        Employee employee17 = new Employee("menu", 7, 27, 4000);
        Employee employee18 = new Employee("joshi", 8, 49, 198.87077);
        Employee employee19 = new Employee("naiza", 9, 70, 85000.005);
        Employee employee20 = new Employee("zoya", 10, 24, 100000000);

        HashSet<Employee> TCSlist = new HashSet<>();
        TCSlist.add(employee11);
        TCSlist.add(employee12);
        TCSlist.add(employee13);
        TCSlist.add(employee14);
        TCSlist.add(employee15);
        TCSlist.add(employee16);
        TCSlist.add(employee17);
        TCSlist.add(employee18);
        TCSlist.add(employee19);
        TCSlist.add(employee20);
        employeeHashMap.put("TCS", TCSlist);


        Employee employee21 = new Employee("viki", 1, 22, 45000);
        Employee employee22 = new Employee("Keshav", 2, 98, 1098.87077);
        Employee employee23 = new Employee("Ajay", 3, 33, 300.005);
        Employee employee24 = new Employee("muna", 4, 23, 500);
        Employee employee25 = new Employee("anjali", 5, 36, 50000000);
        Employee employee26 = new Employee("priya", 6, 60, 30);
        Employee employee27 = new Employee("mehak", 7, 47, 80000);
        Employee employee28 = new Employee("pankaj", 8, 29, 10.87077);
        Employee employee29 = new Employee("firoz", 9, 30, 250008.005);
        Employee employee30 = new Employee("yogesh", 10, 20, 95000);

        HashSet<Employee> INFOSYSlist = new HashSet<>();
        INFOSYSlist.add(employee21);
        INFOSYSlist.add(employee22);
        INFOSYSlist.add(employee23);
        INFOSYSlist.add(employee24);
        INFOSYSlist.add(employee25);
        INFOSYSlist.add(employee26);
        INFOSYSlist.add(employee27);
        INFOSYSlist.add(employee28);
        INFOSYSlist.add(employee29);
        INFOSYSlist.add(employee30);
        employeeHashMap.put("INFOSYS", INFOSYSlist);

        for (String key : employeeHashMap.keySet()) {
            HashSet<Employee> list = employeeHashMap.get(key);
            for (Employee var : list) {
                if (key.equals("TCS") && var.getEmployeeSalary() > 45000) {
                    System.out.println("**********Printing" + key + "****************");
                    System.out.println("Name: " + var.getEmployeeName() + " Id: " + var.getEmployeeId() + " Age:" + var.getEmployeeAge() + " Salary" + var.getEmployeeSalary());
                }
            }
        }
        for (String key : employeeHashMap.keySet()) {
            HashSet<Employee> list = employeeHashMap.get(key);
            for (Employee var : list) {
                if (key.equals("TCS") && var.getEmployeeSalary() > 45000) {
                    System.out.println("**********Printing" + key + "****************");
                    System.out.println("Name: " + var.getEmployeeName() + " Id: " + var.getEmployeeId() + " Age:" + var.getEmployeeAge() + " Salary" + var.getEmployeeSalary());
                }
            }
        }
        for (String key : employeeHashMap.keySet()) {
            HashSet<Employee> list = employeeHashMap.get(key);
            for (Employee var : list) {
                if (key.equals("IBM") && var.getEmployeeSalary() > 45000) {
                    System.out.println("**********Printing" + key + "****************");
                    System.out.println("Name: " + var.getEmployeeName() + " Id: " + var.getEmployeeId() + " Age:" + var.getEmployeeAge() + " Salary" + var.getEmployeeSalary());
                }
            }
        }
    }
}

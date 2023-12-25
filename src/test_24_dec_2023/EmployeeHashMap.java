package test_24_dec_2023;

import model.Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class EmployeeHashMap {

    public static void main(String[] args) {

        // HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        HashMap<String, HashSet<model.EmployeeHashMap>> employeeHashMap= new HashMap<>();

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
        model.EmployeeHashMap employee6 = new model.EmployeeHashMap("Raj", 55000.40, "Noida", "IT");

        HashSet<model.EmployeeHashMap> employeeHashMapHashSet2= new HashSet<>();

        employeeHashMapHashSet.add(employee4);
        employeeHashMapHashSet.add(employee5);
        employeeHashMapHashSet.add(employee6);

        employeeHashMap.put("TCS", employeeHashMapHashSet);

        // 3;

        model.EmployeeHashMap employee7 = new model.EmployeeHashMap("Shiv", 45000.40, "Agra", "Developer");
        model.EmployeeHashMap employee8 = new model.EmployeeHashMap("Jai", 50000.40, "Pune", "CS");
        model.EmployeeHashMap employee9 = new model.EmployeeHashMap("Raj", 55000.40, "Noida", "IT");

        HashSet<model.EmployeeHashMap> employeeHashMapHashSet3= new HashSet<>();

        employeeHashMapHashSet.add(employee7);
        employeeHashMapHashSet.add(employee8);
        employeeHashMapHashSet.add(employee9);


        employeeHashMap.put("WIPRO", employeeHashMapHashSet);

        // 4;

        model.EmployeeHashMap employee10 = new model.EmployeeHashMap("Shiv", 45000.40, "Agra", "Developer");
        model.EmployeeHashMap employee11 = new model.EmployeeHashMap("Jai", 50000.40, "Pune", "CS");
        model.EmployeeHashMap employee12 = new model.EmployeeHashMap("Raj", 55000.40, "Noida", "IT");

        //

        HashSet<model.EmployeeHashMap> employeeHashMapHashSet4= new HashSet<>();

        employeeHashMapHashSet.add(employee10);
        employeeHashMapHashSet.add(employee11);
        employeeHashMapHashSet.add(employee12);


        employeeHashMap.put("CTS", employeeHashMapHashSet);

        // who is having salary greater than 50,0000 and belongs to Pune city for IBM and TCS.

        for (String var : employeeHashMap.keySet()) {

            if (var.equals("IBM") || var.equals("TCS")) {

                HashSet<model.EmployeeHashMap> employeeHashSet = employeeHashMap.get(var);

                for (model.EmployeeHashMap emp : employeeHashSet) {

                    if (emp.getSalary() > 50000 && emp.getCity().equals("Pune")) {
                        System.out.println("Printing :" + emp.getName());
                        System.out.println("Name: " + emp.getName() + " Salary: " + emp.getSalary() + " city:" + emp.getCity() + " Dept: " + emp.getDept());
                    }
                }

            }
        }
    }
}

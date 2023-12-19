package collection.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Employee {

    // 1 Employee;

    public void createEmployeeMap() {

        // HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        HashMap<Integer, model.Employee> employees = new HashMap<>();

        // Create Employee data;

        model.Employee employee1 = new model.Employee("Shiv", 45000, "IT");
        model.Employee employee2 = new model.Employee("Ajay", 55000, "CS");
        model.Employee employee3 = new model.Employee("Rahul", 65000, "ME");

        employees.put(1, employee1);
        employees.put(2, employee2);
        employees.put(3, employee3);

        Set<Integer> keys = employees.keySet();

        for (Integer var : keys) {

            System.out.println("Printing employee data: " + employees.get(var).getName() + " Salary:" + employees.get(var).getSalary() + " Section:" + employees.get(var).getSection());
        }
    }

    public static void main(String[] args) {

        Employee obj = new Employee();
        obj.createEmployeeMap();
    }
}

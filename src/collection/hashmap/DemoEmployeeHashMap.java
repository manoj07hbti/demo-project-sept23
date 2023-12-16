package collection.hashmap;

import model.Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DemoEmployeeHashMap {
    public void createEmployeeMap(){
        HashMap<Integer, Employee> employees=new HashMap<>();
        Employee employee1 = new Employee("Reem", 1, 21, 5000);
        Employee employee2 = new Employee("Khushi", 2, 18, 10098.87077);
        Employee employee3 = new Employee("Alen", 3, 35, 3000.005);

        employees.put(1,employee1);
        employees.put(2,employee2);
        employees.put(3,employee3);

        Set<Integer> keys= employees.keySet();
        for(Integer var: keys){

            System.out.println("Printing employee data: ");
            System.out.println("Name: "+employees.get(var).getEmployeeName()+"\n"
                    + "Id:"+employees.get(var).getEmployeeId()+"\n"
                    + "Age:"+employees.get(var).getEmployeeAge()+"\n"
                    + "Salary:"+employees.get(var).getEmployeeSalary());
        }
    }

    public static void main(String[] args) {
        DemoEmployeeHashMap obj=new DemoEmployeeHashMap();
        obj.createEmployeeMap();
    }
}

package collection.hashmap;

import model.Employee;

import java.util.HashMap;
import java.util.Set;

public class Employee_HashMap {

    public void createEmployeeMap(){
        HashMap<Integer, Employee> employeeHashMap=new HashMap<>();


        Employee employee1 = new Employee("Shyam", 23, 89000.56);
        Employee employee2 = new Employee("Ram", 24, 97000.86);
        Employee employee3 = new Employee("Sohan", 23, 77000.66);

        employeeHashMap.put(1,employee1);
        employeeHashMap.put(2,employee2);
        employeeHashMap.put(3,employee3);

        Set<Integer> keys=employeeHashMap.keySet();

        for (Integer var:keys){
            System.out.println("Printing Employees Information:"+employeeHashMap.get(var).getName()+" "
            +"Age: "+employeeHashMap.get(var).getAge()+" "+"Salary: "+employeeHashMap.get(var).getSalary());
        }

    }

    public static void main(String[] args) {
        Employee_HashMap obj=new Employee_HashMap();
        obj.createEmployeeMap();
    }
}

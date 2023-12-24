package collection.hashmap;

import model.Employee;

import java.util.HashMap;
import java.util.Set;

public class DemoEmployee {
    public void createEmployeeData(){
        HashMap<Integer, Employee> demoEmployee=new HashMap<>();

        Employee employee1=new Employee("Deepak",335566,46546.05);
        Employee employee2=new Employee("Atharv",44889,205532.05);
        Employee employee3=new Employee("Arjun",66358,250456.60);

        demoEmployee.put(1,employee1);
        demoEmployee.put(2,employee2);
        demoEmployee.put(3,employee3);

        Set<Integer>keys=demoEmployee.keySet();

        for (Integer var:keys){
            System.out.println("printing employee detail: "+demoEmployee.get(var).getName()+",emp id: "+demoEmployee.get(var).getEmpid()+",Salary: "+demoEmployee.get(var).getSalary());
        }

    }

    public static void main(String[] args) {
        DemoEmployee obj=new DemoEmployee();
        obj.createEmployeeData();
    }
}

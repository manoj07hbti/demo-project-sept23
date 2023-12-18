package collection.hashset;

import model.Employee;

import java.util.HashSet;

public class DemoEmployeeHashset {
    public HashSet<Employee> createEmployeeSet(){

        HashSet<Employee> list=new HashSet<>();

        Employee employee1=new Employee("Deepak",443588,20000.80);
        Employee employee2=new Employee("Arjun",557799,500000.658);
        Employee employee3=new Employee("Atharv",998877,800000.56);
        Employee employee4=new Employee("khusboo",225588,100000.852);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);

        return list;
    }

    public static void main(String[] args) {
        DemoEmployeeHashset obj=new DemoEmployeeHashset();
        HashSet<Employee> output=obj.createEmployeeSet();

        for(Employee var:output){
            System.out.println("printing Employee data: "+var.getName()+"(emp id),"+var.getEmpid()+"(salary),"+var.getSalary());
        }
    }
}

package collection;

import model.Employee;

import java.util.ArrayList;

public class Employee_ArrayList {

    public ArrayList<Employee> createEmployeeList() {
        ArrayList<Employee> employeeArraylist = new ArrayList<>();

        Employee employee1 = new Employee("Shyam", 23, 89000.56);
        Employee employee2 = new Employee("Ram", 24, 97000.86);
        Employee employee3 = new Employee("Sohan", 23, 77000.66);

        employeeArraylist.add(employee1);
        employeeArraylist.add(employee2);
        employeeArraylist.add(employee3);


        return employeeArraylist;
    }

    public static void main(String[] args) {
        Employee_ArrayList obj = new Employee_ArrayList();
        ArrayList<Employee> employees = obj.createEmployeeList();

        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Printing employee name: " + employees.get(i).getName() + " Age : " + employees.get(i).getAge()+" Salary: "+employees.get(i).getSalary());
        }
    }
}
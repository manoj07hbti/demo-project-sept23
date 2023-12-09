package collection;

import model.Employee;

import java.util.ArrayList;

public class Demo_Employee {
    public ArrayList<Employee> Createemployeearraylist() {
        ArrayList<Employee> demo_employee = new ArrayList<>();

        Employee employee1 = new Employee("ashok", 12356, 50000.25);
        Employee employee2 = new Employee("shubham", 65856, 12300.25);
        Employee employee3 = new Employee("aditya", 12741, 75000.25);

        demo_employee.add(employee1);
        demo_employee.add(employee2);
        demo_employee.add(employee3);

        return demo_employee;

    }

    public static void main(String[] args) {
        Demo_Employee obj = new Demo_Employee();
        ArrayList<Employee> employees = obj.Createemployeearraylist();

        for (Employee var : employees) {
            System.out.println("Advance for loop Employee details: " + var.getName() + " / " + var.getEmpid() + " / " + var.getSalary());
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("for loop Employee details: " + employees.get(i).getName() + " / " + employees.get(i).getEmpid() + " / " + employees.get(i).getSalary());
        }
        int a = 0;
        while (a < employees.size()) {
            System.out.println("while loop Employee details: " + employees.get(a).getName() + " / " + employees.get(a).getEmpid() + " / " + employees.get(a).getSalary());
            a++;
        }
        int b = 0;
        do {
            System.out.println("do while loop Employee details: " + employees.get(b).getName() + " / " + employees.get(b).getEmpid() + " / " + employees.get(b).getSalary());
            b++;
        } while (b < employees.size());

    }
}

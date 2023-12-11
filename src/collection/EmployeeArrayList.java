package collection;

import model.Employee;

import java.util.ArrayList;

public class EmployeeArrayList {

    public ArrayList<Employee> createEmployeeList() {

        // CollectionName <Datatype> objName = new CollectionName<>();

        ArrayList<Employee> EmployeeArraylist = new ArrayList<>();

        // Create Employee data;

        Employee employee1 = new Employee("Shiv", 45000, "IT");
        Employee employee2 = new Employee("Ajay", 55000, "CS");
        Employee employee3 = new Employee("Rahul", 65000, "ME");

        EmployeeArraylist.add(employee1);
        EmployeeArraylist.add(employee2);
        EmployeeArraylist.add(employee3);

        return EmployeeArraylist;
    }
    public static void main(String[] args) {

        EmployeeArrayList obj = new EmployeeArrayList();
        ArrayList<Employee> employees= obj.createEmployeeList();

        // for loop;

        for (int i = 0; i < employees.size(); i++) {

            System.out.println("Printing Employee Array List using for loop: " + employees .get(i).getName() + " Salary: " + employees.get(i).getSalary() + " Section: " + employees.get(i).getSection());
        }
        // while loop;

        int a = 0;
        while (a < employees.size()) {

            System.out.println("Printing Employee Array List using while loop: " + employees.get(a).getName() + " Salary: " + employees.get(a).getSalary() + " Section: " + employees.get(a).getSection());
            a++;
        }
        // Advance for loop;

        for (Employee var : employees) {

            System.out.println("Printing Employee Array List using advance for loop: " + var.getName() + " Salary: " + var.getSalary() + " Section: " + var.getSection());
        }
        // do while loop;

        a = 0;
        do {
            System.out.println("Printing Employee Array List using do while loop: " + employees.get(a).getName() + " Salary: " + employees.get(a).getSalary() + " Section: " + employees.get(a).getSection());
            a++;
        } while (a < employees.size());
    }
}

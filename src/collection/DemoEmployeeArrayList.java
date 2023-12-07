package collection;
import model.Employee;

import java.util.ArrayList;

public class DemoEmployeeArrayList {
    public ArrayList<Employee> createEmployeeList() {
        ArrayList<Employee> EmployeeArrayList = new ArrayList<>();// we have created variable of Student arraylist

        // create Student data
        Employee employee1 = new Employee("Reem", 1, 21, 5000);
        Employee employee2 = new Employee("Khushi", 2, 18, 10098.87077);
        Employee employee3 = new Employee("Alen", 3, 35, 3000.005);

        EmployeeArrayList.add(employee1);
        EmployeeArrayList.add(employee2);
        EmployeeArrayList.add(employee3);


        return EmployeeArrayList;
    }

    public static void main(String[] args) {
        DemoEmployeeArrayList obj = new DemoEmployeeArrayList();
        ArrayList<Employee> employees = obj.createEmployeeList();

        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Printing list data with loop: " + employees.get(i));
        }
        int k = 0;
        while (k < employees.size()) {
            System.out.println("Printing list using while loop: " + employees.get(k));
            k++;
        }
        int j = 0;
        do {
            System.out.println("Printing list using do-while loop: " + employees.get(j));
            j++;
        } while (j < employees.size());


        for (Object var : employees) {
            System.out.println("Printing using Advanced loop: " + var);
        }

    }
}

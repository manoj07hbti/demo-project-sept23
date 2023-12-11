package collection.arrayList;
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
            System.out.println("Printing employee Info using for loop");
            System.out.println("Printing employee Name: " + employees.get(i).getEmployeeName()+"\n"
                    + "employeeId: " + employees.get(i).getEmployeeId() +"\n"+
                    "employeeAge: " + employees.get(i).getEmployeeAge()+"\n"
                    + "employeeSalary: " + employees.get(i).getEmployeeSalary());
        }
        int k = 0;
        while (k < employees.size()) {
            System.out.println("Printing employee Info using While loop");
            System.out.println("Printing employee Name: " + employees.get(k).getEmployeeName()+"\n"
                    + "employeeId: " + employees.get(k).getEmployeeId() +"\n"+
                    "employeeAge: " + employees.get(k).getEmployeeAge()+"\n"
                    + "employeeSalary: " + employees.get(k).getEmployeeSalary());
            k++;
        }
        int j = 0;
        do {
            System.out.println("Printing employee Info using do-While loop");
            System.out.println("Printing employee Name: " + employees.get(j).getEmployeeName()+"\n"
                    + "employeeId: " + employees.get(j).getEmployeeId() +"\n"+
                    "employeeAge: " + employees.get(j).getEmployeeAge()+"\n"
                    + "employeeSalary: " + employees.get(j).getEmployeeSalary());
            j++;
        } while (j < employees.size());


        for (Employee var : employees) {
            System.out.println("Printing employee Info using Advance for loop");
            System.out.println("Printing employee Name: " + var.getEmployeeName()+"\n"
                    + "employeeId: " + var.getEmployeeId() +"\n"+
                    "employeeAge: " + var.getEmployeeAge()+"\n"
                    + "employeeSalary: " + var.getEmployeeSalary());

        }
    }
}


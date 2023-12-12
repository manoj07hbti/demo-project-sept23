package collection.hashSet;

import model.Employee;

import java.util.HashSet;

public class DemoEmployeeHashSet {
    public HashSet<Employee> createEmployeeSet() {

        //CollectionName <Datatype> objName = new CollectionName<>();

        HashSet<Employee> emlpoyeeHashSet = new HashSet<>();


        Employee employee1 = new Employee("Reem", 1, 21, 5000);
        System.out.println("Printing hashcode of employee1: " + employee1.hashCode());

        Employee employee2 = new Employee("Khushi", 2, 18, 10098.87077);
        System.out.println("Printing hashcode of employee2: " + employee2.hashCode());

        Employee employee3 = new Employee("Alen", 3, 35, 3000.005);
        System.out.println("Printing hashcode of employee3: " + employee3.hashCode());

        Employee employee4 = new Employee("Reem", 1, 21, 5000);
        System.out.println("Printing hashcode of employee4: " + employee4.hashCode());

        Employee employee5 = new Employee("Khushi", 2, 18, 10098.87077);
        System.out.println("Printing hashcode of employee5: " + employee5.hashCode());

        emlpoyeeHashSet.add(employee1);
        emlpoyeeHashSet.add(employee2);
        emlpoyeeHashSet.add(employee3);
        emlpoyeeHashSet.add(employee4);
        emlpoyeeHashSet.add(employee5);


        return emlpoyeeHashSet;
    }

    public static void main(String[] args) {
        DemoEmployeeHashSet obj = new DemoEmployeeHashSet();
        HashSet<Employee> employees = obj.createEmployeeSet();

        for (Employee var : employees) {
            System.out.println("Printing name: " + var.getEmployeeName() + "\n " + "Printing Id: " + var.getEmployeeId() + "\n" + "Printing Age: " + var.getEmployeeAge() + "\n " + "Printing Salary: " + var.getEmployeeSalary());
        }
    }
}


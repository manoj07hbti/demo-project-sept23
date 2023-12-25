package test_24_dec_23;

import model.Employee;

import java.util.HashSet;

public class DemoEmployeeHashSet {
    public HashSet<test_24_dec_23.model.Employee> createEmployeeSet() {
        HashSet<test_24_dec_23.model.Employee> emlpoyeeHashSet = new HashSet<>();
        test_24_dec_23.model.Employee employee1 = new test_24_dec_23.model.Employee("Reem", 1, "Pune", "CS");
        System.out.println("Printing hashcode of employee1: " + employee1.hashCode());

        test_24_dec_23.model.Employee employee2 = new test_24_dec_23.model.Employee("Khushi", 2, "Delhi", "CS");
        System.out.println("Printing hashcode of employee2: " + employee2.hashCode());

        test_24_dec_23.model.Employee employee3 = new test_24_dec_23.model.Employee("Alen", 3, "Agra", "IT");
        System.out.println("Printing hashcode of employee3: " + employee3.hashCode());

        test_24_dec_23.model.Employee employee4 = new test_24_dec_23.model.Employee("Reem", 1, "Pune", "IT");
        System.out.println("Printing hashcode of employee4: " + employee4.hashCode());


        test_24_dec_23.model.Employee employee5 = new test_24_dec_23.model.Employee("Khushi", 2, "Pune", "Cs");
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
        HashSet<test_24_dec_23.model.Employee> employees = obj.createEmployeeSet();

        for (test_24_dec_23.model.Employee var : employees) {
            System.out.println("Printing name: " + var.getName() + "\n " + "Printing city: "
                    + var.getCity() + "\n" + "Printing Department : " + var.getDepartment() + "\n " +
                    "Printing Salary: " + var.getSalary());
        }
    }
}


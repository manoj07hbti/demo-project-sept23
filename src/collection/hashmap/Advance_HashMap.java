package collection.hashmap;

import model.Employee;
import model.Engineer;

import java.util.HashMap;
import java.util.HashSet;

public class Advance_HashMap {

    public static void main(String[] args) {

        HashMap<String, HashSet<Employee>> employeeHashMap = new HashMap<>();


        Employee employee1 = new Employee("Shyam", 23, 89000.56);
        Employee employee2 = new Employee("Ram", 24, 97000.86);
        Employee employee3 = new Employee("Sohan", 23, 77000.66);
        Employee employee4 = new Employee("Sohail", 25, 41000.56);
        Employee employee5 = new Employee("Raja", 27, 42000.86);

        HashSet<Employee> employeeSet = new HashSet<>();

        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);

        employeeHashMap.put("IBM", employeeSet);


        Employee employee6 = new Employee("Kohli", 23, 85000.56);
        Employee employee7 = new Employee("Vikas", 25, 43000.86);
        Employee employee8 = new Employee("Rohan", 22, 79000.66);
        Employee employee9 = new Employee("Sharbdul", 27, 44000.56);
        Employee employee10 = new Employee("Bhumrah", 26, 97000.86);

        HashSet<Employee> tcsSet = new HashSet<>();

        tcsSet.add(employee6);
        tcsSet.add(employee7);
        tcsSet.add(employee8);
        tcsSet.add(employee9);
        tcsSet.add(employee10);

        employeeHashMap.put("TCS", tcsSet);

        Employee employee11 = new Employee("Abhishek", 23, 81000.56);
        Employee employee12 = new Employee("Sarad", 24, 43000.86);
        Employee employee13 = new Employee("Rohit", 21, 42000.66);
        Employee employee14 = new Employee("Gill", 25, 80000.56);
        Employee employee15 = new Employee("Virat", 26, 40000.86);
        Employee employee16 = new Employee("Raina", 27, 77000.66);

        HashSet<Employee> infosysSet = new HashSet<>();

        infosysSet.add(employee11);
        infosysSet.add(employee12);
        infosysSet.add(employee13);
        infosysSet.add(employee14);
        infosysSet.add(employee15);
        infosysSet.add(employee16);

        employeeHashMap.put("Infosys", infosysSet);

        for (String var : employeeHashMap.keySet()) {
            if (var.equals("IBM")||var.equals("TCS")) {

                    HashSet<Employee> set = employeeHashMap.get(var);
                    for (Employee emp : set) {
                        if (emp.getSalary() > 45000) {
                            System.out.println("Employees Information: " + emp.getName() + " "
                                    + "Age: " + emp.getAge() + " " + "Salary: " + emp.getSalary());
                        }
                    }

                }
            }


        }
    }


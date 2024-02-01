package jan28_test;
import java.util.ArrayList;
import java.util.HashMap;
public class EmployeeData {

    public static void main(String[] args) {
        HashMap<String, ArrayList<Employee>> employeeHashMap = new HashMap<>();

        Employee employee1 = new Employee("Shayam", 56000.23, "Faridabad", "Marketing");
        Employee employee2 = new Employee("Amit", 76000.65, "Noida", "Marketing");
        Employee employee3 = new Employee("Tejpal", 87000.50, "Pune", "Finance");
        Employee employee4 = new Employee("Rohan", 77000.99, "Mumbai", "Marketing");
        Employee employee5 = new Employee("Gaurav", 87000.69, "Delhi", "Finance");


        ArrayList<Employee> ibmList = new ArrayList<>();

        ibmList.add(employee1);
        ibmList.add(employee2);
        ibmList.add(employee3);
        ibmList.add(employee4);
        ibmList.add(employee5);

        employeeHashMap.put("IBM", ibmList);

        Employee employee6 = new Employee("Deepanshu", 66000.56, "Faridabad", "Marketing");
        Employee employee7 = new Employee("Yogesh", 88000.59, "Pune", "Marketing");
        Employee employee8 = new Employee("Ved", 55000.23, "Delhi", "Finance");

        ArrayList<Employee> tcsList = new ArrayList<>();

        tcsList.add(employee6);
        tcsList.add(employee7);
        tcsList.add(employee8);

        employeeHashMap.put("TCS", tcsList);

        Employee employee9 = new Employee("Puneet", 66000.40, "Mumbai", "Marketing");
        Employee employee10 = new Employee("Ram", 85000.66, "Pune", "Marketing");
        Employee employee11 = new Employee("Lakshman", 56000.98, "Agra", "Finance");

        ArrayList<Employee> wiproList = new ArrayList<>();

        wiproList.add(employee9);
        wiproList.add(employee10);
        wiproList.add(employee11);

        employeeHashMap.put("WIPRO", wiproList);

        Employee employee12 = new Employee("Hirdesh", 90000.29, "Agra", "Marketing");
        Employee employee13 = new Employee("Shekhar", 87000.72, "Delhi", "Finance");
        Employee employee14 = new Employee("Ashok", 58000.79, "Faridabad", "Marketing");


        ArrayList<Employee> ctsList = new ArrayList<>();
        ctsList.add(employee12);
        ctsList.add(employee13);
        ctsList.add(employee14);

        employeeHashMap.put("CTS", ctsList);

        // Display Employees from city Pune

        for (String var : employeeHashMap.keySet()) {
            ArrayList<Employee> list = employeeHashMap.get(var);
            for (Employee emp : list) {
                if (emp.getCity().equals("Pune")) {
                    System.out.println("Printing name: " + emp.getName() + " "
                            + "Salary: " + emp.getSalary() + " " + "City: " + emp.getCity() + " "
                            + "Department: " + emp.getDep());
                }

            }
        }
        System.out.println("Employees from city Pune");

        // Display Employees from city Agra

        for (String var : employeeHashMap.keySet()) {
            ArrayList<Employee> list = employeeHashMap.get(var);
            for (Employee emp : list) {
                if (emp.getCity().equals("Agra")) {
                    System.out.println("Printing name: " + emp.getName() + " "
                            + "Salary: " + emp.getSalary() + " " + "City: " + emp.getCity() + " "
                            + "Department: " + emp.getDep());
                }

            }
        }
        System.out.println("Employees from city Agra");


        // Display Employees from city Mumbai

        for (String var : employeeHashMap.keySet()) {
            ArrayList<Employee> list = employeeHashMap.get(var);
            for (Employee emp : list) {
                if (emp.getCity().equals("Mumbai")) {
                    System.out.println("Printing name: " + emp.getName() + " "
                            + "Salary: " + emp.getSalary() + " " + "City: " + emp.getCity() + " "
                            + "Department: " + emp.getDep());
                }
            }
        }

        System.out.println("Employees from city Mumbai");
    }

}



package class_object;

public class Employee {
    String employeeName = "Mayank";
    int employeeId = 2002111;
    int employeeAge = 28;
    double employeeSalary = 25000.023;

    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println("Printing object.Employee information " + "\n" + "employeeName: " + obj.employeeName + "\n" + "employeeId: " + obj.employeeId + "\n" + "employeeAge: " + obj.employeeAge +
                "\n" + "employeeSalary: " + obj.employeeSalary);

        Employee obj2 = new Employee();
        System.out.println("Printing object.Employee information " + "\n" + "employeeName: " + obj2.employeeName + "\n" + "employeeId: " + obj2.employeeId + "\n" + "employeeAge: " + obj2.employeeAge +
                "\n" + "employeeSalary: " + obj2.employeeSalary);
        Employee obj3 = new Employee();
        System.out.println("Printing object.Employee information " + "\n" + "employeeName: " + obj3.employeeName + "\n" + "employeeId: " + obj3.employeeId + "\n" + "employeeAge: " + obj3.employeeAge +
                "\n" + "employeeSalary: " + obj3.employeeSalary);
        Employee obj4 = new Employee();
        System.out.println("Printing object.Employee information " + "\n" + "employeeName: " + obj4.employeeName + "\n" + "employeeId: " + obj4.employeeId + "\n" + "employeeAge: " + obj4.employeeAge +
                "\n" + "employeeSalary: " + obj4.employeeSalary);
        Employee obj5 = new Employee();
        System.out.println("Printing object.Employee information " + "\n" + "employeeName: " + obj5.employeeName + "\n" + "employeeId: " + obj5.employeeId + "\n" + "employeeAge: " + obj5.employeeAge +
                "\n" + "employeeSalary: " + obj5.employeeSalary);
    }
}

package class_and_object;

public class EmployeeParam {

    String name;
    int age;
    double salary;

    public EmployeeParam(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {

        EmployeeParam Employee1 = new EmployeeParam("Mukesh", 29, 39009.88);
        System.out.println("Print Employee Name: " + Employee1.name + " age: " + Employee1.age + " Salary: " + Employee1.salary);

        EmployeeParam Employee2 = new EmployeeParam("Pooja", 25, 59049.68);
        System.out.println("Print Employee Name: " + Employee2.name + " age: " + Employee2.age + " Salary: " + Employee2.salary);

        EmployeeParam Employee3 = new EmployeeParam("Jaswinder", 28, 15609.18);
        System.out.println("Print Employee Name: " + Employee3.name + " age: " + Employee3.age + " Salary: " + Employee3.salary);

        EmployeeParam Employee4 = new EmployeeParam("Surender", 26, 42679.54);
        System.out.println("Print Employee Name: " + Employee4.name + " age: " + Employee4.age + " Salary: " + Employee4.salary);

        EmployeeParam Employee5 = new EmployeeParam("Vandana", 32, 87569.93);
        System.out.println("Print Employee Name: " + Employee5.name + " age: " + Employee5.age + " Salary: " + Employee5.salary);
    }
}

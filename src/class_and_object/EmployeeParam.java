package class_and_object;

public class EmployeeParam {

    // Data Members;

    String name;

    int id;

    double salary;

    // parameterized constructor;


    public EmployeeParam(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public static void main(String[] args) {

        //SYNTAX: ClassName objName= new ClassName(value1, value2, value3.......valueN);

        EmployeeParam obj1 = new EmployeeParam("Shiv", 110020, 20500.45);

        System.out.println("Printing info of EmployeeParam: " + obj1.name + " " + obj1.id + " " + obj1.salary);

        EmployeeParam obj2 = new EmployeeParam("Jai", 110021, 25000.50);

        System.out.println("Printing info of EmployeeParam: " + obj2.name + " " + obj2.id + " " + obj2.salary);

        EmployeeParam obj3 = new EmployeeParam("Ajay", 110022, 30500.55);

        System.out.println("Printing info of EmployeeParam: " + obj3.name + " " + obj3.id + " " + obj3.salary);

        EmployeeParam obj4 = new EmployeeParam("Vijay", 110023, 35000.60);

        System.out.println("Printing info of EmployeeParam: " + obj4.name + " " + obj4.id + " " + obj4.salary);

        EmployeeParam obj5 = new EmployeeParam("Ravi", 110024, 45000.65);

        System.out.println("Printing info of EmployeeParam: " + obj5.name + " " + obj5.id + " " + obj5.salary);


    }
}

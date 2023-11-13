package class_and_object;

public class Engineer {
    String company_name = "L&T";

    String department = "Civil";

    double salary = 200000.50;

    String location = "mumbai";

    public static void main(String[] args) {

        Engineer obj = new Engineer();

        System.out.println("engineer is working in ...." + obj.company_name);

        Engineer obj2 = new Engineer();

        System.out.println("department is ..." + obj2.department);

        Engineer obj3 = new Engineer();

        System.out.println("salary is ..." + obj3.salary);

        Engineer obj4 = new Engineer();

        System.out.println("location is ..." + obj4.location);
    }


}

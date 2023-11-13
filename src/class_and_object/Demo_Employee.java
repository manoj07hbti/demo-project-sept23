package class_and_object;

public class Demo_Employee {

    String company = "Axis bank";
    String employee_id = "As361193";

    int doj = 2020;

    String designation = "Sales manager";

    public static void main(String[] args) {

        Demo_Employee obj = new Demo_Employee();

        System.out.println("client is working with..." + obj.company + " and his designation is: " + obj.designation);

        Demo_Employee obj2 = new Demo_Employee();

        System.out.println("Client date of joining is..." + obj2.doj);

        Demo_Employee obj3 = new Demo_Employee();

        System.out.println("client employee id is..." + obj3.employee_id);

        Demo_Employee obj4 = new Demo_Employee();

        System.out.println(obj4.company);

        Demo_Employee obj5 = new Demo_Employee();

        System.out.println(obj5.designation);

    }


}

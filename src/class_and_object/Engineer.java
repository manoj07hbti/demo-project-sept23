package class_and_object;

import org.w3c.dom.ls.LSOutput;

public class Engineer {

    String graduation = "MTech";
    String company="Google";
    double salary = 79489.45;
    String field="Software Engineer";
    int workingyears = 15;

    public static void main(String[] args) {

        Engineer obj=new Engineer();
        System.out.println("Print Gradution: "+obj.graduation);

        Engineer obj2 = new Engineer();
        System.out.println("Print Company Name: " + obj2.company);

        Engineer obj3 = new Engineer();
        System.out.println("Print Salary: " + obj3.salary);

        Engineer obj4 = new Engineer();
        System.out.println("Print Field: " + obj4.field);

        Engineer obj5 = new Engineer();
        System.out.println("Print Working Years: " + obj5.workingyears);
    }





}

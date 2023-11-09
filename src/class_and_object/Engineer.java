package class_and_object;

public class Engineer {
    String graduation = "BTech";
    String company="Wipro";
    double salary = 89789.65;
    String field="Software Engineer";
    int joiningYear=2024;

    public static void main(String[] args) {
        Engineer obj = new Engineer();
        System.out.println("Graduation: " + obj.graduation);

        Engineer obj2 = new Engineer();
        System.out.println("Company: " + obj2.company);

        Engineer obj3 = new Engineer();
        System.out.println("Salary: " + obj3.salary);

        Engineer obj4 = new Engineer();
        System.out.println("Field: " + obj4.field);

        Engineer obj5 = new Engineer();
        System.out.println("Joining Year: " + obj5.joiningYear);


    }
    }




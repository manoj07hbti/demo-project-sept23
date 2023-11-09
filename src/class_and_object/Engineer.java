package class_and_object;

public class Engineer {

    // Data Members;

    String name="Rohit";

    String course="BE";

    String branch="CS";

    int id=250023;

    int year=2023;

    public static void main(String[] args) {

        //SYNTAX : ClassName objName= new ClassName();
        Engineer obj1= new Engineer(); // we have created obj Object of class Engineer;

        System.out.println("Printing info of Student object: "+ obj1.name +" "+ obj1.course +" "+obj1.branch +" "+obj1.id +" "+obj1.year);

        Engineer obj2= new Engineer();

        System.out.println("Printing info of Student object: "+ obj2.name +" "+ obj2.course +" "+obj2.branch +" "+obj2.id +" "+obj2.year);

        Engineer obj3= new Engineer();

        System.out.println("Printing info of Student object: "+ obj3.name +" "+ obj3.course +" "+obj3.branch +" "+obj3.id +" "+obj3.year);

        Engineer obj4= new Engineer();

        System.out.println("Printing info of Student object: "+ obj4.name +" "+ obj4.course +" "+obj4.branch +" "+obj4.id +" "+obj4.year);

        Engineer obj5= new Engineer();

        System.out.println("Printing info of Student object: "+ obj5.name +" "+ obj5.course +" "+obj5.branch +" "+obj5.id +" "+obj5.year);


    }
}

package class_and_object;

public class Student {

    // Data Members;

    String name="Rohit";

    String course="B.com";

    int age=24;

    String state="U P";

    int year=2023;

    public static void main(String[] args) {

        //SYNTAX : ClassName objName= new ClassName();
        Student obj1= new Student(); // we have created obj Object of class Student;

        System.out.println("Printing info of Student object: "+ obj1.name +" "+ obj1.course +" "+obj1.age +" "+obj1.state +" "+obj1.year);

        Student obj2= new Student();

        System.out.println("Printing info of Student object: "+ obj2.name +" "+ obj2.course +" "+obj2.age +" "+obj2.state +" "+obj2.year);

        Student obj3= new Student();

        System.out.println("Printing info of Student object: "+ obj3.name +" "+ obj3.course +" "+obj3.age +" "+obj3.state +" "+obj3.year);

        Student obj4= new Student();

        System.out.println("Printing info of Student object: "+ obj4.name +" "+ obj4.course +" "+obj4.age +" "+obj4.state +" "+obj4.year);

        Student obj5= new Student();

        System.out.println("Printing info of Student object: "+ obj5.name +" "+ obj5.course +" "+obj5.age +" "+obj5.state +" "+obj5.year);


    }
}

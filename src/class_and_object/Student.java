package class_and_object;

public class Student {

    String name = "Atharv";

    String school_name = "Christ the king school";

    String class_name = "Sixth class";

    String section_name = "C";


    public static void main(String[] args) {

        Student obj = new Student();

        System.out.println("student name is : " + obj.name);

        Student obj2 = new Student();

        System.out.println("Student school name is: " + obj2.school_name);

        Student obj3 = new Student();

        System.out.println("student class : " + obj3.class_name);

        Student obj4 = new Student();

        System.out.println("student section is: " + obj4.section_name);

    }


}



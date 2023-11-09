package class_and_object;

public class Student {
    String name ="Dhoni";
    String  section= "C";
    int age = 18;
    String district="Agra";
    int rollno= 5;

    public static void main(String[] args) {
        Student obj= new Student();
        System.out.println("Name: "+obj.name);

        Student obj2= new Student();
        System.out.println("Age: "+obj2.age);

        Student obj3= new Student();
        System.out.println("Section: "+obj3.section);

        Student obj4= new Student();
        System.out.println("District: "+obj4.district);

        Student obj5= new Student();
        System.out.println("Student Roll no.: "+obj5.rollno);


    }

}
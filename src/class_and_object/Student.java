package class_and_object;

public class Student {

    String name ="Vishal Kumar";
    String  schoolname= "Delhi Public School";
    int age = 25;
    String district="Faridabad";
    int rollno= 12;

    public static void main(String[] args) {

        Student obj= new Student();
        System.out.println("Print Name of Student: "+obj.name);

        Student obj2= new Student();
        System.out.println("Print age of student: "+obj2.age);

        Student obj3= new Student();
        System.out.println("Print school name: "+obj3.schoolname);

        Student obj4= new Student();
        System.out.println("Print student District: "+obj4.district);

        Student obj5= new Student();
        System.out.println("Print Student Roll no.: "+obj5.rollno);
    }
}

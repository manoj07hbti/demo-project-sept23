package class_and_object;

public class Student {
    String Name="Tony";
    int age=19;
    int rollnumber=23;
    String college="st.jones";

    public static void main(String[] args) {
        Student obj=new Student();
        System.out.println("print student info"+" "+obj.Name+" "+obj.age+" "+obj.rollnumber+" "+" "+obj.college);
        Student obj2=new Student();
        System.out.println("print info of student"+" "+obj2.Name+" "+obj2.age+" "+obj2.rollnumber);
    }

}

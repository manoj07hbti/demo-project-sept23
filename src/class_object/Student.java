package class_object;

public class Student {
    String StudentName = "Mayank";
    int StudentId = 200211;
    int StudentAge = 28;
    String StudentAddress = "Flat-303, Swaran Nagari,GNoida Sec-31";

    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println("Printing Student information " + "\n" + "StudentName: " + obj.StudentName +
                "\n" + "StudentId: " + obj.StudentId +
                "\n" + "StudentAge: " + obj.StudentAge +
                "\n" + "StudentDOB: " +
                "\n" + "StudentAddress: " + obj.StudentAddress);

        Student obj2 = new Student();
        System.out.println("Printing Student information " + "\n" + "StudentName: " + obj.StudentName +
                "\n" + "StudentId: " + obj.StudentId +
                "\n" + "StudentAge: " + obj.StudentAge +
                "\n" + "StudentDOB: " +
                "\n" + "StudentAddress: " + obj.StudentAddress);

        Student obj3 = new Student();
        System.out.println("Printing Student information " + "\n" + "StudentName: " + obj.StudentName +
                "\n" + "StudentId: " + obj.StudentId +
                "\n" + "StudentAge: " + obj.StudentAge +
                "\n" + "StudentDOB: " +
                "\n" + "StudentAddress: " + obj.StudentAddress);

        Student obj4 = new Student();
        System.out.println("Printing Student information " + "\n" + "StudentName: " + obj.StudentName +
                "\n" + "StudentId: " + obj.StudentId +
                "\n" + "StudentAge: " + obj.StudentAge +
                "\n" + "StudentDOB: " +
                "\n" + "StudentAddress: " + obj.StudentAddress);

        Student obj5 = new Student();
        System.out.println("Printing Student information " + "\n" + "StudentName: " + obj.StudentName +
                "\n" + "StudentId: " + obj.StudentId +
                "\n" + "StudentAge: " + obj.StudentAge +
                "\n" + "StudentDOB: " +
                "\n" + "StudentAddress: " + obj.StudentAddress);
    }
}
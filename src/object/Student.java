package object;

public class Student {
    String StudentName = "Divya";
    int StudentId = 200211154;
    int StudentAge = 19;
    int StudentDOB = 15-02-1998;
    String StudentAddress = "Flat-701, JPGreens,Noida Sec-08";

    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println("Printing object.Employee information " + "\n" + "StudentName: " + obj.StudentName +
                "\n" + "StudentId: " + obj.StudentId +
                "\n" + "StudentAge: " + obj.StudentAge +
                "\n" + "StudentDOB: " + obj.StudentDOB +
                "\n" + "StudentAddress: " + obj.StudentAddress);

        Student obj2 = new Student();
        System.out.println("Printing object.Employee information " + "\n" + "StudentName: " + obj2.StudentName +
                "\n" + "StudentId: " + obj2.StudentId +
                "\n" + "employeeAge: " + obj2.StudentAge +
                "\n" + "StudentDOB: " + obj2.StudentDOB +
                "\n" + "StudentAddress: " + obj2.StudentAddress);

        Student obj3 = new Student();
        System.out.println("Printing object.Employee information " + "\n" + "StudentName: " + obj3.StudentName +
                "\n" + "StudentId: " + obj3.StudentId +
                "\n" + "employeeAge: " + obj3.StudentAge +
                "\n" + "StudentDOB: " + obj3.StudentDOB +
                "\n" + "StudentAddress: " + obj3.StudentAddress);

        Student obj4 = new Student();
        System.out.println("Printing object.Employee information " + "\n" + "StudentName: " + obj4.StudentName +
                "\n" + "StudentId: " + obj4.StudentId +
                "\n" + "employeeAge: " + obj4.StudentAge +
                "\n" + "StudentDOB: " + obj4.StudentDOB +
                "\n" + "StudentAddress: " + obj4.StudentAddress);

        Student obj5 = new Student();
        System.out.println("Printing object.Employee information " + "\n" + "StudentName: " + obj5.StudentName +
                "\n" + "StudentId: " + obj5.StudentId +
                "\n" + "employeeAge: " + obj5.StudentAge +
                "\n" + "StudentDOB: " + obj5.StudentDOB +
                "\n" + "StudentAddress: " + obj5.StudentAddress);
    }
}

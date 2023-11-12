package class_and_object;

public class Param_Student {
    String name;
    int age;
    String section;
    String district;
    int rollNo;


    public Param_Student(String name, int age, String section, String district, int rollNo) {
        this.name = name;
        this.age = age;
        this.section = section;
        this.district = district;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        Param_Student student = new Param_Student("Rohan", 17, "c", "Agra", 5);
        System.out.println("Student name: " + student.name + " Age: " + student.age);


        Param_Student student2 = new Param_Student("Ram", 19, "B", "Mathura", 24);
        System.out.println("Age: "+student2.age+ " Section: "+student2.section);

        Param_Student student3 = new Param_Student("Shyam",20,"A","Agra",25);
        System.out.println("RollNo: "+student3.rollNo+" District: "+student3.district);

        Param_Student student4 = new Param_Student("Mohan",22,"D","Mathura",31);
        System.out.println("District: "+student4.district+ " Section: "+student4.section);

        Param_Student student5 = new Param_Student("Sohan",26,"A","Kanpur",26);
        System.out.println("RolllNo: "+student5.rollNo+" Section: "+student5.section);


    }
}
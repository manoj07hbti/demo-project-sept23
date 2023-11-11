package class_and_object;

public class StudentParam {

    String name;
    int age;

    String Schoolname;

    //Syntax

    public StudentParam(String name, int age, String schoolname) {
        this.name = name;
        this.age = age;
        Schoolname = schoolname;
    }

    public static void main(String[] args) {

        StudentParam Student1 = new StudentParam("Akash", 27, "Delhi Public School");
        System.out.println("Print Name " + Student1.name + " age : " + Student1.age + " School: " + Student1.Schoolname);

        StudentParam Student2 = new StudentParam("Ved", 22, "Gurugram Public School");
        System.out.println("Print Name " + Student2.name + " age : " + Student2.age + " School: " + Student2.Schoolname);

        StudentParam Student3 = new StudentParam("Vishal", 27, "Govt Public School");
        System.out.println("Print Name " + Student3.name + " age : " + Student3.age + " School: " + Student3.Schoolname);

        StudentParam Student4 = new StudentParam("Rohit", 20, "BSD Public School");
        System.out.println("Print Name " + Student4.name + " age : " + Student4.age + " School: " + Student4.Schoolname);

        StudentParam Student5 = new StudentParam("Rahul", 18, "BN Public School");
        System.out.println("Print Name " + Student5.name + " age : " + Student5.age + " School: " + Student5.Schoolname);
    }
}

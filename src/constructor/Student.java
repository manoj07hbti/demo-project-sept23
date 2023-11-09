package constructor;

public class Student {
    String name;
    int age;
    int Id;
    String EmailAddress;


    public Student(String name, int age, int id, String emailAddress) {
        this.name = name;
        this.age = age;
        this.Id = id;
        this.EmailAddress = emailAddress;
    }

    public static void main(String[] args) {
        Student student=new Student("riya",20,2022114,"riyprakhsh@09");
        System.out.println("printing student name: "+student.name+"\n"
                +"printing student age: "+student.age+"\n"+"printing student Id: "+student.Id+"\n"
                +"printing student emailAddress: "+student.EmailAddress);

        Student student2=new Student("ravi",26,2022115,"ravimohan@0122");
        System.out.println("printing student name: "+student2.name+"\n"
                +"printing student age: "+student2.age+"\n"+"printing student Id: "+student2.Id+"\n"
                +"printing student emailAddress: "+student2.EmailAddress);

        Student student3=new Student("neha",20,2022116,"nehajabir123");
        System.out.println("printing student name: "+student3.name+"\n"
                +"printing student age: "+student3.age+"\n"+"printing student Id: "+student3.Id+"\n"
                +"printing student emailAddress: "+student3.EmailAddress);

        Student student4=new Student("meena",30,2022117,"mennaroy@345me");
        System.out.println("printing student name: "+student4.name+"\n"
                +"printing student age: "+student4.age+"\n"+"printing student Id: "+student4.Id+"\n"
                +"printing student emailAddress: "+student4.EmailAddress);

        Student student5=new Student("priya",15,2022118,"priyaprakhsh@09");
        System.out.println("printing student name: "+student5.name+"\n"
                +"printing student age: "+student5.age+"\n"+"printing student Id: "+student5.Id+"\n"
                +"printing student emailAddress: "+student5.EmailAddress);





    }
}







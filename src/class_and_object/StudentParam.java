package class_and_object;

public class StudentParam {
    String Name;
    int age;
    int RollNumber;
    String CollegeName;
    // using param and const


    public StudentParam(String name, int age, int rollNumber, String collegeName) {
        Name = name;
        this.age = age;
        RollNumber = rollNumber;
        CollegeName = collegeName;
    }

    public static void main(String[] args) {
        StudentParam Student1=new StudentParam("Rahul" ,23,10,"agra college");
        System.out.println("Print student Name: "+Student1.Name+" age: "+Student1.age+" RollNumber: "+Student1.RollNumber);
        StudentParam Student2=new StudentParam("Imran",24, 11, "St.Stephen");
        System.out.println("Name: "+Student2.Name +  " age: "+Student2.age+" RollNumber: "+Student2.RollNumber);
        StudentParam Student3=new StudentParam ("Mohit",26, 20,"ABC");
        System.out.println("Name: "+Student3.Name+" age: "+Student3.age+" RollNumber: "+Student3.RollNumber);
        StudentParam Student4=new StudentParam("Nitin",34,12,"AZC");
        System.out.println("Name: "+Student4.Name+" age: "+Student4.age+" RollNumber: "+Student4.RollNumber+" CollegeName: "+Student4.CollegeName);
    }
}

package function_method;

public class Student {

    public void name(){
        System.out.println("Name Method of Student");
    }
    public void age(){
        System.out.println("Age Method of Student");

    }
    public void RollNumber(){
        System.out.println("RollNumber Method of Student");
    }
    public void className(){
        System.out.println("className Method of Student");
    }
    public void collegeName(){
        System.out.println("collegeName Method of Student");
    }

    public static void main(String[] args) {
        Student obj1=new Student();
        obj1.name();
        obj1.age();
        obj1.RollNumber();
        obj1.className();
        obj1.collegeName();
    }
}

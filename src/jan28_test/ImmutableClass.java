package jan28_test;

public class ImmutableClass {

    private String name;
    private int age;
    private double salary;




    public ImmutableClass(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public double getSalary () {
        return salary;
    }

    public static void main(String[] args) {
        ImmutableClass obj=new ImmutableClass("Rohan",27,78000.89);
        System.out.println("Name: "+obj.name+" Age: "+obj.age+" Salary: "+obj.salary);

    }
}

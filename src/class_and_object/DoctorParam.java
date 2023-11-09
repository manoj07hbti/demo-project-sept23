package class_and_object;

public class DoctorParam {

    String name;
    int age;
    String dept;

    //param_constructor

    public DoctorParam(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public static void main(String[] args) {

        DoctorParam doctorParam1= new DoctorParam("Raj",45,"Heart");
        System.out.println(doctorParam1.name+" age: "+doctorParam1.age+ " Dept: "+doctorParam1.dept);

        DoctorParam doctorParam2= new DoctorParam("Rahul",57,"Ortho");
        System.out.println(doctorParam2.name+" age: "+doctorParam2.age+ " Dept: "+doctorParam2.dept);
    }
}

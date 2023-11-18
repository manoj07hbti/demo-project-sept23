package function_method;

public class Doctor {
    public void name(){
        System.out.println("Name Method of Doctor");
    }
    public void specialization(){
        System.out.println("Specialization Method of Doctor");
    }
    public void HospitalName(){
        System.out.println("Hospital Name method of doctor");
    }
    public void city(){
        System.out.println("City method of doctor");
    }

    public static void main(String[] args) {
        Doctor objdoctor=new Doctor();
        objdoctor.name();
        objdoctor.specialization();
        objdoctor.HospitalName();
    }
}

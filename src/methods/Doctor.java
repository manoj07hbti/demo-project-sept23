package methods;

public class Doctor {
    String name;
    String specialization;
    String dept;
    int yearsOfExperience;

    public Doctor(String name, String specialization, String dept, int yearsOfExperience) {
        this.name = name;
        this.specialization = specialization;
        this.dept = dept;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void performMedicalExam() {
        System.out.println(name + " is performing a medical Examination");
    }

    public void performSurgery() {
        System.out.println(name + " is performing a medical Surgery");
    }

    public void prescribeMedicine() {
        System.out.println(name + " is prescribing medicines");
    }

    public void provideTreatment() {
        System.out.println(name + " is providing a treatment to patients");
    }

    public static void main(String[] args) {
        Doctor obj = new Doctor("Dr.Khushi", "Bones", "Ortho", 8);
        obj.performMedicalExam();
        obj.performSurgery();
        obj.prescribeMedicine();
        obj.provideTreatment();
    }
}

package collection.hashSet;

import model.Doctor;

import java.util.HashSet;

public class DemoDoctorHashSet {
    public HashSet<Doctor> createDoctorSet() {

        //CollectionName <Datatype> objName = new CollectionName<>();

        HashSet<Doctor> doctorHashSet = new HashSet<>();


        Doctor doctor1 = new Doctor("Reem", "Bones", "Ortho", 5);
        System.out.println("Printing hashcode of doctor1: " + doctor1.hashCode());

        Doctor doctor2 = new Doctor("Khushi", "Heart", "Cardiology", 1);
        System.out.println("Printing hashcode of doctor2: " + doctor2.hashCode());

        Doctor doctor3 = new Doctor("Alen", "Brain,Nerves", "Neurology", 3);
        System.out.println("Printing hashcode of doctor3: " + doctor3.hashCode());

        Doctor doctor4 = new Doctor("Reem", "Bones", "Ortho", 5);
        System.out.println("Printing hashcode of doctor4: " + doctor4.hashCode());

        Doctor doctor5 = new Doctor("Khushi", "Heart", "Cardiology", 1);
        System.out.println("Printing hashcode of doctor5: " + doctor5.hashCode());

        doctorHashSet.add(doctor1);
        doctorHashSet.add(doctor2);
        doctorHashSet.add(doctor3);
        doctorHashSet.add(doctor4);
        doctorHashSet.add(doctor5);

        return doctorHashSet;
    }

    public static void main(String[] args) {
        DemoDoctorHashSet obj = new DemoDoctorHashSet();
        HashSet<Doctor> doctors = obj.createDoctorSet();

        for (Doctor var : doctors) {
            System.out.println("Printing HashSet name: " + var.getName() +"\n "
                    + "Printing Specialisation: " + var.getSpecialization() +"\n"
                    + "Printing Department: " + var.getDept() +"\n "
                    + "Printing Experience: " + var.getYearsOfExperience());
        }
    }
}


package collection_hashset;

import model.Doctor;

import java.util.HashSet;

public class DoctorHashSet {

    public HashSet<Doctor> createDoctorSet() {

        // CollectionName <Datatype> objName = new CollectionName<>();

        HashSet<Doctor> doctorHashSet = new HashSet<>();

        // we need to create Doctor data by creating student object;

        Doctor doctor1 = new Doctor("Atul", "Morning", 40);
        System.out.println("Printing hashcode of doctor1: " + doctor1.hashCode());

        Doctor doctor2 = new Doctor("Rajiv", "Night", 45);
        System.out.println("Printing hashcode of doctor2: " + doctor2.hashCode());

        Doctor doctor3 = new Doctor("Ravi", "Morning", 50);
        System.out.println("Printing hashcode of doctor3: " + doctor3.hashCode());

        Doctor doctor4 = new Doctor("Atul", "Morning", 40);
        System.out.println("Printing hashcode of doctor4: " + doctor4.hashCode());

        Doctor doctor5 = new Doctor("Rajiv", "Night", 45);
        System.out.println("Printing hashcode of doctor5: " + doctor5.hashCode());

        doctorHashSet.add(doctor1);
        doctorHashSet.add(doctor2);
        doctorHashSet.add(doctor3);
        doctorHashSet.add(doctor4);
        doctorHashSet.add(doctor5);

        return doctorHashSet;
    }

    public static void main(String[] args) {

        DoctorHashSet obj = new DoctorHashSet();

        HashSet<Doctor> doctors = obj.createDoctorSet();

        for (Doctor var : doctors) {

            System.out.println("Printing Doctor hashCode Advance For Loop Name= " + var.getName() + " .WorkTime= " + var.getWorkTime() + " .Age= " + var.getAge());
        }
    }

}

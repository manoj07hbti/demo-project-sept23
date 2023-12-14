package collection.hashset;

import model.Doctor;

import java.util.HashSet;

public class Doctor_HashSet {

    public HashSet<Doctor> createDoctorSet(){
        HashSet<Doctor> doctorHashSet=new HashSet<>();

        Doctor doctor1=new Doctor("Kaushal","Physician",56);
        System.out.println("Printing hashcode of doctor1: "+doctor1.hashCode());

        Doctor doctor2=new Doctor("Saxena","Skin",48);
        System.out.println("Printing hashcode of doctor2: "+doctor2.hashCode());

        Doctor doctor3=new Doctor("Gupta","Dermatologist",58);
        System.out.println("Printing hashcode of doctor3: "+doctor3.hashCode());

        Doctor doctor4=new Doctor("Kaushal","Physician",56);
        System.out.println("Printing hashcode of doctor4: "+doctor4.hashCode());

        Doctor doctor5=new Doctor("Saxena","Skin",48);
        System.out.println("Printing hashcode of doctor5: "+doctor5.hashCode());

        doctorHashSet.add(doctor1);
        doctorHashSet.add(doctor2);
        doctorHashSet.add(doctor3);
        doctorHashSet.add(doctor4);
        doctorHashSet.add(doctor5);


        return doctorHashSet;
    }

    public static void main(String[] args) {
        Doctor_HashSet obj=new Doctor_HashSet();
        HashSet<Doctor> doctorsList=obj.createDoctorSet();

        for(Doctor var:doctorsList){
            System.out.println("Printing Doctors Information: "+var.getName()+" "
                    +var.getSpecialization()+" "+
                    var.getAge());
        }
    }
}

package collection.hashset;

import model.Doctor;

import java.util.HashSet;

public class DemoDoctorHashset {

    public HashSet<Doctor> createdoctorset(){

        HashSet<Doctor> set=new HashSet<>();

        Doctor doctor1=new Doctor("Deepak","Ortho","Mbbs");
        System.out.println("printing hashcode: "+doctor1.hashCode());
        Doctor doctor2=new Doctor("Atharv","sergury","MS");
        System.out.println("printing hashcode: "+doctor2.hashCode());
        Doctor doctor3=new Doctor("arjun","dental","bds");
        System.out.println("printing hashcode: "+doctor3.hashCode());
        Doctor doctor4=new Doctor("khusbu","skin","MD");
        System.out.println("printing hashcode: "+doctor4.hashCode());
        Doctor doctor5=new Doctor("Deepak","Ortho","Mbbs");
        System.out.println("printing hashcode: "+doctor5.hashCode());
        Doctor doctor6=new Doctor("Atharv","sergury","MS");
        System.out.println("printing hashcode: "+doctor6.hashCode());
        Doctor doctor7=new Doctor("arjun","dental","bds");
        System.out.println("printing hashcode: "+doctor7.hashCode());
        Doctor doctor8=new Doctor("khusbu","skin","MD");
        System.out.println("printing hashcode: "+doctor8.hashCode());

        set.add(doctor1);
        set.add(doctor2);
        set.add(doctor3);
        set.add(doctor4);
        set.add(doctor5);
        set.add(doctor6);
        set.add(doctor7);
        set.add(doctor8);


        return set;
    }

    public static void main(String[] args) {
        DemoDoctorHashset obj=new DemoDoctorHashset();
        HashSet<Doctor> output=obj.createdoctorset();


        for(Doctor var:output){
            System.out.println("printing Doctor data, (Name): "+var.getName()+",(Department): "+var.getDepartment()+",(Degree): "+var.getDegree());
        }

    }

}

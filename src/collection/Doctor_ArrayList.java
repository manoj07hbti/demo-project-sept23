package collection;

import class_and_object.Student;
import model.Doctor;
import model.Employee;

import java.util.ArrayList;

public class Doctor_ArrayList {

    public ArrayList<Doctor> createDoctorList() {
        ArrayList<Doctor> doctorArraylist = new ArrayList<>();

        Doctor doctor1 = new Doctor("Vikram", "Ortho", 33);
        Doctor doctor2 = new Doctor("Kaushal", "Heart", 44);
        Doctor doctor3 = new Doctor("Rahul", "Physician", 48);

        doctorArraylist.add(doctor1);
        doctorArraylist.add(doctor2);
        doctorArraylist.add(doctor3);

        return doctorArraylist;
    }

    public static void main(String[] args) {
        Doctor_ArrayList obj = new Doctor_ArrayList();
        ArrayList<Doctor> doctors = obj.createDoctorList();

        for (int i = 0; i < doctors.size(); i++) {
            System.out.println("Printing doctor name: " + doctors.get(i).getName() + " Age : " + doctors.get(i).getAge()+" Specialization: "+doctors.get(i).getSpecialization());
        }
        int i=0;
        while( i<doctors.size()){
            System.out.println("Printing doctor name: " + doctors.get(i).getName() + " Age : " + doctors.get(i).getAge()+" Specialization: "+doctors.get(i).getSpecialization());
            i++;
        }


        for(Doctor var:doctors){
            System.out.println("Printing doctor name: " + var.getName() + " Age : " + var.getAge()+" Specialization: "+var.getSpecialization());
        }
        }

        }






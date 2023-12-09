package collection;


import model.Doctor;

import java.util.ArrayList;

public class Demo_Doctor {
    public ArrayList<Doctor> Createdoctorarraylist() {

        ArrayList<Doctor> list = new ArrayList<>();

        Doctor doctor = new Doctor("mukesh", "ortho", "MS");
        Doctor doctor1 = new Doctor("Arjun", "Medicine", "MD");
        Doctor doctor2 = new Doctor("Atharv", "Dental", "BDS");

        list.add(doctor);
        list.add(doctor1);
        list.add(doctor2);

        return list;


    }

    public static void main(String[] args) {
        Demo_Doctor obj = new Demo_Doctor();
        ArrayList<Doctor> doctors = obj.Createdoctorarraylist();

        for (Doctor var : doctors) {
            System.out.println(" Doctors name: " + var.getName() + " ,department: " + var.getDepartment() + " ,degree: " + var.getDegree());
        }
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println("Doctor name: " + doctors.get(i).getName() + " / " + doctors.get(i).getDepartment() + " / " + doctors.get(i).getDegree());
        }
        int a = 0;
        while (a < doctors.size()) {
            System.out.println("Doctor name: " + doctors.get(a).getName() + " / " + doctors.get(a).getDepartment() + " / " + doctors.get(a).getDegree());
            a++;
        }
        int b = 0;
        do {
            System.out.println("Doctor name: " + doctors.get(b).getName() + " / " + doctors.get(b).getDepartment() + " / " + doctors.get(b).getDegree());
            b++;
        } while (b < doctors.size());


    }
}

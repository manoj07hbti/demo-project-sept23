package collection;

import model.Doctor;

import java.util.ArrayList;

public class DemoDoctorArrayList {
    public ArrayList<Doctor> createDoctorList() {
        ArrayList<Doctor> DoctorArrayList = new ArrayList<>();// we have created variable of Doctors arraylist

        // create Student data
        Doctor doctor1 = new Doctor("Reem", "Bones", "Ortho", 5);
        Doctor doctor2 = new Doctor("Khushi", "Heart", "Cardiology", 1);
        Doctor doctor3 = new Doctor("Alen", "Brain,Nerves", "Neurology", 3);

        DoctorArrayList.add(doctor1);
        DoctorArrayList.add(doctor2);
        DoctorArrayList.add(doctor3);


        return DoctorArrayList;
    }

    public static void main(String[] args) {
        DemoDoctorArrayList obj = new DemoDoctorArrayList();
        ArrayList<Doctor> doctors = obj.createDoctorList();

        for (int i = 0; i < doctors.size(); i++) {
            System.out.println("Printing list data with loop: " + doctors.get(i));
        }
        int k = 0;
        while (k < doctors.size()) {
            System.out.println("Printing list using while loop: " + doctors.get(k));
            k++;
        }
        int j = 0;
        do {
            System.out.println("Printing list using do-while loop: " + doctors.get(j));
            j++;
        } while (j < doctors.size());


        for (Object var : doctors) {
            System.out.println("Printing using Advanced loop: " + var);
        }

    }
}

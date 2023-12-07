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
            System.out.println("Printing doctor Info using for loop");
            System.out.println("Printing doctor Name: " + doctors.get(i).getName() +"\n"+ "Printing doctor specialisation: " +
                    doctors.get(i).getSpecialization() +"\n"+
                    "Printing doctor Department: " + doctors.get(i).getDept()+"\n"+ "Printing doctor yearsOfExperience: " + doctors.get(i).getYearsOfExperience());
        }
        int k = 0;
        while (k < doctors.size()) {
            System.out.println("Printing doctor Info using While loop");
            System.out.println("Printing doctor Name: " + doctors.get(k).getName() + "\n"+ "Printing doctor specialisation: " +
                    doctors.get(k).getSpecialization() +"\n"+
                    "Printing doctor Department: " + doctors.get(k).getDept() +"\n"+
                    "Printing doctor yearsOfExperience: " + doctors.get(k).getYearsOfExperience());
            k++;
        }
        int j = 0;
        do {
            System.out.println("Printing doctor Info using Do While loop");
            System.out.println("Printing doctor Name: " + doctors.get(j).getName() + "\n"+
                    "Printing doctor specialisation: " + doctors.get(j).getSpecialization() +"\n"+
                    "Printing doctor Department: " + doctors.get(j).getDept() + "\n"+
                    "Printing doctor yearsOfExperience: " + doctors.get(j).getYearsOfExperience());
            j++;
        } while (j < doctors.size());


        for (Doctor var : doctors) {
            System.out.println("Printing doctor Info using Advance for loop");
            System.out.println("Printing doctor Name: " + var.getName() + "\n"+
                    "Printing doctor specialisation: " + var.getSpecialization() +"\n"+
                    "Printing doctor Department: " + var.getDept() + "\n"+
                    "Printing doctor yearsOfExperience: " + var.getYearsOfExperience());

        }
    }
}

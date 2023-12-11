package collection;

import model.Doctor;
import model.Employee;

import java.util.ArrayList;

public class DoctorArrayList {

    public ArrayList<Doctor> createDoctorList() {

        // CollectionName <Datatype> objName = new CollectionName<>();

        ArrayList<Doctor> DoctorArrayList = new ArrayList<>();

        // Create Employee data;

        Doctor doctor1 = new Doctor("Atul", "Morning", 40);
        Doctor doctor2 = new Doctor("Rajiv", "Night", 45);
        Doctor doctor3 = new Doctor("Ravi", "Morning", 50);

        DoctorArrayList.add(doctor1);
        DoctorArrayList.add(doctor2);
        DoctorArrayList.add(doctor3);

        return DoctorArrayList;
    }

    public static void main(String[] args) {

        DoctorArrayList obj= new DoctorArrayList();
        ArrayList<Doctor> doctors= obj.createDoctorList();

        // for loop;

        for (int i = 0; i < doctors.size(); i++) {

            System.out.println("Printing Employee Array List using for loop: " + doctors.get(i).getName() + " workTime: " + doctors.get(i).getWorkTime() + " Age: " + doctors.get(i).getAge());
        }
        // while loop;

        int a = 0;
        while (a < doctors.size()) {

            System.out.println("Printing Employee Array List using while loop: " + doctors.get(a).getName() + " workTime: " + doctors.get(a).getWorkTime() + " Age: " + doctors.get(a).getAge());
            a++;
        }
        // Advance for loop;

        for (Doctor var : doctors) {

            System.out.println("Printing Employee Array List using advance for loop: " + var.getName() + " workTime: " + var.getWorkTime() + " Age: " + var.getAge());
        }
        // do while loop;

        a = 0;
        do {
            System.out.println("Printing Employee Array List using do while loop: " + doctors.get(a).getName() + "workTime: " + doctors.get(a).getWorkTime() + " Age: " + doctors.get(a).getAge());
            a++;
        } while (a < doctors.size());
    }
}

package collection;

import model.Doctor;

import java.util.ArrayList;

public class DoctorArrayList {
    public ArrayList<Doctor>createDoctorList(){
        ArrayList<Doctor>doctorArrayList=new ArrayList<>();
        Doctor doctor1=new Doctor("R.Sharma","cardio",33);
        Doctor doctor2=new Doctor("A.Sharma","Gastro",45);
        Doctor doctor3=new Doctor("C.Sharma","Nefro",46);
        doctorArrayList.add(doctor1);
        doctorArrayList.add(doctor2);
        doctorArrayList.add(doctor3);
        return doctorArrayList;
    }

    public static void main(String[] args) {
        DoctorArrayList obj=new DoctorArrayList();
        ArrayList<Doctor>doctor=obj.createDoctorList();
        for(int i=0; i<doctor.size(); i++){
            System.out.println("Doctor info: "+doctor.get(i).getName()+ " Dept: "+doctor.get(i).getDept()+ "Age: "+doctor.get(i).getAge());
        }

    }
}

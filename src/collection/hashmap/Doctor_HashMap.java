package collection.hashmap;

import model.Doctor;

import java.util.HashMap;
import java.util.Set;

public class Doctor_HashMap {

    public  void createDoctorMap(){
        HashMap<Integer, Doctor> doctorHashMap=new HashMap<>();

        Doctor doctor1 = new Doctor("Vikram", "Ortho", 33);
        Doctor doctor2 = new Doctor("Kaushal", "Heart", 44);
        Doctor doctor3 = new Doctor("Rahul", "Physician", 48);

        doctorHashMap.put(1,doctor1);
        doctorHashMap.put(2,doctor2);
        doctorHashMap.put(3,doctor3);

        Set<Integer> keys = doctorHashMap.keySet();

        for (Integer var:keys){
            System.out.println("Printing doctor information: "+doctorHashMap.get(var).getName()+" "
            +"Specialization: "+doctorHashMap.get(var).getSpecialization()+" "
            +"Age:"+doctorHashMap.get(var).getAge());
        }

    }

    public static void main(String[] args) {
        Doctor_HashMap obj=new Doctor_HashMap();
        obj.createDoctorMap();
    }
}

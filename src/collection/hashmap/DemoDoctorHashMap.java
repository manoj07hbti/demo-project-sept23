package collection.hashmap;

import model.Doctor;

import java.util.HashMap;
import java.util.Set;

public class DemoDoctorHashMap {
    public void createDoctorMap(){
        HashMap<Integer, Doctor>  doctors=new HashMap<>();

        Doctor doctor1 = new Doctor("Reem", "Bones", "Ortho", 5);
        Doctor doctor2 = new Doctor("Khushi", "Heart", "Cardiology", 1);
        Doctor doctor3 = new Doctor("Alen", "Brain,Nerves", "Neurology", 3);

        doctors.put(1,doctor1);
        doctors.put(2,doctor2);
        doctors.put(3,doctor3);

        Set<Integer> keys=doctors.keySet();
        for (Integer var:keys){
            System.out.println("Printing doctor data: ");
            System.out.println("Name: "+doctors.get(var).getName()+"\n"
                    + "Specialization:"+doctors.get(var).getSpecialization()+"\n"
                    + "Department:"+doctors.get(var).getDept()+"\n"
                    + "YearsOfExperience:"+doctors.get(var).getYearsOfExperience());
        }
    }

    public static void main(String[] args) {
        DemoDoctorHashMap obj=new DemoDoctorHashMap();
        obj.createDoctorMap();
    }
}

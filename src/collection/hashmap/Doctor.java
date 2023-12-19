package collection.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Doctor {

    // 2 Doctor;

    public void createDoctorMap() {

        // HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        HashMap<Integer, model.Doctor> doctors= new HashMap<>();

        // Create Doctor data;

        model.Doctor doctor1 = new model.Doctor("Atul", "Morning", 40);
        model.Doctor doctor2 = new model.Doctor("Rajiv", "Night", 45);
        model.Doctor doctor3 = new model.Doctor("Ravi", "Morning", 50);

        doctors.put(1, doctor1);
        doctors.put(2, doctor2);
        doctors.put(3, doctor3);

        Set<Integer> keys= doctors.keySet();

        for (Integer var : keys) {

            System.out.println("Printing  doctor data: " +  doctors.get(var).getName() + " WorkTime:" +  doctors.get(var).getWorkTime() + " Age:" +  doctors.get(var).getAge());
        }
    }

    public static void main(String[] args) {

        Doctor obj= new Doctor();
        obj.createDoctorMap();
    }
}

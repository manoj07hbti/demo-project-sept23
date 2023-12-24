package collection.hashmap;

import model.Doctor;

import java.util.HashMap;
import java.util.Set;

public class DemoDoctor {
    public void createDoctor(){

        HashMap<Integer, Doctor> doctors=new HashMap<>();

        Doctor doctor1=new Doctor("Deepak","ortho","mbbs");
        Doctor doctor2=new Doctor("Atharv","Eye","MS");
        Doctor doctor3=new Doctor("Arjun","Surgery","MS");

        doctors.put(1,doctor1);
        doctors.put(2,doctor2);
        doctors.put(3,doctor3);

        Set<Integer> keys=doctors.keySet();
        for (Integer var:keys){
            System.out.println("printing doctor data: "+doctors.get(var).getName()+",dept: "+doctors.get(var).getDepartment()+",degree: "+doctors.get(var).getDegree());
        }
    }

    public static void main(String[] args) {
        DemoDoctor obj=new DemoDoctor();
        obj.createDoctor();
    }
}

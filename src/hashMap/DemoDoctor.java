package hashMap;

import model.Doctor;

import java.util.HashMap;
import java.util.Set;

public class DemoDoctor {
    public void map(){
        HashMap<String, Doctor>doctors=new HashMap<>();
        Doctor doctor1=new Doctor("AK","Neurosurgeon",32);
        Doctor doctor2=new Doctor("KA","Cardiologist",34);
        Doctor doctor3=new Doctor("PP","Oncologist",54);
        doctors.put("Ak",doctor1);
        doctors.put("KA",doctor2);
        doctors.put("PP",doctor3);
        Set<String>keys=doctors.keySet();
        for(String var: keys){
            System.out.println("Details of doctors are:"+doctors.get(var).getName()+" Dept: "+doctors.get(var).getDept()+" Age"+doctors.get(var).getAge());
        }
    }

    public static void main(String[] args) {
        DemoDoctor obj=new DemoDoctor();
        obj.map();
    }
}

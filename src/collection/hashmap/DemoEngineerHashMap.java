package collection.hashmap;

import model.Engineer;

import java.util.HashMap;
import java.util.Set;

public class DemoEngineerHashMap {
    public void createEngineerMap(){
        HashMap<Integer, Engineer> engineers=new HashMap<>();

        Engineer engineer1=new Engineer("reem",22,"Btech","CivilEngineer",5);
        Engineer engineer2=new Engineer("rhhem",32,"Btech","ComputerScience",6);
        Engineer engineer3=new Engineer("penu",20,"Btech","Mechanical",2);

        engineers.put(1,engineer1);
        engineers.put(2,engineer2);
        engineers.put(3,engineer3);

        Set<Integer> keys=engineers.keySet();
        for (Integer var:keys){
            System.out.println("Printing engineer data: ");
            System.out.println("Name: "+engineers.get(var).getEngineerName()+"\n"
                    + "Age: "+engineers.get(var).getEngineerAge()+"\n"
                    + "Specialization:"+engineers.get(var).getEngineerSpecialization()+"\n"
                    + "Degree:"+engineers.get(var).getEngineerDegree()+"\n"
                    + "YearsOfExperience:"+engineers.get(var).getEngineerYearsOfExperience());
        }
    }

    public static void main(String[] args) {
        DemoEmployeeHashMap obj=new DemoEmployeeHashMap();
        obj.createEmployeeMap();
    }
}

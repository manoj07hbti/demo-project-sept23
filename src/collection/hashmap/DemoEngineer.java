package collection.hashmap;

import methods.Engineer;

import java.util.HashMap;
import java.util.Set;

public class DemoEngineer {
    public void createEngineer(){

        HashMap<Integer, Engineer> engineerHashMap=new HashMap<>();

        Engineer engineer1=new Engineer("Deepak",77889,"civil",150045.155);
        Engineer engineer2=new Engineer("Atharv",88654,"machenical",185245.155);
        Engineer engineer3=new Engineer("Arjun",443599,"software",250045.155);


        engineerHashMap.put(1,engineer1);
        engineerHashMap.put(2,engineer2);
        engineerHashMap.put(3,engineer3);

        Set<Integer> keys=engineerHashMap.keySet();
        for (Integer var:keys){
            System.out.println("printing engineer details: "+engineerHashMap.get(var).getName()+",emp id: "+engineerHashMap.get(var).getEmployee_id()+",dept: "+engineerHashMap.get(var).getDepartment()+",salary: "+engineerHashMap.get(var).getSalary());
        }
    }

    public static void main(String[] args) {
        DemoEngineer obj=new DemoEngineer();
        obj.createEngineer();

    }
}

package hashMap;

import model.Engineer;

import java.util.HashMap;
import java.util.Set;

public class DemoEngineer {
    public void map(){
        HashMap<String, Engineer>engineer=new HashMap<>();
        Engineer engineer1=new Engineer("AA","Civil","IITk",28);
        Engineer engineer2=new Engineer("BB","Mechanical","IITD",34);
        Engineer engineer3=new Engineer("CC","CS","IITG",32);
        engineer.put("AA",engineer1);
        engineer.put("BB",engineer2);
        engineer.put("CC",engineer3);
        Set<String> keys=engineer.keySet();
        for(String var: keys){
            System.out.println("E details: "+engineer.get(var).getName()+" Branch: "+engineer.get(var).getBranch()+" College: "+engineer.get(var).getCollege());
        }


    }

    public static void main(String[] args) {
        DemoEngineer obj=new DemoEngineer();
        obj.map();
    }

}

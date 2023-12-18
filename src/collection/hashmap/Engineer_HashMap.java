package collection.hashmap;

import model.Engineer;

import java.util.HashMap;
import java.util.Set;

public class Engineer_HashMap {

    public void createEngineerMap(){
        HashMap<Integer, Engineer> engineerHashMap=new HashMap<>();

        Engineer engineer1=new Engineer("Shyam","HCL",86000.78,23);
        Engineer engineer2=new Engineer("Ram","TATA",88000.79,24);
        Engineer engineer3=new Engineer("Sohan","HCL",89000.98,23);

        engineerHashMap.put(1,engineer1);
        engineerHashMap.put(2,engineer2);
        engineerHashMap.put(3,engineer3);

        Set<Integer> keys=engineerHashMap.keySet();//To print all keys

        for(Integer var: keys){
            System.out.println("Printing Engineers Information: "+engineerHashMap.get(var).getName()
            +" "+"Company: "+engineerHashMap.get(var).getCompany()+" "
            +"Salary: "+engineerHashMap.get(var).getSalary()+" "
            +"Age: "+engineerHashMap.get(var).getAge());

        }
    }

    public static void main(String[] args) {
        Engineer_HashMap obj=new Engineer_HashMap();
        obj.createEngineerMap();
    }
}

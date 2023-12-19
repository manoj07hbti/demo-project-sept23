package hashMap;

import model.Employee;

import java.util.HashMap;
import java.util.Set;

public class DemoEmployee {
    public void map(){
        HashMap<String,Employee>hashIndex=new HashMap<>();
        Employee employee1=new Employee("Rahul","Account",36);
        Employee employee2=new Employee("Rohit","finance",43);
        Employee employee3=new Employee("Mohit","Revenue",34);
        hashIndex.put("Rahul",employee1);
        hashIndex.put("Rohit",employee2);
        hashIndex.put("Mohit",employee3);
        Set<String>keys=hashIndex.keySet();
        for(String var: keys){
            System.out.println("printing employee 1 details: "+hashIndex.get(var).getName()+" Dept: "+ hashIndex.get(var).getDept()+" Age: "+hashIndex.get(var).getAge());

        }

    }

    public static void main(String[] args) {
        DemoEmployee obj=new DemoEmployee();
        obj.map();
    }
}

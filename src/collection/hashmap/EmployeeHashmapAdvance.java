package collection.hashmap;

import model.Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class EmployeeHashmapAdvance {

    public void createEmployee(){

        HashMap<String, HashSet<Employee>> hashSetHashMap=new HashMap<>();

        Employee employee1=new Employee("Deepak",44359,80500.56);
        Employee employee2=new Employee("Khusbu",88665,40500.56);
        Employee employee3=new Employee("Atharv",77665,200500.86);
        Employee employee4=new Employee("Arjun",99441,263500.56);

        HashSet<Employee> IBMemployee=new HashSet<>();
        IBMemployee.add(employee1);
        IBMemployee.add(employee2);
        IBMemployee.add(employee3);
        IBMemployee.add(employee4);

        hashSetHashMap.put("IBM",IBMemployee);

        Employee employee5=new Employee("chetanya",11225,30500.56);
        Employee employee6=new Employee("Arti",22551,90507.56);
        Employee employee7=new Employee("Allu",66331,35500.86);
        Employee employee8=new Employee("Kalia",77884,267500.46);

        HashSet<Employee> TCSemployee=new HashSet<>();
        TCSemployee.add(employee5);
        TCSemployee.add(employee6);
        TCSemployee.add(employee7);
        TCSemployee.add(employee8);
        hashSetHashMap.put("TCS",TCSemployee);

        Employee employee9=new Employee("Sachin",11995,40040.76);
        Employee employee10=new Employee("Ashwani",33551,90596.56);
        Employee employee11=new Employee("Lalu",66377,250565.86);
        Employee employee12=new Employee("Jhallu",79584,267950.46);

        HashSet<Employee> Infosysemployee=new HashSet<>();
        Infosysemployee.add(employee9);
        Infosysemployee.add(employee10);
        Infosysemployee.add(employee11);
        Infosysemployee.add(employee12);
        hashSetHashMap.put("Infosys",Infosysemployee);

        //Print only IBM and TCS employee data which is having salary >45000

        for (String var: hashSetHashMap.keySet()){
         if (var.equals("IBM")){
             HashSet<Employee> list=hashSetHashMap.get(var);

             for (Employee keys:list){

                 if (keys.getSalary()>45000){
                     System.out.println("Name: "+keys.getName()+" ,Empid: "+keys.getEmpid()+" ,Salary: "+keys.getSalary());

                 }
             }
         }

        }
        for (String var: hashSetHashMap.keySet()){
            if(var.equals("TCS")){

                HashSet<Employee> list=hashSetHashMap.get(var);
                for (Employee keys:list){
                    if(keys.getSalary()>45000){
                        System.out.println("Name: "+keys.getName()+" ,Empid: "+keys.getEmpid()+" ,Salary: "+keys.getSalary());
                    }
                }
            }
        }




    }

    public static void main(String[] args) {
        EmployeeHashmapAdvance obj=new EmployeeHashmapAdvance();
        obj.createEmployee();
    }

}

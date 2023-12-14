package collection.hashset;

import model.Engineer;

import java.util.HashSet;

public class Engineer_HashSet {

    public HashSet<Engineer> createEngineerSet(){
        HashSet<Engineer> engineerHashSet=new HashSet<>();

        Engineer engineer1=new Engineer("Shyam","HCL",86000.78,23);
        System.out.println("Printing hashcode of engineer1: "+engineer1.hashCode());

        Engineer engineer2=new Engineer("Ram","TATA",88000.79,24);
        System.out.println("Printing hashcode of engineer2: "+engineer2.hashCode());

        Engineer engineer3=new Engineer("Sohan","HCL",89000.98,23);
        System.out.println("Printing hashcode of engineer3: "+engineer3.hashCode());

        Engineer engineer4=new Engineer("Shyam","HCL",86000.78,23);
        System.out.println("Printing hashcode of engineer4: "+engineer4.hashCode());

        Engineer engineer5=new Engineer("Ram","TATA",88000.79,24);
        System.out.println("Printing hashcode of engineer5: "+engineer5.hashCode());

        engineerHashSet.add(engineer1);
        engineerHashSet.add(engineer2);
        engineerHashSet.add(engineer3);
        engineerHashSet.add(engineer4);
        engineerHashSet.add(engineer5);

        return engineerHashSet;
    }

    public static void main(String[] args) {
        Engineer_HashSet obj=new Engineer_HashSet();
        HashSet<Engineer> engineerList=obj.createEngineerSet();

        for(Engineer var:engineerList){
            System.out.println("Printing Engineers InformationL: "+var.getName()+" "
            +var.getCompany()+" "
            +var.getSalary()+" "
            +var.getAge());
        }
    }
}

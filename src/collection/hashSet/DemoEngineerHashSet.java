package collection.hashSet;

import model.Engineer;

import java.util.HashSet;

public class DemoEngineerHashSet {
    public HashSet<Engineer> createEngineerSet() {

        //CollectionName <Datatype> objName = new CollectionName<>();

        HashSet<Engineer>  engineerHashSet = new HashSet<>();

        Engineer engineer1=new Engineer("reem",22,"Btech","CivilEngineer",5);
        System.out.println("Printing hashcode of engineer1: " + engineer1.hashCode());

        Engineer engineer2=new Engineer("rhhem",32,"Btech","ComputerScience",6);
        System.out.println("Printing hashcode of engineer2: " + engineer2.hashCode());

        Engineer engineer3=new Engineer("penu",20,"Btech","Mechanical",2);
        System.out.println("Printing hashcode of engineer3: " + engineer3.hashCode());


        engineerHashSet.add(engineer1);
        engineerHashSet.add(engineer2);
        engineerHashSet.add(engineer3);

        return engineerHashSet;

    }

    public static void main(String[] args) {
        DemoEngineerHashSet obj = new DemoEngineerHashSet();
        HashSet<Engineer>engineers = obj.createEngineerSet();

        for (Engineer var : engineers) {
            System.out.println("Printing HashSet name: " + var.getEngineerName() + "\n "
                    + "Printing age: "+var.getEngineerAge() +"\n"
                    + "Printing Specialisation: " + var.getEngineerSpecialization() + "\n"
                    + "Printing Degree: " + var.getEngineerDegree()+ "\n "
                    + "Printing Experience: " + var.getEngineerYearsOfExperience());
        }
    }
}

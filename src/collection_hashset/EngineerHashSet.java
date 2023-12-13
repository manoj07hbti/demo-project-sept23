package collection_hashset;

import model.Doctor;
import model.Engineer;

import java.util.HashSet;

public class EngineerHashSet {

       public HashSet<Engineer> createEngineerSet(){

       // CollectionName <Datatype> objName = new CollectionName<>();

          HashSet<Engineer> engineerHashSet= new HashSet<>();

       // We need to create Doctor data by creating student object;

           Engineer engineer1 = new Engineer("Atul", "BE", 22);
           System.out.println("Printing hashcode of engineer1: " + engineer1.hashCode());

           Engineer engineer2 = new Engineer("Rajiv", "ME", 23);
           System.out.println("Printing hashcode of engineer2: " + engineer2.hashCode());

           Engineer engineer3 = new Engineer("Ravi", "Developer", 24);
           System.out.println("Printing hashcode of engineer3: " + engineer3.hashCode());

           Engineer engineer4 = new Engineer("Atul", "BE", 22);
           System.out.println("Printing hashcode of engineer4: " + engineer4.hashCode());

           Engineer engineer5 = new Engineer("Rajiv", "ME", 23);
           System.out.println("Printing hashcode of engineer5: " + engineer5.hashCode());

           engineerHashSet.add(engineer1);
           engineerHashSet.add(engineer2);
           engineerHashSet.add(engineer3);
           engineerHashSet.add(engineer4);
           engineerHashSet.add(engineer5);

           return engineerHashSet;
       }

    public static void main(String[] args) {

        EngineerHashSet obj = new EngineerHashSet();

        HashSet<Engineer> engineers = obj.createEngineerSet();

        for (Engineer var : engineers) {

            System.out.println("Printing Engineer hashCode Advance For Loop Name= " + var.getName() + " .Course= " + var.getCourse() + " .Age= " + var.getYear());
        }
    }
}

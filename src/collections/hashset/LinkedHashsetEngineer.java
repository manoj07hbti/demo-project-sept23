package collections.hashset;
import model.Engineer;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class LinkedHashsetEngineer
{
    public HashSet<Engineer> createEngineerset(){

            LinkedHashSet<Engineer> engineerHashSet= new LinkedHashSet<>();
            Engineer engineer1 =new Engineer("Rohit", "Electrical", 5112, 2, 6.6);
            System.out.println("Printing Hashcode of engineer 1 " + engineer1.hashCode());
            Engineer engineer2 = new Engineer("Rohan", "Electrical", 1234, 2,7.8);
            System.out.println("Printing Hashcode of engineer 2 " + engineer2.hashCode());
            Engineer engineer3 = new Engineer("Pankaj", "Civil", 15515, 3,9.9);
            System.out.println("Printing Hashcode of engineer 3 " + engineer3.hashCode());
            Engineer engineer4 = new Engineer("Adil", "Mechanical", 1234165, 4,4.5);
            System.out.println("Printing Hashcode of engineer 4 " + engineer4.hashCode());
            Engineer engineer5 = new Engineer("Rohan", "Electrical", 1234, 2,7.8);
            System.out.println("Printing Hashcode of engineer 5 " + engineer5.hashCode());
            Engineer engineer6 = new Engineer("Rohan", "Electrical", 1234, 2,7.8);
            System.out.println("Printing Hashcode of engineer 6 " + engineer6.hashCode());
            Engineer engineer7 = new Engineer("Rohan", "Electrical", 1234, 2,7.8);
            System.out.println("Printing Hashcode of engineer 7 " + engineer7.hashCode());
            Engineer engineer8 = new Engineer("Adil", "Mechanical", 1234165, 4,4.5);
            System.out.println("Printing Hashcode of engineer 8 " + engineer8.hashCode());
            Engineer engineer9 = new Engineer("Adil", "Mechanical", 1234165, 4,4.5);
            System.out.println("Printing Hashcode of engineer 9 " + engineer9.hashCode());
            Engineer engineer10 = new Engineer("Adil", "Mechanical", 1234165, 4,4.5);
            System.out.println("Printing Hashcode of engineer 10 " + engineer10.hashCode());
            engineerHashSet.add(engineer1);
            engineerHashSet.add(engineer2);
            engineerHashSet.add(engineer3);
            engineerHashSet.add(engineer4);
            engineerHashSet.add(engineer5);
            engineerHashSet.add(engineer6);
            engineerHashSet.add(engineer7);
            engineerHashSet.add(engineer8);
            engineerHashSet.add(engineer9);
            engineerHashSet.add(engineer10);


            return engineerHashSet;
        }

        public static void main(String[] args) {

            collections.hashset.LinkedHashsetEngineer obj = new collections.hashset.LinkedHashsetEngineer();
            HashSet <Engineer> engineers =obj.createEngineerset();

            for (Engineer var: engineers){
                System.out.println("Printing HashSet:"+ var.getName()+ " " +var.getBranch()+ " " + var.getRollno()+" " + var.getYear() +" "+ var.getCgpa());

            }
        }

    }
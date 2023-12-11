package collection_hashset;

public class HashSet {

    // String City:
    public java.util.HashSet<String> createStringHashSet() {

        // CollectionName <Datatype> objName = new CollectionName<>();

        java.util.HashSet<String> city = new java.util.HashSet<>();

        city.add("Delhi");
        city.add("Mumbai");
        city.add("Pune");
        city.add("Noida");
        city.add("Delhi");
        city.add("Mumbai");

        return city;
    }
        // Integer Marks;
    public java.util.HashSet<Integer> createIntHashSet(){

        java.util.HashSet<Integer> marks= new java.util.HashSet<>();

        marks.add(1000);
        marks.add(1100);
        marks.add(1200);
        marks.add(1300);
        marks.add(1000);
        marks.add(1100);

        return marks;
    }
       // Double Salary;
    public java.util.HashSet<Double> createDoubleHashSet(){

        java.util.HashSet<Double> salary= new java.util.HashSet<>();

        salary.add(30000.35);
        salary.add(35000.40);
        salary.add(40000.45);
        salary.add(45000.50);
        salary.add(30000.35);
        salary.add(35000.40);

        return salary;
    }

    public static void main(String[] args) {

        // OutPut1;

        HashSet obj1 = new HashSet();
        java.util.HashSet<String> output1 = obj1.createStringHashSet();

        for (String var : output1) {

            System.out.println("Printing HashSet: " + var);
        }
        // OutPut2;

        HashSet obj2 = new HashSet();
        java.util.HashSet<Integer> output2 = obj2.createIntHashSet();

        for (Integer var : output2) {

            System.out.println("Printing HashSet: " + var);
        }
        // OutPut3;

        HashSet obj3 = new HashSet();
        java.util.HashSet<Double> output3 = obj3.createDoubleHashSet();

        for (Double var : output3) {

            System.out.println("Printing HashSet: " + var);
        }
    }
}

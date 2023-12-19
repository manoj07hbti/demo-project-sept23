package collection.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Engineer {

    // 3 Engineer;

    public void createEngineerMap() {

        // HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        HashMap<Integer, model.Engineer> engineers = new HashMap<>();

        // Create Engineer data;

        model.Engineer engineer1 = new model.Engineer("Atul", "BE", 22);
        model.Engineer engineer2 = new model.Engineer("Rajiv", "ME", 23);
        model.Engineer engineer3 = new model.Engineer("Ravi", "Developer", 24);

        engineers.put(1, engineer1);
        engineers.put(2, engineer2);
        engineers.put(3, engineer3);

        Set<Integer> keys = engineers.keySet();

        for (Integer var : keys) {

            System.out.println("Printing engineer data: " + engineers.get(var).getName() + " Course:" + engineers.get(var).getCourse() + " Year:" + engineers.get(var).getYear());
        }
    }

    public static void main(String[] args) {

        Engineer obj = new Engineer();
        obj.createEngineerMap();

    }
}

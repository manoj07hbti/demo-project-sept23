package hashmap;

public class Demohashmap {
    public void createMarksScoredMap(){
        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        java.util.HashMap<String, Integer> marksScored= new java.util.HashMap<>();
        // Adding data to hashMap:  put(key,Value);
        marksScored.put("Mayank",65);
        marksScored.put("Hitendra",35);
        marksScored.put("Vinny",50);
        marksScored.put("Neha",80);
        marksScored.put("Giva",100);
        // how to read data:  get(key)

        System.out.println("Printing page number for Mayank: " +marksScored.get("Mayank"));
        System.out.println("Printing Map hashMapIndex: "+marksScored);
    }

    public void createCapitalCityMap(){

        java.util.HashMap<String, String> result= new java.util.HashMap<>();
        result.put("England", "London");
        result.put("Germany", "Berlin");
        result.put("Norway", "Oslo");
        result.put("USA", "Washington DC");

        System.out.println(result.get("USA"));
        System.out.println("Printing Map course: "+result);
    }

    public void createEmployeeSalaryMap(){

        java.util.HashMap<String,Double> salary= new java.util.HashMap<>();
        salary.put("David", 76000.009);
        salary.put("John", 120000.010);
        salary.put("Mark", 95000.005);
        salary.put("Steven", 134000.00);

        System.out.println(salary.get("Marks"));
        System.out.println("Printing Map course: "+salary);
    }


    public static void main(String[] args) {
        Demohashmap obj = new Demohashmap();
        obj.createMarksScoredMap();
        obj.createCapitalCityMap();
        obj.createEmployeeSalaryMap();
    }

}

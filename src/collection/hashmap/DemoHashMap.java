package collection.hashmap;

public class DemoHashMap {
    public void createMarksScoredMap(){
        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        java.util.HashMap<String, Integer> marksScored= new java.util.HashMap<>();
        // Adding data to hashMap:  put(key,Value);
        marksScored.put("Raj",65);
        marksScored.put("Yuv",35);
        marksScored.put("Vicky",50);
        marksScored.put("John",80);
        marksScored.put("Riva",100);
        // how to read data:  get(key)

        System.out.println("Printing page number for John: " +marksScored.get("John"));
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
        DemoHashMap obj = new DemoHashMap();
        obj.createMarksScoredMap();
        obj.createCapitalCityMap();
        obj.createEmployeeSalaryMap();
    }
}


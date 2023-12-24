package collection.hashmap;

import java.util.HashMap;

public class DemoHashMap {
    public void createhashmap() {

        HashMap<Integer, String> chapterpage = new HashMap<>();

        chapterpage.put(1, "Chapter 1");
        chapterpage.put(20, "Chapter 2");
        chapterpage.put(30, "Chapter 3");
        chapterpage.put(null, "Chapter 1");

        System.out.println("Printing Chapter: " + chapterpage.get(1));
        System.out.println("Printing Chapter: " + chapterpage.get(20));
        System.out.println("Printing Chapter: " + chapterpage.get(30));

        System.out.println("Printing Chapter: " + chapterpage);


    }

    public void checkfounders() {

        HashMap<String, String> comapanyfounder = new HashMap<>();

        comapanyfounder.put("Java", "James gosling");
        comapanyfounder.put("Microsoft", "Paul g.allen");
        comapanyfounder.put("Infosys", "N.R Narayan Murthy");

        System.out.println("printing Company Founders Name: " + comapanyfounder.get("Java"));
        System.out.println("printing Company Founders Name: " + comapanyfounder.get("Microsoft"));
        System.out.println("printing Company Founders Name: " + comapanyfounder.get("Infosys"));

        System.out.println("printing Company Founders Name: " + comapanyfounder);
    }
    public void product(){

        HashMap<String,Double> laptopprice=new HashMap<>();

        laptopprice.put("lenovo",39000.50);
        laptopprice.put("Hp",36000.40);
        laptopprice.put("Asus",45000.50);

        System.out.println("Printing Laptop price: "+laptopprice.get("lenovo"));
        System.out.println("Printing Laptop price: "+laptopprice.get("Hp"));
        System.out.println("Printing Laptop price: "+laptopprice.get("Asus"));

        System.out.println("Printing Laptop price: "+laptopprice);

    }

    public static void main(String[] args) {
        DemoHashMap obj = new DemoHashMap();
        obj.createhashmap();
        obj.checkfounders();
        obj.product();

    }
}

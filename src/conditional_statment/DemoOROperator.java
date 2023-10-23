
package conditional_statment;

public class DemoOROperator {

    public static void main(String[] args) {

        String brand = "lenovo";
        int ram = 8;

// 1  True || True =True

        if (brand == "Lenovo" || ram >= 8) {
            System.out.println("Good Quality Laptop");

        } else {
            System.out.println("NOt Good Quality Laptop ");
        }
        // 2 True || False = True
         brand= "Lenovo";
        ram = 4;
        if (brand == "Lenovo" || ram >= 8) {
            System.out.println("Good Quality laptop ");

        } else {
            System.out.println("Not Good Quality Laptop ");

        }
        // 3 False|| true = true

        brand = "hp";
        ram=9;
        if (brand == "lenovo" || ram >= 8) {
            System.out.println("good Quality Laptop ");
        } else {
            System.out.println(" Not Good Quality lapto ");

        }

        // 4 False || False = false

        brand = "Dell";
        ram = 2;
        if (brand == "Lenovo" || ram >= 8) {
            System.out.println("Good Quality Laptop ");
        } else {
            System.out.println(" Not Good Quality  Laptop ");
        }


    }


}




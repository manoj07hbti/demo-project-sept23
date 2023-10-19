package conditional_statments;

public class DemoOROperator {
    public static void main(String[] args) {

        String brand="Lenovo";
        int ram=8;

//1.   TRUE  || TRUE = TRUE

        if (brand == "Lenovo" || ram >= 8) {
            System.out.println("Good Quality Laptop...");
        }else {
            System.out.println("NOT Good Quality Laptop...");
        }
//2.   TRUE  || FALSE= TRUE
        ram=4;
        if (brand == "Lenovo" || ram >= 8) {
            System.out.println("Good Quality Laptop...");
        }else {
            System.out.println("NOT Good Quality Laptop...");
        }
// 3.   FALSE || TRUE=  TRUE
        brand="Dell";
        ram=8;
        if (brand == "Lenovo" || ram >= 8) {
            System.out.println("Good Quality Laptop...");
        }else {
            System.out.println("NOT Good Quality Laptop...");
        }
// 4.   FALSE || FALSE= FALSE

        ram=4;
        brand="MicroMax";
        if (brand == "Lenovo" || ram >= 8) {
            System.out.println("Good Quality Laptop...");
        }else {
            System.out.println("NOT Good Quality Laptop...");
        }

    }
}

package operators;

public class And_Operator {
    // And operator symbol- (&&)
    public static void main(String[] args) {
        /* code for to find a laptop witch price is not above is 30000 and brand is HP

         */
// 1- True && True= true
        double price = 25000.34;
        String brand = "HP";
        if (price <= 30000 && brand == "HP") {
            System.out.println("laptop's quality is good ");
        } else {
            System.out.println("laptop is not a good quality");
        }

// 2- True && False= False
        price = 40000;
        brand = " lenovo";
        if (price >= 35000 && brand == "Dell") {
            System.out.println("laptop is good quality ");
        } else {
            System.out.println("laptop is not good quality");
        }
// 3- False && True= False
        price = 20000;
        brand = "HCl";
        if (price >= 25000 && brand == "HCl") {
            System.out.println("laptop is good quality");
        } else {
            System.out.println("laptop is not good quality");
        }
// 4- False && False= False
        price = 50000;
        brand = "Apple";
        if (price >= 60000 && brand == "dell") {
            System.out.println("laptop is good quality");
        } else {
            System.out.println("laptop is not good quality");

        }

        // write a code to check percentage of student

        double percentage =84 ;
        if (percentage >= 33 && percentage <= 60) {
            System.out.println("second division...");
        }
        if(percentage>=65 && percentage<=75) {
            System.out.println("first division...");
        }
        if(percentage>75) {
            System.out.println("gold medalist...");
        }
    }
}
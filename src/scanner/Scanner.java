package scanner;

public class Scanner {

    public static void main(String[] args) {

        //Create Object of Scanner class;

        java.util.Scanner obj= new java.util.Scanner(System.in);

        // Reading String data;

        System.out.println("Please entre user name");
        String name= obj.nextLine();
        System.out.println("You have entered :" + name);

        // Reading int data;

        System.out.println("Please enter user age");
        int age= obj.nextInt();
        System.out.println("You have entered :" + age);

        // Reading double data;

        System.out.println("Please entre user salary");
        double salary= (double)obj.nextDouble();
        System.out.println("You have entered :" + salary);

    }

}

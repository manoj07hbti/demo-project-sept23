package scanner;

import sun.util.resources.cldr.gl.CalendarData_gl_ES;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter name of employees");
        for(int i=1;i<=4;i++) {
            String name = scanner.nextLine();
            System.out.println("Employee: " + name);
        }
        for(int i=1;i<=4;i++){
            System.out.println("Enter age");
            int age = scanner.nextInt();
            System.out.println("Age: "+ age);
        }
        for(int i=1;i<=4;i++){
            System.out.println("Enter Salary");
            double salary=scanner.nextDouble();
            System.out.println("Salary: "+salary);
        }



    }
}


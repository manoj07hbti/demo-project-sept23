package loop_working;

public class ArrayLoop {

    public static void main(String[] args) {

        // String array country
        String country[]={"India","America","China","Russia","Japan"};
        for(String count:country){
            System.out.println("Printing country name: "+count);
        }


        // int array distance

        int distance[]={32,43,51,66,77,};
        for(int dist:distance){
            System.out.println("Printing distance in km: "+dist);
        }


        // double array salary

        double salary[]={74000.14,64000.99,78000.88,66000.06,190000.58};
        for(double sal:salary){
            System.out.println("Printing Salary of Employees: "+sal);
        }    }
    }


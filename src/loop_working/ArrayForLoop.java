package loop_working;

public class ArrayForLoop {

    public static void main(String[] args) {

        // String array country
        String country[]={"India","America","China","Russia","Japan"};
        for(String count:country){
            System.out.println("Printing country name: "+count);
        }


        // int array distance

        int distance[]={54,85,43,96,97,};
        for(int dist:distance){
            System.out.println("Printing distance in km: "+dist);
        }


        // double array salary

        double salary[]={44000.04,65000.86,86000.15,87000.26,650000.98};
        for(double sal:salary){
            System.out.println("Printing Salary of Employees: "+sal);
        }

    }
}

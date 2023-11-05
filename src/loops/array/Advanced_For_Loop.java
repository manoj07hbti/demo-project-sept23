package loops.array;

public class Advanced_For_Loop {
    public static void main(String[] args) {

        // String array country
        String country[]={"India","America","China","Russia","Japan"};
        for(String count:country){
            System.out.println("Printing country name: "+count);
        }


        // int array distance

        int distance[]={24,45,53,56,67,};
        for(int dist:distance){
            System.out.println("Printing distance in km: "+dist);
        }


        // double array salary

        double salary[]={65000.34,75000.56,86000.45,97000.46,150000.78};
        for(double sal:salary){
            System.out.println("Printing Salary of Employees: "+sal);
        }



    }
}

package loops.array;

public class Array_For {
    public static void main(String[] args) {
        // String array country

        String country[]={"India","America","China","Russia","Japan"};
        for(int i=0;i<5;i++){
            System.out.println("Printing country name: "+country[i]);
        }


// int array distance

        int distance[]={24,45,53,56,67,};
        for(int i=0;i<5;i++){
            System.out.println("Printing Distance in Km: "+distance[i]);
        }


        // double array salary


        double salary[]={65000.34,75000.45,86000.56,97000.45,150000.68};
        for(int i=0;i<5;i++){
            System.out.println("Printing Salary of Employees: "+salary[i]);
        }
    }
}

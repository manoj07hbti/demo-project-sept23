package loops.array;

public class Array_While {
    public static void main(String[] args) {

        // String array country

        String country[]={"India","America","China","Russia","Japan"};
        int i=0;
        while(i<5){
            System.out.println("Printing country name: "+country[i]);
            i++;
        }


        // int array distance


        int distance[]={24,45,53,56,67,};
        i=0;
        while(i<5){
            System.out.println("Printing Distance in Km: "+distance[i]);
            i++;

        }


        // double array salary


        double salary[]={65000.45,75000.53,86000.65,97000.79,150000.42};
        i=0;
        while(i<5){
            System.out.println("Printing Salary of Employees: "+salary[i]);
            i++;
        }






    }
}

package loops.array;

public class Array_DoWhile {
    public static void main(String[] args) {

        // String array country

        String country[]={"India","America","China","Russia","Japan"};
        int i=0;
        do{
            System.out.println("Printing country name: "+country[i]);
            i++;
        }while(i<5);


        // int array distance


        int distance[]={24,45,53,56,67,};
        i=0;
        do{
            System.out.println("Printing Distance in Km: "+distance[i]);
            i++;
        }while(i<5);


        // double array salary


        double salary[]={65000.34,75000.45,86000.37,97000.78,150000.89};
         i=0;
         do{
             System.out.println("Printing Salary of Employees: "+salary[i]);
             i++;
         }while(i<5);

    }
}

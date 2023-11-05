package loop_working;

public class ArrayDoWhile {

    public static void main(String[] args) {
        // String array country

        String country[]={"India","Canada","China","Russia","Japan"};
        int i=0;
        do{
            System.out.println("Printing country name: "+country[i]);
            i++;
        }while(i<5);


        // int array distance


        int distance[]={34,75,63,36,69,};
        i=0;
        do{
            System.out.println("Printing Distance in Km: "+distance[i]);
            i++;
        }while(i<5);


        // double array salary


        double salary[]={54000.14,59000.75,76000.57,65000.08,430000.09};
        i=0;
        do{
            System.out.println("Printing Salary of Employees: "+salary[i]);
            i++;
        }while(i<5);

    }
    }


package conditional_statments;

public class DemoSwitchStatement {

    public static void main(String[] args) {

        // Print day name according to day like 1-Sunday, 2-Monday....

        int day=5;

        switch (day){

            case 1:
                System.out.println("Sunday"); // if(day==1)
                break;
            case 2:
                System.out.println("Monday"); //    if(day==2)
                break;
            case 3:
                System.out.println("Tuesday");//if(day==3)
                break;
            case 4:
                System.out.println("Wednesday"); // if(day==4)
                break;
            case 5:
                System.out.println("Thursday"); //    if(day==5)
                break;
            case 6:
                System.out.println("Friday");//if(day==6)
                break;
            case 7:
                System.out.println("Saturday");//if(day==7)
                break;
            default:
                System.out.println("Invalid day entered...");


        }

        int number=3;
        switch (number%2){

            case 0:
                System.out.println("even Number..");
                break;
            default:
                System.out.println("Odd Number...");

        }


    }
}

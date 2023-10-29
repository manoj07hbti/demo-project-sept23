package conditional_statment;

public class DemoSwitchStatement {

    public static void main(String[] args) {

        // print day name according  to day like sunday 1 monday 2......


        int day = 7;

        switch (day) {
            case 1:
                System.out.println("sunday"); //if (day==1)
                break;
            case 2:
                System.out.println("Monday"); //if (day==2)
                break;

            case 3:
                System.out.println("Tuesday"); // if(day==3)
                break;
            case 4:
                System.out.println("wednesday"); // if(day==4)

            case 5:
                System.out.println("Thusday"); //if (day==5)
                break;
            case 6:
                System.out.println("Friday"); // if(day==6)
                break;
            case 7:
                System.out.println("Saturday"); // if(day==7)
            default :
                System.out.println(" Invalid   day entered ");

        }


    }


}

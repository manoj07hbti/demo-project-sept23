package conditional_statment.condition_all_assignment;

public class Assignment_Switch {

    public static void main(String[] args) {
        // print month name according to  month like January 1 February 2 ...........

        int month = 23;

        switch (month) {

            case 1:
                System.out.println("January"); // if (month==1)
                break;
            case 2:
                System.out.println(" February "); // if(month==2)
                break;
            case 3:
                System.out.println(" March "); // if(month==3)
            case 4:
                System.out.println(" April"); // if(month==4)
                break;
            case 5:
                System.out.println(" May   "); // if(month==5)
                break;
            case 6:
                System.out.println(" June  "); // if(month==6)
            case 7:
                System.out.println(" July  "); // if(month==7)
                break;
            case 8:
                System.out.println("  August "); // if(month==8)
                break;
            case 9:
                System.out.println(" September "); // if(month==9)
            case 10:
                System.out.println(" October "); // if(month==10)
                break;
            case 11:
                System.out.println(" November "); // if(month==11)
                break;
            case 12:
                System.out.println(" December"); // if(month==12)

            default:
                System.out.println( " Invalid month entered..............");
        }
    }
}
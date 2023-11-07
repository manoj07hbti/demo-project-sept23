package loops;

public class BreakAndContinue {
    public static void main(String[] args) {
        int month=1;
        switch (month) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
            default:
                System.out.println("Invalid month entered");
        }
        //print marks of Students in a class and if you find any students with less than 33 marks then you need break.
        int[] marks = {67, 25, 90, 76, 10, 64, 37, 12, 45};
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] <= 33) {
                continue;
            } else {
                System.out.println("you passed " + marks[i]);
            }
        }
    }
}

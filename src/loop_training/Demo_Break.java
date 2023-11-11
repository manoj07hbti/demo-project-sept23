package loop_training;

public class Demo_Break {
    public static void main(String[] args) {

        // print marks of Students in a class and if you find any students with less than 33 marks
        //   then you need break.

        int marks[]={56,69,32,85,73,35,68};

        for(int c:marks){

            if(c==32){
                break;
            }else {System.out.println("sachin marks :"+c);}





        }

        String city[]={"Agra","Mumbai","Banglore","Delhi","Pune"};

        for(String Cities:city){

            System.out.println("printing city name: " +Cities);

            if(Cities=="Delhi"){
                break;
            }
        }

        int month=1;

        switch(month){

            case 1:
                System.out.println("january");

            case 2:
                System.out.println("february");

            case 3:
                System.out.println("march");

            case 4:
                System.out.println("april");

            case 5:
                System.out.println("may");

            case 6:
                System.out.println("june");

            case 7:
                System.out.println("july");

            case 8:
                System.out.println("august");

            case 9:
                System.out.println("september");

            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");

            case 12:
                System.out.println("december");

            default:
                System.out.println("your enquiry is wrong");
        }


    }
}

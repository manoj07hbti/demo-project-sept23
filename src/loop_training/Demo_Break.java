package loop_training;

public class Demo_Break {
    public static void main(String[] args) {

        // print marks of Students in a class and if you find any students with less than 33 marks
        //   then you need break.

        int marks[]={56,69,33,85,73,68};

        for(int number:marks){


            System.out.println("sachin marks :"+number);

            if(number==33){
                break;}
        }

        String city[]={"Agra","Mumbai","Banglore","Delhi","Pune"};

        for(String Cities:city){

            System.out.println("printing city name: " +Cities);

            if(Cities=="Delhi"){
                break;
            }
        }


    }
}

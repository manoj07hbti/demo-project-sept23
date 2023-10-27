package sunday_test;

public class FirstTest {
    public static void main(String[] args) {
        // 1. checking eligibility of voter in pune
        // Indian standard for voting , age should be >=18, CityName= pune(given)
        // I have just checked input given to me
        int age=21;
        String CityName="pune";
        if(age>=18 && CityName=="pune" ){
            System.out.println("Eligible for voting");

        } else{
            System.out.println(" Not eligible for voting");
        } { //2. calculate 5% of 500
            int a=5;
            int b=500;
            double percentage=(double)a*b/100;
            System.out.println("5 percent of 500 =" +percentage +"%");
            // I could not see Q.Number 3 so I have moved it down


        }  //4. Now nationality is being checked which is Indian or not
            String Nationality="Indian";
            String state="Maharashtra";
            if(Nationality=="Indian" && state=="Maharashtra" ){
                System.out.println("Person Nationality is: Indian");
            } else{
                System.out.println(" Person is from different country");
            } { //5. swap two number
                int x=20;
                int y=40;
                x=x+y;
                y=x-y;
                x=x-y;
                System.out.println("printing x= " + x);
                System.out.println("printing y= " + y);



            } {//3. checking odd or even number , first I took number=20 then number=11
                int number=20;
                if(number%2==0){
                    System.out.println("Printing even number: "+ number);
                } else{
                    System.out.println("printing odd number:"+ number );
                } number=11;
                if(number%2==0){
                    System.out.println("Printing even number:"+ number);
                } else{
                    System.out.println("Printing odd number:" + number);
                }

        }



        }

    }


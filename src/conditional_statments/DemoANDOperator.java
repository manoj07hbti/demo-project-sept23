package conditional_statments;

public class DemoANDOperator {
    public static void main(String[] args) {

        int age=19;
        String city="Pune";
 // if(condition1 && condition2)
//TRUE && TRUE = TRUE
        if(age>=18 && city=="Pune"){
            System.out.println("Candidate is eligible for voting in Pune...");
        }else {
            System.out.println("Candidate is NOT eligible for voting in Pune...");

        }
//TRUE && FALSE= FALSE
        city="Agra";
        if(age>=18 && city=="Pune"){
            System.out.println("Candidate is eligible for voting in Pune...");
        }else {
            System.out.println("Candidate is NOT eligible for voting in Pune...");

        }
//3. FALSE && TRUE= FALSE
      age=17;
      city="Pune";
        if(age>=18 && city=="Pune"){
            System.out.println("Candidate is eligible for voting in Pune...");
        }else {
            System.out.println("Candidate is NOT eligible for voting in Pune...");

        }
//4.   FALSE && FALSE= FALSE
        age=15;
        city="Mumbai";
        if(age>=18 && city=="Pune"){
            System.out.println("Candidate is eligible for voting in Pune...");
        }else {
            System.out.println("Candidate is NOT eligible for voting in Pune...");

        }


    }
}

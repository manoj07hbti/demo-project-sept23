package conditional_satement;

public class AgeGroupCode {

    public static void main(String[] args) {

        //Write a code to check Age group
        //  1. age >0 and <18  : Child
        //  2. age >=18  and <=40 : Young
        //  3. age >=60 : Old Age
        //Write a code to identify  number which is not divisible by 3

        int age = 5;
        if(age>0 && age<18){
            System.out.println("It is a cute and small child");
        }else{
            System.out.println("It is not a child it is a youngster");
        }
    }


}

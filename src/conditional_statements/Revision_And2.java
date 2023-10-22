package conditional_statements;

public class Revision_And2 {
    public static void main(String[] args) {
        int age=23;
        if(age>0 && age<18){
            System.out.println("Child");
        }
        if(age>=18 && age<=40){
            System.out.println("Young");
        }
        if(age>=60){
            System.out.println("Old Age");
        }
    }
}

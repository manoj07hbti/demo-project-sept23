package test_28_jan_sunday;

public class Pattern_Program {

    public void pattern(int n){

        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pattern_Program obj=new Pattern_Program();
        obj.pattern(5);
    }
}

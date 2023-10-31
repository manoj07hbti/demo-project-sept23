package loops;

public class For_Loop {
    public static void main(String[] args) {
        // Table of 5 using for loop
        int number = 5;
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }



//Table of 10 using for loop
         number=10;
        for(i=1;i<=10;i++){
            System.out.println(number+" x "+i+" = "+number*i);
        }




 // Find even and odd no. b/w 1 to 100 using for loop

        for(i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i+" ...is even number");
            }else{
                System.out.println(i+" ...is odd number");
            }
        }
    }
}

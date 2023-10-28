package loop_working;

public class DemoLoop {
    public static void main(String[] args) { // table of 5
        int number = 5;
        int i;
        for(i=1; i<=10; i++){
            System.out.println(number + "X" + i + "=" + number * i);


        }


        // table of 10
        { number=10;

            for(i=1; i<=10; i++){
                System.out.println(number + "X"+i+"="+number*i);
            }

        } // print 1 to 100 even or odd number 1,2,3,
        for(i=1; i<=100; i++){
            if(i%2==0){
                System.out.println("even number"+"="+i);
            } else{
                System.out.println("odd number"+"="+i);
            }
        }



    }
}

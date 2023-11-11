package loop_training;

public class Demo_Continue  {

    public static void main(String[] args) {
        int number=10;

        for(int a=0; a<=10; a++){


            if(a==7){
                continue;
            }

            System.out.println("printing number: "+a);


        }
        //print marks of Students in a class and if you find any students with less than 33 marks
        //   then you need break.
        //
        //   continue
        int marks[]={58,56,88,87,33,46};

        for( int i=0;i<marks.length;i++){

            if(i==4){
                continue;
            }

            System.out.println("printing marks: "+marks[i]);
        }
        int num[]={56,69,32,33,85,73,30,68};

        for(int c:num){

            if(c<=33){
                continue;
            }else

            {System.out.println("sachin marks :"+c);}





        }






    }
}

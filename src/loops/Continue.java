package loops;

public class Continue {
    public static void main(String[] args) {
        int marks[]={67,78,86,86,23,32,45,25,31,33,89};
                for(int i=0;i<11;i++){
                    if(marks[i]<=33){
                        continue;
                    }else{
                        System.out.println("Printing marks: "+marks[i]);
                    }

                }
    }
}

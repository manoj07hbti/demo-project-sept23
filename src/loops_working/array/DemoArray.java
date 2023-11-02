package loops_working.array;

public class DemoArray {

    public static void main(String[] args) {

        //SYNTAX : Datatype varName [] = {value1, value2,value3.......value N};
        int marks [] = {45,23,56,67,34,56,87,34,99,05};

        // reading Array data : varName[INDEX];

        System.out.println(marks[3]);
        System.out.println(marks[7]);

        // print all value from array , array.length will always gives you size of array
        for(int i=0; i<marks.length; i++){
            System.out.println("Printing Array in for Loop: "+marks[i]);

        }
        // print using  while loop
//   for (Datatype varName : arrayName){
//       //CODE
//       }
        for(int var: marks){
            System.out.println("Printing Array in Advanced for Loop..."+var);
        }

        String cities []= {"Pune","Agra","Delhi","Mumbai","Jaipur","Bhopal"};
        for(String city: cities){
            System.out.println("Printing City: "+city);
        }

    }




}

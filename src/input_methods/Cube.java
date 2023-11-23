package input_methods;

public class Cube {

       // Assignment :
       // 1- write a method for cube;

       public void Cube(int number){

              System.out.println("Cube of given number is " + number*number*number);
           
       }

       public static void main(String[] args) {

              Cube obj= new Cube();

              obj.Cube(5);
       }
}

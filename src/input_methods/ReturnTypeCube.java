package input_methods;

public class ReturnTypeCube {

       // ReturnTypeCube;

       public int makeCube(int number){

              int result= number*number*number;

              return result;
       }

       public static void main(String[] args) {

              ReturnTypeCube obj= new ReturnTypeCube();

              int result= obj.makeCube(2);

              System.out.println("Make cube output is " + result);
       }
}

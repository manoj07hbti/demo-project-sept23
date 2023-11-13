package class_and_object;

public class Book {

    // data members
    String name="Java";
    int pages=500;
    String writeName="James Gosling";
    double price=455.46;

    //capabilities or methods or functions : read , write , sale

   // Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    // method1
    public void readMethod(){
        System.out.println("***** This is read method of Book....");
    }
    // method2
    public void writeMethod(){
        System.out.println("***** This is write method of Book....");
    }
    // method 3
    public void saleMethod(){
        System.out.println("***** This is Sale method of Book...");
    }
    public static void main(String[] args) {

        //SYNTAX : ClassName objName= new ClassName();  step 1: create Object
         Book obj= new Book(); // we have created obj Object of class book

        //CALLING A METHOD  step 2: objName.MethodName();
        obj.readMethod();

        obj.writeMethod();
        obj.saleMethod();
        System.out.println("Printing info of Book object: "+obj.name +" "+obj.writeName);

        Book obj2= new Book();
        System.out.println("Printing info of Book object: "+obj2.name +" "+obj2.writeName);

        BookParam objParam= new BookParam("Java",345,34.22);

        System.out.println(objParam.price);
    }


}

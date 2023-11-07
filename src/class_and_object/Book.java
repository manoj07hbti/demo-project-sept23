package class_and_object;

public class Book {

    // data members
    String name="Java";
    int pages=500;
    String writeName="James Gosling";
    double price=455.46;


    public static void main(String[] args) {

        //SYNTAX : ClassName objName= new ClassName();
         Book obj= new Book(); // we have created obj Object of class book

        System.out.println("Printing info of Book object: "+obj.name +" "+obj.writeName);

        Book obj2= new Book();
        System.out.println("Printing info of Book object: "+obj2.name +" "+obj2.writeName);

    }


}

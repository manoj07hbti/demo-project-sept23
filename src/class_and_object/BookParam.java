package class_and_object;

public class BookParam {
    //data member
    String name;
    int pages;
    double price;

    //parameterized constructor

    public BookParam(String name, int pages, double price) {
        this.name = name;
        this.pages = pages;
        this.price = price;
    }

    public static void main(String[] args) {
        //SYNTAX: ClassName objName= new ClassName(value1, value2, value3.......valueN);
        BookParam book1= new BookParam("Java",490,564.56);

        System.out.println("Printing book name: "+book1.name+" Page: "+book1.pages+" Price: "+book1.price);

        BookParam book2= new BookParam("Spring",300,201.24);

        System.out.println("Printing book2 name: "+book2.name+" Page: "+book2.pages+" Price: "+book2.price);

        BookParam book3= new BookParam("Hibernate",298, 254.67);
        System.out.println("Printing book3 name: "+book3.name+" Page: "+book3.pages+" Price: "+book3.price);
    }



}

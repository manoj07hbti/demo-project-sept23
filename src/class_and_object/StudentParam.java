package class_and_object;

public class StudentParam {

    // Data Members;

    String name;

    int pages;

    double price;

    // parameterized constructor;

    public StudentParam(String name, int pages, double price) {
        this.name = name;
        this.pages = pages;
        this.price = price;
    }

    public static void main(String[] args) {

        //SYNTAX: ClassName objName= new ClassName(value1, value2, value3.......valueN);

        StudentParam obj1 = new StudentParam("English", 500, 200);

        System.out.println("Printing info of StudentParam: " + obj1.name + " " + obj1.pages + " " + obj1.price);

        StudentParam obj2 = new StudentParam("Math", 100, 300);

        System.out.println("Printing info of StudentParam: " + obj2.name + " " + obj2.pages + " " + obj2.price);

        StudentParam obj3 = new StudentParam("Accountancy", 600, 500);

        System.out.println("Printing info of StudentParam: " + obj3.name + " " + obj3.pages + " " + obj3.price);

        StudentParam obj4 = new StudentParam("Economics", 400, 600);

        System.out.println("Printing info of StudentParam: " + obj4.name + " " + obj4.pages + " " + obj4.price);

        StudentParam obj5 = new StudentParam("Java", 1000, 700);

        System.out.println("Printing info of StudentParam: " + obj5.name + " " + obj5.pages + " " + obj5.price);


    }
}

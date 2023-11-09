package class_and_object;

public class Engineer
{
String branch= "Software Engineering";
String finalproject= "Cab Booking Application";
    int years=4;
    int semesters=8;
    double CGPA=6.68;

    public static void main(String[] args)
    {

    Engineer obj= new Engineer();
        System.out.println("Printing Engineers info " + " Engineer is from " +obj.branch);

        System.out.println("Engineer made "+ obj.finalproject + " in Final semester");

        System.out.println("Engineer spends " + obj.years + " years in engineering");

        System.out.println("Engineer gives " +obj.semesters+ " semesters");

        System.out.println("Engineer acquired " +obj.CGPA + " CGPA in final exam");



    }

}

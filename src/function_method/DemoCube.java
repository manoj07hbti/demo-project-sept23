package function_method;

public class DemoCube {
    public void cube(int number){
        System.out.println("Cube of given number are: "+number*number*number);
    }

    public static void main(String[] args) {
        DemoCube obj=new DemoCube();
        obj.cube(5);
        obj.cube(9);
        obj.cube(23);

    }
}

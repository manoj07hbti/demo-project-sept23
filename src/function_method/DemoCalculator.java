package function_method;

public class DemoCalculator {
    public void add(int a, int b) {
        int result = a + b;
        {
            System.out.println("Addition of number are:" + result);
        }
    } public void subtraction(int a, int b){
        int result=a-b;{
            System.out.println("Subtraction of given number are:"+ result);
        }
    } public void multi(int a, int b){
        int multi=a*b;{
            System.out.println("Multiply of given number :"+ multi);
        }
    } public void division(int a ,int b){
        double divide=(double)a/b;{
            System.out.println("Division of given number are:"+ divide);
        }
    } public void per(int a, int b){
        double percent=(double)a*b/100;{
            System.out.println("Percent of given are:"+ percent);

        }
    }

    public static void main(String[] args) {
        DemoCalculator obj = new DemoCalculator();
        obj.add(7, 9);
        obj.add(76, 98);
        obj.add(987, 876);
        DemoCalculator obj1=new DemoCalculator();
        obj1.subtraction(67,65);
        obj1.subtraction(87,34);
        DemoCalculator obj2=new DemoCalculator();
        obj2.multi(78,98);
        obj2.multi(87,9);
        obj2.multi(11,11);
        DemoCalculator obj3=new DemoCalculator();
        obj3.division(11,3);
        obj3.division(78,12);
        obj3.division(9,2);
        DemoCalculator obj4=new DemoCalculator();
        obj4.per(50,10);
        obj4.per(67,13);
        obj4.per(100,33);
    }
}
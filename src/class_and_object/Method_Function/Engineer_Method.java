package class_and_object.Method_Function;

public class Engineer_Method {

    public void giveCompanyOutput(){
        System.out.println("This is company output method");
    }

    public void eat(){
        System.out.println("This is eat method");
    }
    public void runLaptop(){
        System.out.println("This is run laptop method");
    }
    public void sleep(){
        System.out.println("This is sleep method ");
    }

    public static void main(String[] args) {

        Engineer_Method obj = new Engineer_Method();
        obj.eat();
        obj.runLaptop();
        obj.giveCompanyOutput();
        obj.sleep();
    }
}

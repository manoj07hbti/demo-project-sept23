package class_and_object.Method_Function;

public class Doctor_Method {

    public void takeFees() {
        System.out.println("This is Fees method");
    }

    public void suggestPatients() {
        System.out.println("This is Suggest Patient method");
    }

    public void drinkWater() {
        System.out.println("This is Drink Water method");
    }

    public void takeFood() {
        System.out.println("This is Take Food method");
    }

    public static void main(String[] args) {

        Doctor_Method obj = new Doctor_Method();
        obj.drinkWater();
        obj.suggestPatients();
        obj.takeFees();
        obj.takeFood();

    }
}
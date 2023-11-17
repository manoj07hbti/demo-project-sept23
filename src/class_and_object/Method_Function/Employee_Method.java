package class_and_object.Method_Function;

public class Employee_Method {


        public void work (){
            System.out.println("Employee work");
        }

        public void eat(){
            System.out.println("This is eat method");
        }
        public void sleep(){
            System.out.println("This is sleep method");
        }
        public void walk(){
            System.out.println("This is walk method");
        }

    public static void main(String[] args) {

            Employee_Method obj = new Employee_Method();
            obj.eat();
            obj.sleep();
            obj.work();
            obj.walk();

    }

    }

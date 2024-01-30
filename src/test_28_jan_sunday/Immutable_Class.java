package test_28_jan_sunday;

public final class Immutable_Class {



        private String name;
        private int age;
        private double salary;




    public Immutable_Class(String name, int age, double salary){
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName () {
            return name;
        }

        public int getAge () {
            return age;
        }

        public double getSalary () {
            return salary;
        }

    public static void main(String[] args) {
        Immutable_Class obj=new Immutable_Class("Shyam",24,89000.58);
        System.out.println("Name: "+obj.name+" Age: "+obj.age+" Salary: "+obj.salary);

    }
    }




package methods;

public class Doctor {

    String name;
    String department;
    String degree;
    String hospitalName;

    public Doctor(String name, String department, String degree, String hospitalName) {
        this.name = name;
        this.department = department;
        this.degree = degree;
        this.hospitalName = hospitalName;
    }

    public void Research(){
        System.out.println(name+" is research about virus");

    }
    public void medicine(){
        System.out.println(name+" is giving medicine");
    }
    public void operation(){
        System.out.println(name+" is doing heart surgary");
    }

    public static void main(String[] args) {
     Doctor orth=new Doctor("Ashwani","orthopadic","Master degree","Atharv hospital");
     orth.Research();
     orth.medicine();
     orth.operation();

    }


}

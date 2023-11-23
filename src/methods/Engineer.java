package methods;

public class Engineer {

    String name;
    int employee_id;
    String department;
    double salary;


    public Engineer(String name, int employee_id, String department, double salary) {
        this.name = name;
        this.employee_id = employee_id;
        this.department = department;
        this.salary = salary;
    }

    public void design(){
        System.out.println(name + " Engineer create a design");


    }
    public void estimate(){
        System.out.println(name + " Engineer is give estimate");
    }
    public void siteVisit(){
        System.out.println(name + " Engineer done his site visit");
    }

    public static void main(String[] args) {
        Engineer emp=new Engineer("Deepak",443599,"civil",80000.5);

        emp.design();
        emp.estimate();
        emp.siteVisit();
    }
}

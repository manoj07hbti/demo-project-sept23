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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
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

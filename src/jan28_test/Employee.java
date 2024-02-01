package jan28_test;
public class Employee {

    String Name;
    double Salary;
    String City;
    String Department;

    public Employee(String Name, double Salary, String City, String Department) {
        this.Name = Name;
        this.Salary = Salary;
        this.City = City;
        this.Department = Department;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getDep() {
        return Department;
    }

    public void setDep(String dep) {
        Department = Department;
    }
}

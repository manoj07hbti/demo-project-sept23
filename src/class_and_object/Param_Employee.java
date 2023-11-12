package class_and_object;

public class Param_Employee {
    String name;
    int age;
    double salary;
    int joiningYear;
    String company;


    public Param_Employee(String name, int age, double salary, int joiningYear, String company) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.joiningYear = joiningYear;
        this.company = company;
    }

    public static void main(String[] args) {
        Param_Employee employee = new Param_Employee("Abhishek",23,87000.45,2023,"TATA");
        System.out.println("Name: "+employee.name+" Age: "+employee.age+" Salary: "+employee.salary+" Joining Year: "+employee.joiningYear+" Company: "+employee.company);

        Param_Employee employee2 = new Param_Employee("Rahul",24,95000.78,2023,"Wipro");
        System.out.println("Name: "+employee2.name+" Age: "+employee2.age+" Salary: "+employee2.salary+" Joining Year: "+employee2.joiningYear+" Company: "+employee2.company);

        Param_Employee employee3 = new Param_Employee("Suresh",23,87095.76,2022,"Jio");
        System.out.println("Name: "+employee3.name+" Age: "+employee3.age+" Salary: "+employee3.salary+" Joining Year: "+employee3.joiningYear+" Company: "+employee3.company);

        Param_Employee employee4 = new Param_Employee("Virat",24,98046.98,2023,"Suzuki");
        System.out.println("Name: "+employee4.name+" Age: "+employee4.age+" Salary: "+employee4.salary+" Joining Year: "+employee4.joiningYear+" Company: "+employee4.company);

        Param_Employee employee5 = new Param_Employee("Ramesh",24,97023.74,2021,"Mahindra");
        System.out.println("Name: "+employee5.name+" Age: "+employee5.age+" Salary: "+employee5.salary+" Joining Year: "+employee5.joiningYear+" Company: "+employee5.company);




    }
}

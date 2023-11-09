package constructor;

public class Employee {
    String employeeName;
    int employeeId;
    int employeeAge;
    double employeeSalary;

    public Employee(String employeeName, int employeeId, int employeeAge, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
    }

    public static void main(String[] args) {
        Employee employee1=new Employee("rahul",201,35,60500.34);
        System.out.println("Printing employee name: "+employee1.employeeName+"\n"+
                "Printing employee id: "+employee1.employeeId+"\n"+
                "Printing employee age: "+employee1.employeeAge+"\n"+
                "Printing employee salary: "+employee1.employeeSalary);

        Employee employee2=new Employee("rubina",202,25,10000);
        System.out.println("Printing employee name: "+employee2.employeeName+"\n"+
                "Printing employee id: "+employee2.employeeId+"\n"+
                "Printing employee age: "+employee2.employeeAge+"\n"+
                "Printing employee salary: "+employee2.employeeSalary);

        Employee employee3=new Employee("heema",203,60,5500.2345);
        System.out.println("Printing employee name: "+employee3.employeeName+"\n"+
                "Printing employee id: "+employee3.employeeId+"\n"+
                "Printing employee age: "+employee3.employeeAge+"\n"+
                "Printing employee salary: "+employee3.employeeSalary);

        Employee employee4=new Employee("rose",204,15,90500.45);
        System.out.println("Printing employee name: "+employee4.employeeName+"\n"+
                "Printing employee id: "+employee4.employeeId+"\n"+
                "Printing employee age: "+employee4.employeeAge+"\n"+
                "Printing employee salary: "+employee4.employeeSalary);

        Employee employee5=new Employee("khushi",205,70,45099.885);
        System.out.println("Printing employee name: "+employee5.employeeName+"\n"+
                "Printing employee id: "+employee5.employeeId+"\n"+
                "Printing employee age: "+employee5.employeeAge+"\n"+
                "Printing employee salary: "+employee5.employeeSalary);
    }
}

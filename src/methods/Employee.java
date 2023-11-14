package methods;

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

    public void attendMeetings() {
        System.out.println("Employee " + employeeName + " is attending a meeting");
    }

    public void submitReport() {
        System.out.println("Employee " + employeeName + " is submitting a report");
    }

    public void conductTraining() {
        System.out.println("Employee " + employeeName + " is conducting a training session");
    }

    public void respondToEmails() {
        System.out.println("Employee " + employeeName + " is responding to emails ");
    }

    public static void main(String[] args) {
        Employee obj = new Employee("Riya", 20110054, 22, 15000);
        obj.attendMeetings();
        obj.submitReport();
        obj.conductTraining();
        obj.respondToEmails();
    }
}

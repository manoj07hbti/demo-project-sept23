package test_28_jan_2024.Model;
import java.util.Map;
import java.util.HashMap;
public class Company
{
    private String name;
    private Map<String, Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getName(), employee);
    }

    public Map<String, Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }
}


package collection;

import model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee_ArrayList2 {

    public Employee createEmployee(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter name of employee");
        String name=scanner.nextLine();
        System.out.println("Please enter age");
        int age= scanner.nextInt();
        System.out.println("Please enter salary");
        double salary=scanner.nextDouble();

        Employee employee=new Employee(name,age,salary);
        return employee;

    }

    public ArrayList<Employee> createEmployeeList(){
        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        return employeeArrayList;
    }

    public static void main(String[] args) {
        Employee_ArrayList2 obj = new Employee_ArrayList2();
        ArrayList<Employee> employeeArrayList=obj.createEmployeeList();


        String choice="Y";

        while(choice.equals("Y")){
            Employee employee=obj.createEmployee();
            employeeArrayList.add(employee);

            System.out.println("Do you want to enter another data ");
            Scanner scanner=new Scanner(System.in);
            String newChoice=scanner.nextLine();

            if(!newChoice.equals("Y")){
                break;
            }

            for(Employee employee1: employeeArrayList){
                System.out.println("Printing age: "+employee.getName()+
                        "Printing Age: "+employee1.getAge()+
                        "Printing salary: "+employee1.getSalary());
            }


        }



    }

}

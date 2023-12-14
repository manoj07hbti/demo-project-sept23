package collection;

import model.Doctor;
import model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorArraylistScanner {
    public Doctor createDoctor(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter doctor name: ");
        String name=scanner.nextLine();
        System.out.println("please enter department name: ");
        String department=scanner.nextLine();
        System.out.println("please enter degree name: ");
        String degree=scanner.nextLine();
        Doctor doctor=new Doctor(name,department,degree);
        return doctor;

    }

    public static void main(String[] args) {
        DoctorArraylistScanner obj=new DoctorArraylistScanner();
        ArrayList<Doctor> doctorArrayList=new ArrayList<>();

        String choice="y";
        Scanner scanner=new Scanner(System.in);
        while(choice.equals("y")){
            Doctor doctor=obj.createDoctor();
            doctorArrayList.add(doctor);
            System.out.println("press y to continue or press any key to exit....");
            String newchoice= scanner.nextLine();
            choice=newchoice;

        }
        for(int i=0;i< doctorArrayList.size();i++){
            System.out.println("printing doctor data: "+doctorArrayList.get(i).getName()+",degree: "+doctorArrayList.get(i).getDegree()+",department: "+doctorArrayList.get(i).getDepartment());
        }



    }


}

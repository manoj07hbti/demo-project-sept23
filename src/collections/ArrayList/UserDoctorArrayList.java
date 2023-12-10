package collections.ArrayList;

import model.Doctor;
import java.util.ArrayList;
import java.util.Scanner;

public class UserDoctorArrayList
{
    public Doctor createDoctor(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter the name of the doctor:-");
        String name= scanner.nextLine();

        System.out.println("Please enter the department of the doctor:-");
        String department= scanner.nextLine();

        System.out.println("Please enter the batchID");
        int batchID = scanner.nextInt();

        System.out.println("please enter the visiting fees of the doctor");
        int fees= scanner.nextInt();

        Doctor doctor= new Doctor(name, department, batchID, fees);

        return doctor;
    }
    public static void main(String[] args)
    {
        UserDoctorArrayList obj= new UserDoctorArrayList();
        ArrayList<Doctor> doctorArrayList= new ArrayList<>();
        String choice="Y";
      Scanner scanner=new Scanner(System.in);
      while (choice.equals("Y")){
         Doctor doctor= obj.createDoctor();
          doctorArrayList.add(doctor);

          System.out.println("please press Y to add more Doctors or any Key to exit...........");

          String newchoice= scanner.nextLine();
          choice=newchoice;


      }
      for(Doctor var: doctorArrayList){
          System.out.println("Doctor Name " +var.getName()+ " Dept. "+var.getDepartment()+ " BatchID "+ var.getBatchID()+ " Visiting Fees "+ var.getFees());
      }
    }
}
package collections;

import model.Doctor;

import javax.print.Doc;
import java.util.ArrayList;

public class DoctorArrayList
{
public ArrayList<Doctor> createDoctorList()
{
    ArrayList<Doctor> DoctorArrayList= new ArrayList<>();

    Doctor doctor1=new Doctor("Rajkumar kalya","Neurosurgeon", 2114113, 500);
    Doctor doctor2=new Doctor("mukesh khanna", "physician", 123132, 1200);
    Doctor doctor3=new Doctor("Rohan Modi","ITUS",543213, 2000);

    DoctorArrayList.add(doctor1);
    DoctorArrayList.add(doctor2);
    DoctorArrayList.add(doctor3);

    return DoctorArrayList;
}

    public static void main(String[] args)
    {
        DoctorArrayList obj= new DoctorArrayList();
ArrayList<Doctor> doctors= obj.createDoctorList();

for (int i=0; i<doctors.size(); i++)
{
    System.out.println("Printing doctors information: "+ doctors.get(i).getName());
    System.out.println("Department "+ doctors.get(i).getDepartment());
    System.out.println("Batch ID " +doctors.get(i).getBatchID());
    System.out.println("Fees " +doctors.get(i).getFees());
}

for (Doctor var: doctors)
{
    System.out.println(var.getName() + var.getDepartment() + var.getBatchID() +var.getFees());
}
    }

}

package test_28_jan_2024;

interface itServices{
    public void getItServicedetails();
}

interface hardwareServices
{
    public void getHardwareServicesdetails();
}

class CompanyType implements itServices, hardwareServices{
    public void getItServicedetails(){
        System.out.println("Getting It Services Details");
    }
    public void getHardwareServicesdetails(){
        System.out.println("Getting Hardware Services Details");
    }

    }
public class MultipleInheritanceSample
{
    public static void main(String[] args) {
        CompanyType ct1= new CompanyType();
        ct1.getItServicedetails();
        ct1.getHardwareServicesdetails();
    }
}

package AssignmentVariables;

public class AssignmentVariablesMarksheet
{
    public static void main(String[] args)
    {
        int TotalMarks=1500;
        double RaghavMarks=524;
        double PraveshMarks=316;
        double PratikMarks=599;
        double MineshMarks=888;
        double RiyaMarks=999;
        double KajalMarks=1399;

        System.out.println("There was a surprise Physics test");
        System.out.println("The Test was of total 1500 marks");
        System.out.println("The results are as follows");

        System.out.println("Raghav Got " +RaghavMarks + " out of " +TotalMarks);
        double Percentage= (Double) RaghavMarks/TotalMarks*100;
        System.out.println("Hence got " +Percentage + "%");

        System.out.println("Pravesh Got " +PraveshMarks +" out of " +TotalMarks);
        Percentage=PraveshMarks/TotalMarks*100;
        System.out.println("Hence got " +Percentage +"%");

        System.out.println("Pratik Got " +PratikMarks +" Out of "+TotalMarks);
        Percentage=PratikMarks/TotalMarks*100;
        System.out.println("Hence got " +Percentage +"%");

        System.out.println("Minesh got " +MineshMarks + " Out of " +TotalMarks);
        Percentage=MineshMarks/TotalMarks*100;
        System.out.println("Hence got " +Percentage +"%");

        System.out.println("Riya Got " +RiyaMarks + " Out of " +TotalMarks);
        Percentage=RiyaMarks/TotalMarks*100;
        System.out.println("Hence Got " +Percentage +"%");

        System.out.println("Kajal Got " +KajalMarks +" Out of " +TotalMarks);
        Percentage=KajalMarks/TotalMarks*100;
        System.out.println("Hence Got " +Percentage+ "%");

        System.out.println("End of Result");





    }
}

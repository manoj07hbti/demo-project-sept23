package methods;

public class Engineer {
    String EngineerName;
    int EngineerAge;
    String EngineerDegree;
    String EngineerSpecialization;

    public Engineer(String engineerName, int engineerAge, String engineerDegree, String engineerSpecialization) {
        EngineerName = engineerName;
        EngineerAge = engineerAge;
        EngineerDegree = engineerDegree;
        EngineerSpecialization = engineerSpecialization;
    }

    public void doWork() {
        System.out.println(EngineerName + " is performing Engineering work");
    }

    public void planDesign() {
        System.out.println(EngineerName + " is planning the Design");
    }

    public void attendMeeting() {
        System.out.println(EngineerName + " is attending the meeting");
    }

    public void writeReport() {
        System.out.println(EngineerName + " is writing the report on the structure");
    }

    public static void main(String[] args) {
        Engineer obj = new Engineer("Mohan", 30, "Btech", "CivilEngineer");
        obj.doWork();
        obj.planDesign();
        obj.attendMeeting();
        obj.writeReport();
    }
}

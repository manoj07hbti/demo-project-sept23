package Array;

public class AssignmentBreakandContinue
{
    public static void main(String[] args)
    {
        int[] marks = {45, 67, 28, 80, 92};

        System.out.println("Student Marks:");

        for (int i = 0; i < marks.length; i++)
        {
            System.out.println("Student " + (i + 1) + ": " + marks[i] + " marks");

            if (marks[i] < 33) {
                System.out.println("Student " + (i + 1) + " has less than 33 marks. Breaking the loop.");
                break;
            }
        }
    }
}

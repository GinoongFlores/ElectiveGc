import java.util.Scanner;

public class RunStudentGrade extends Student {

    public static void main(String[] args) {
        Grades gr = new Grades();
        Scanner scan = new Scanner(System.in);

        String StudentName;
        String idea;

        System.out.println("--------------------Welcome to the STIer's College Grade Calculator--------------------");


        do {
            System.out.print("Enter Student Name: ");
            StudentName = scan.nextLine();

            gr.WeightGrade();

            System.out.printf("Press any key %s " + "(if you want to see your grade): ", StudentName);
            idea = scan.nextLine();
            gr.FinalGrade(idea);
            System.out.println("\n------------------------------------------------------\n");
            System.out.printf("%s's final grade average is: %.2f\n", StudentName, gr.getFinalGrade());

            gr.GPA();

            System.out.print("\nWould you like to run another calculation? | Y for Yes | N for No: ");

        } while (scan.nextLine().equalsIgnoreCase("Y"));
        System.out.println("\n--------------------Thank you for using the STIer's College Grade Calculator--------------------\n");
    }

}

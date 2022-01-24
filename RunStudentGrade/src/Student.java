import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private double average;

    public void studentGrades() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter how many subjects for this semester: ");
        int numOfSubjects = scan.nextInt();

        ArrayList<Double> assignArray = new ArrayList<>();

        if(numOfSubjects >= 20) {
            System.out.print("Are you sure you want to enter more than 20 subjects? | Y for Yes | N for No: ");
            if (scan.next().equalsIgnoreCase("Y")) {
                for (int i = 0; i < numOfSubjects; i++) {
                    System.out.printf("Enter the grade for subject # %d: ", i + 1);
                    assignArray.add(scan.nextDouble());
                }
            } else {
                System.out.println("Please rerun the program if you mistakenly entered more than 20 subjects.");
                System.exit(0);
            }
        } else {
            for (int i = 0; i < numOfSubjects; i++) {
                System.out.printf("Enter the grade for subject # %d: ", i + 1);
                assignArray.add(scan.nextDouble());
            }
        }
        AssignAvg(assignArray, numOfSubjects);
    }

    public void setAverage(double a) {
        average = a;
    }

    public double getAverage() {
        return average;
    }

    public void AssignAvg(ArrayList<Double> arrAssign, int n) {
        double sum = 0;
        for (double i : arrAssign) {
            sum += i;
        }
        double assignAvg = sum / n;
        setAverage(assignAvg);

    }
} 



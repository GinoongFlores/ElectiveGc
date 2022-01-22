/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runstudentgrade;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Phillip
 */

public class Student {
    private double assignAvg;
    private double discAvg;
    private double midAvg;
    private boolean idea;
    public boolean InputMismatch;
    Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    
    public Student(){
        
    }
    public void studentGrades() {
    System.out.print("Enter the number of Assignment grades: ");
    int numofAssignGrades = scan.nextInt();
    ArrayList<Double> assignArray = new ArrayList<> ();
    for (int i = 0; i < numofAssignGrades; i++) {
    System.out.printf("Enter Assignment grade number %d: ", i + 1);
    assignArray.add(scan.nextDouble());
}
    System.out.print("Enter the number of Discussion grades: ");
    int numofDiscGrades = scan.nextInt();
    ArrayList<Double> discArray = new ArrayList<>();
    for (int i = 0; i < numofDiscGrades; i++) {
    System.out.printf("Enter Discussion grade number %d: ", i + 1);
    discArray.add(scan.nextDouble());
    }
    
    System.out.print("Enter the number of Midweek Assignment grades: ");
    int numofMidGrades = scan.nextInt();
    ArrayList<Double> midArray = new ArrayList<>();
    for (int i = 0; i < numofMidGrades; i++) {
    System.out.printf("Enter Midweek Assignment grade number %d: ", i + 1);
    midArray.add(scan.nextDouble());
    }
    
    AssignAvg(assignArray, numofAssignGrades);
    DiscAvg(discArray, numofDiscGrades);
    MidAvg(midArray, numofMidGrades);
   }

    public void setAssignAvg(double a) {
    assignAvg = a;
    }
    public double getAssignAvg() {
return assignAvg;
}
public void AssignAvg(ArrayList<Double> arrAssign, int n) {
double sum = 0;
for (double i : arrAssign) {
sum += i;
}
double assignAvg = sum/n;
setAssignAvg(assignAvg);
}

public void setDiscAvg(double d) {
discAvg = d;
}

public double getDiscAvg() {
return discAvg;
}
public void DiscAvg(ArrayList<Double> arrDisc, int n) {
double sum = 0;
for (double i : arrDisc) {
sum += i;
}
double discAvg = sum / n;
setDiscAvg (discAvg);
}
    public void setMidAvg(double m) {
    midAvg = m;
}
    public double getMidAvg() {
    return midAvg;
}
    public void MidAvg(ArrayList<Double> arrMid, int n) {
double sum = 0;
for (double i : arrMid) {
	sum+= i;
}
double midAvg = sum / n;
setMidAvg(midAvg) ;

}
} 



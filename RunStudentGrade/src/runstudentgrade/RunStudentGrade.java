/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runstudentgrade;

import java.util.Scanner;

/**
 *
 * @author Phillip
 */
public class RunStudentGrade {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String StudentName;
        int studType;
        String idea;
        String answer; 
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the Student Grade Calculator");
        do{
           System.out.print("Enter Student Name: ");
           StudentName = scan.next();
            
            System.out.printf("Select %s  student type: \n1. Under Graduate" + " student \n2. Graduate student\n-->: ", StudentName);
            
            
            studType = scan.nextInt(); 
            switch (studType) { 
                case 1:
                
                UnderGrad ug = new UnderGrad();
                ug.WeightGrade();
                System.out.printf("Press any key %s " + "(if you want to see your grade):", StudentName);
                 idea = scan.next();
                 ug.FinalGrade(idea); 
                 System.out.printf("%s  final grade average is: %.2f\n", StudentName, ug.getFinalGrade());
                 break;
                 
                 case 2:
                     Grad g = new Grad();
                     g.weightedGrade(); 
                     System.out.printf("Enter the final thesis grade for %s:", StudentName);
                     double thesis = scan.nextDouble();
                     System.out.printf("Press any key %s " + "(if you want to see your grade): ", StudentName); 
                      idea = scan.next();
                      g.FinalGrade(thesis, idea); System.out.printf("%s  final grade average is: %.2f\n", StudentName, g.getFinalGrade());
                      break; 
                      
                 default:
                     System.out.println("Data does not compute: Please provide " + "a valid entry for student type.");
                     System.exit(1); 
            }
            System.out.print("\nWould you like to run another calculation?" + "Y for Yes, N for No: ");
            answer = scan.next();
            
        }while (answer.equalsIgnoreCase("Y"));
        System.out.println("\nThank you for using the Student Calculator. " + "STIERSS!\n");
    }
    
}

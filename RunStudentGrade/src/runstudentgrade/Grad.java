/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runstudentgrade;

/**
 *
 * @author Phillip
 */
public class Grad extends Student {
    private final double ASSIGNWT = 0.40;
    private final double DISCWT = 0.15;
    private final double MIDWT = 0.15;
    private final double THESISWT = 0.30;
    private double grade;
    private double finalGrade;
    
    public Grad(){
        
    }
    
    public void weightedGrade(){
        studentGrades();
        double faAvg = (getAssignAvg()) * ASSIGNWT;
        double fdAvg = (getDiscAvg()) * DISCWT;
        double fmAvg = (getMidAvg()) * MIDWT;
        grade = faAvg + fdAvg + fmAvg;
    }
    public void FinalGrade(double t, String i){
        double ftAvg = t * THESISWT;
        grade = grade + ftAvg;
        double newGrade;
        if(i.equalsIgnoreCase("Y")){
            newGrade = grade + 1;
        } else {
            newGrade = grade;
        }
        setFinalGrade(newGrade);
    }
    public void setFinalGrade(double f){
        finalGrade = f;
    }
    public double getFinalGrade (){
        return finalGrade;
    }
}

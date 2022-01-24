public class Grades extends Student {
    private double grade;
    private double finalGrade;

    public void WeightGrade() {
        studentGrades();
        grade = (getAverage());
    }

    public void FinalGrade(String input) {
        double newGrade;
            newGrade = grade;
            setFinalGrade(newGrade);
    }

    public void GPA() {
        if(getAverage() >= 96) {
            System.out.println("Your GPA is 4.0 | Excellent!");
        } else if(getAverage() >= 94 && getAverage() <= 95.99) {
            System.out.println("Your GPA is 1.25 | Superior!");
        } else if (getAverage() >= 91 && getAverage() <= 93.99) {
            System.out.println("Your GPA is 1.5 | Very Good!");
        } else if (getAverage() >= 89 && getAverage() <= 90.99) {
            System.out.println("Your GPA is 1.75 | Good!");
        } else if (getAverage() >= 86 && getAverage() <= 88.99) {
            System.out.println("Your GPA is 2.0 | Very Satisfactory!");
        } else if (getAverage() >= 83 && getAverage() <= 85.99) {
            System.out.println("Your GPA is 2.25 | High Average!");
        } else if (getAverage() >= 80 && getAverage() <= 82.99) {
            System.out.println("Your GPA is 2.5 | Average!");
        } else if (getAverage () >= 77 && getAverage() <= 79.99) {
            System.out.println("Your GPA is 2.75 | Fair");
        } else if (getAverage() >= 75 && getAverage() <= 76.99) {
            System.out.println("Your GPA is 3.0 | Pass");
        } else if (getAverage() >= 70 && getAverage() <= 74.99) {
            System.out.println("Your GPA is 4.0 | Conditional");
        } else if (getAverage() >= 60 && getAverage() <= 69.99) {
            System.out.println("Your GPA is 5.0 | Failing");
        } else {
            System.out.println("Your either Failed due to Absences, Incomplete, or Dropped");
        }
    }

    public void setFinalGrade(double f) {
        finalGrade = f;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

}

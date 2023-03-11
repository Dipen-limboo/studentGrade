
package studentgradecalculator;


public class GradeMain {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("Here each quiz are converted into 10 10 %, midterm in 30% and final term in 50%");
        //Creating an object of class StudentRecord
        StudentRecord student=new StudentRecord();
        student.getStudentInputs();
    }
    
}

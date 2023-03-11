
package studentgradecalculator;

import java.util.Scanner;

public class StudentRecord {

    String name;
    double quiz1Points, quiz2Points, midTermPoints, finalTermPoints;

    float totalWeightedPoints, mp, fp;
    String grade;

    //InputMethod
    public void getStudentInputs() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Student Name: ");
        name = input.nextLine();

        System.out.println("Enter details for " + name);
        do {            
            if(quiz1Points>10  || quiz1Points < 0)
            {
                System.out.print("Entered points is Out of Range. ");            
            }            
            System.out.print("Quiz 1 Points (Out of 10): ");
            quiz1Points = input.nextFloat();
        } while (quiz1Points > 10 || quiz1Points < 0);
        
        do {            
            if(quiz2Points>10  || quiz2Points < 0)
            {
                System.out.print("Entered points is Out of Range. ");            
            }            
            System.out.print("Quiz 2 Points (Out of 10): ");
            quiz2Points = input.nextFloat();
        } while (quiz2Points > 10 || quiz2Points < 0);
        
        do {            
            if(midTermPoints>100  || midTermPoints < 0)
            {
                System.out.print("Entered points is Out of Range. ");            
            }            
            System.out.print("MidTerm Points (Out of 100): ");
            midTermPoints = input.nextFloat();
        } while (midTermPoints > 100 || midTermPoints < 0);
        
        do {            
            if(finalTermPoints>100  || finalTermPoints < 0)
            {
                System.out.print("Entered points is Out of Range. ");            
            }            
            System.out.print("Final Term Points (Out of 100): ");
            finalTermPoints = input.nextFloat();
        } while (finalTermPoints > 100 || finalTermPoints < 0);
        convert();
    }
    
    public void convert(){
        mp = (float) (midTermPoints *30 /100);
        fp = (float) (finalTermPoints * 50 / 100);
        calculateGrade();
    }
    
    
    public void calculateGrade(){
        // calculateAverageScore();
        totalWeightedPoints =(float) (quiz1Points + quiz2Points + mp + fp);
        System.out.println("Weighted Points: " + totalWeightedPoints);
        System.out.print("Grade: ");
        if (totalWeightedPoints >= 90) {
            System.out.println("'A'");

        } else if (totalWeightedPoints >= 80) {
            System.out.println("'B'");

        } else if (70 <= totalWeightedPoints) {
            System.out.println("'C'");

        } else if (60 <= totalWeightedPoints) {
            System.out.println("'D'");

        } else if (totalWeightedPoints < 60) {
            System.out.println("'F'");
        }
    }
    //

}

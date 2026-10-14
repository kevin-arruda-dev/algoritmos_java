/* Question 19: Create an algorithm that reads a student's name and two grades,
calculates their average, and displays it on the screen. At the end,
analyze the average and show whether or not the student had a good 
performance (if it was above the average of 7.0) */ 

import java.util.Scanner;

public class Q19AverageGrade {
    public static void main(String[] args) {
        
        Scanner codeScanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String userName = codeScanner.nextLine();
        System.out.println("Enter your first grade: ");
        double firstGrade = codeScanner.nextDouble();
        System.out.println("Enter your second grade: ");
        double secondGrade = codeScanner.nextDouble();
        
        double averageGrade = (firstGrade + secondGrade) / 2;
        
        if (averageGrade < 7) {
            
            System.out.println("The student failed, they had a score of: " + averageGrade);
            
        } else {
            
            System.out.println("The student has succeeded, they had a score of: " + averageGrade);
            
        }
        
        
        codeScanner.close();
        
    }
}
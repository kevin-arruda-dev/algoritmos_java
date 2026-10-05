/* 5.0 Write a program that reads a student's two grades
in a subject and displays their average in the course.

Example:

Grade 1: 4.5

Grade 2: 8.5

The average of 4.5 and 8.5 is 6.5 */

import java.util.Scanner;

public class Q05AverageGrades {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter the first grade value: ");
        Double firstGradeValue = codeScanner.nextDouble();
        System.out.println("Enter the second grade value: ");
        Double secondGradeValue = codeScanner.nextDouble();

        Double averageGrades = (firstGradeValue + secondGradeValue) / 2;

        System.out.println("Grade 1: " + firstGradeValue);
        System.out.println("Grade 2:  " + secondGradeValue);
        System.out.println("The average of " + firstGradeValue + " and " + secondGradeValue + " is " + averageGrades);

        codeScanner.close();

    }
}


/* Question 27: Create a program that reads two grades from a student
and calculates their average, displaying a message at the end
according to the average achieved:

Average up to 4.9: FAILED
Average between 5.0 and 6.9: RECOVERY
Average 7.0 or higher: PASSED */

import java.util.Scanner;

public class Q27FailedRecoveryPassed {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter the first grade: ");
        double userGrade1 = codeScanner.nextDouble();
        System.out.println("Enter the second grade: ");
        double userGrade2 = codeScanner.nextDouble();

        double userAverage = (userGrade1 + userGrade2) / 2;

        if (userAverage < 5) {

            System.out.println("You have failed!");

        } else if (userAverage >= 5 && userAverage < 7) {

            System.out.println("You are in recovery!");

        } else {

            System.out.println("You passed!");
        }

        codeScanner.close();
    }
}
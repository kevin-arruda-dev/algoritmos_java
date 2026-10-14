/* Question 22: Write a program that reads a young man's year of birth
and displays his military enlistment status.
- If he is under 18, display how many years are left until enlistment.
- If he is over 18, display how many years have passed since enlistment. */

import java.util.Scanner;

public class Q22MilitaryStatus {

    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        // We're considering the actual date as 2026

        System.out.print("Enter your year of birth: ");
        int userBirthYear = codeScanner.nextInt();

        if ((2026 - userBirthYear) < 18) {

            int yearsLeft = 18 - (2026 - userBirthYear);
            System.out.println("You're not able to enlist!");
            System.out.println("You need to wait " + yearsLeft + " years!");

        } else if ((2026 - userBirthYear) == 18) {

            System.out.println("You're exactly 18 years old! You're capable of enlisting");

        } else {

            int yearsPassed = (2026 - userBirthYear) - 18;
            System.out.println("You're able to enlist! " + yearsPassed + " years have passed since you were 18 years old!");
        }

        codeScanner.close();
    }
}
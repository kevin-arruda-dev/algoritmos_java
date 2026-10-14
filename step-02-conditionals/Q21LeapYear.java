/* Question 21: Write an algorithm that reads a given year
and displays whether or not it is a LEAP YEAR */

import java.util.Scanner;

public class Q21LeapYear {

    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int yearInput = codeScanner.nextInt();

        if (yearInput % 4 == 0 && yearInput % 100 != 0 || yearInput % 400 == 0) {

            System.out.println("The year: " + yearInput + " is a leap year!");
        } else {

            System.out.println("The year: " + yearInput + " is not a leap year!");
        }

        codeScanner.close();
    }
}

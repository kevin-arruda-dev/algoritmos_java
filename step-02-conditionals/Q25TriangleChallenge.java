/* Question 25: [CHALLENGE] Create a program that reads the lengths of three line segments.
Analyze their lengths and say whether it is possible to form a triangle with them.
Mathematically, for three segments to form a triangle, the length of each side must
be less than the sum of the other two */

import java.util.Scanner;

public class Q25TriangleChallenge {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter the value of the first segment: ");
        double firstSegment = codeScanner.nextDouble();
        System.out.println("Enter the value of the second segment: ");
        double secondSegment = codeScanner.nextDouble();
        System.out.println("Enter the value of the third segment: ");
        double thirdSegment = codeScanner.nextDouble();

        if (firstSegment <= 0 || secondSegment <= 0 || thirdSegment <= 0) {

            System.out.println("Negative or null values aren't permitted");

        } else if (firstSegment < (secondSegment + thirdSegment) && secondSegment < (firstSegment + thirdSegment) && thirdSegment < (firstSegment + secondSegment)) {

            System.out.println("It's possible to form a triangle with those three values");

        } else {

            System.out.println("It's not possible to form a triangle with those three values");
        }

        codeScanner.close();
    }
}
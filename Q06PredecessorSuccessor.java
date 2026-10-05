/* 6.0 Write a program that reads an integer and
displays its predecessor and successor.

Example:

Enter a number: 9

The predecessor of 9 is 8

The successor of 9 is 10 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q06PredecessorSuccessor {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int userValue = codeScanner.nextInt();

        int valuePredecessor = userValue - 1;
        int valueSuccessor = userValue + 1;

        System.out.println("The predecessor of " + userValue + " is " + valuePredecessor);
        System.out.println("The successor of " + userValue + " is " + valueSuccessor);

        codeScanner.close();

    }
}
/* Question 20: Write a program that
reads an integer and displays whether
it is EVEN or ODD */

import java.util.Scanner;

public class Q20EvenOrOdd {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int userValue = codeScanner.nextInt();

        if (userValue % 2 == 0) {

            System.out.println("The value is even!");

        } else {

            System.out.println("The value is odd!");

        }

        codeScanner.close();

    }

}
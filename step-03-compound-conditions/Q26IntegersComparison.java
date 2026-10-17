/* Question 26: Write an algorithm that reads two integers
and compares them, displaying one of the messages
below on the screen:

The first value is the greater one
The second value is the greater one
There is no greater value, they are both equal */

import java.util.Scanner;

public class Q26IntegersComparison {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter the first value: ");
        int firstInteger = codeScanner.nextInt();
        System.out.println("Enter the second value: ");
        int secondInteger = codeScanner.nextInt();

        if (firstInteger > secondInteger) {

            System.out.println("The first value is the greater one!");

        } else if (secondInteger > firstInteger) {

            System.out.println("The second value is the greater one!");

        } else {

            System.out.println("There is no greater value, they are both equal!");
        }

        codeScanner.close();
    }
}
/* 4.0 Develop an algorithm that reads two integers and displays the sum of them.

Example:

Enter a value: 8
Enter another value: 5
The sum of 8 and 5 is 13 */

import java.util.Scanner;

public class Q04SumIntegers {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int firstValue = codeScanner.nextInt();
        System.out.println("Enter another value: ");
        int secondValue = codeScanner.nextInt();

        int sumNumbers = firstValue + secondValue;

        System.out.println("The sum of " + firstValue + " and " + secondValue + " is " + sumNumbers);

        codeScanner.close();
    }
}

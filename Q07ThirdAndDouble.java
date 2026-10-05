/* 7.0 Create an algorithm that reads a real number
and displays its double and its third part.

Example:

Enter a number: 3.5

The double of 3.5 is 7.0

The third of 3.5 is 1.16666 */

import java.util.Scanner;

public class Q07ThirdAndDouble {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter a value: ");
        double userValue = codeScanner.nextDouble();

        double valueDouble = userValue * 2;
        double valueThird = userValue / 3;

        System.out.println("The double of " + userValue + " is " + valueDouble);
        System.out.println("The third of " + userValue + " is " + valueThird);

        codeScanner.close();

    }
}

/* 11.0 Develop a logic that reads the values of A, B and C
 of a quadratic equation and shows the value of Delta */

import java.util.Scanner;

public class Q11QuadraticEquation {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter the value of A: ");
        double valueA = codeScanner.nextDouble();
        System.out.println("Enter the value of B: ");
        double valueB = codeScanner.nextDouble();
        System.out.println("Enter the value of C: ");
        double valueC = codeScanner.nextDouble();

        double deltaValue = Math.pow(valueB, 2) - (4 * valueA * valueC);

        System.out.println("The value of delta is: " + deltaValue);

        codeScanner.close();

    }
}
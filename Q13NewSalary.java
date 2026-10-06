/* 13.0 Write an algorithm that reads an employee's
salary, calculates and shows their new salary, with a 15% raise */

import java.util.Scanner;

public class Q13NewSalary {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter the original salary: ");
        double originalSalary = codeScanner.nextDouble();

        double newSalary = originalSalary * 1.15;

        System.out.printf("The new salary is $%.2f%n", newSalary);

        codeScanner.close();

    }
}
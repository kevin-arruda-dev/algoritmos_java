/* 15.0 Create a program that reads the number of days
worked in a month and displays an employee's salary,
knowing that they work 8 hours per day and earn $25 per hour worked */

import java.util.Scanner;

public class Q15DaysWorked {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("How many days have you worked? ");
        double daysWorked = codeScanner.nextDouble();

        double valuePerDay = 8 * 25;

        double employeeSalary = daysWorked * valuePerDay;

        System.out.printf("The employee's salary is: %.2f%n", employeeSalary);

        codeScanner.close();

    }
}
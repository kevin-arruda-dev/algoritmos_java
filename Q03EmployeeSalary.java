/* 3.0 Create a program that reads an employee's name and salary,
displaying a message at the end.

Example:

Employee Name: Mary Johnson
Salary: 1850.45
The employee Mary Johnson has a salary of $1850.45 in June */

import java.util.Scanner;

public class Q03EmployeeSalary {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter the name of the employee: ");
        String employeeName = codeScanner.nextLine();

        System.out.println("Enter the salary of the employee: ");
        double employeeSalary = codeScanner.nextDouble();

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
        System.out.println("The employee " + employeeName + " has a salary of " + employeeSalary + " in June");

        codeScanner.close();

    }
}

/* Question 23: In an exclusive promotion for Women's Day, a store wants to give
discounts to everyone, but especially to women. Write a program that reads the
customer's name, sex, and purchase amount, and calculates the discounted price.
Given that:
- Men get a 5% discount
- Women get a 13% discount */

import java.util.Scanner;

public class Q23WomensDay {

    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userName = codeScanner.nextLine();
        System.out.println("Enter your gender (write man or woman): ");
        String userGender = codeScanner.nextLine();
        System.out.println("Enter the total cost of your purchases: ");
        double userPurchasesCost = codeScanner.nextDouble();

        if (userGender.equalsIgnoreCase("man")) {

            double givenDiscountMen = userPurchasesCost * 0.95;
            System.out.println("Name: " + userName);
            System.out.println("Gender: " + userGender);
            System.out.printf("Purchases cost: $%.2f%n", userPurchasesCost);
            System.out.printf("Purchases cost with discount: $%.2f%n", givenDiscountMen);

        } else if (userGender.equalsIgnoreCase("woman")) {

            double givenDiscountWoman = userPurchasesCost * 0.87;
            System.out.println("Name: " + userName);
            System.out.println("Gender: " + userGender);
            System.out.printf("Purchases cost: $%.2f%n", userPurchasesCost);
            System.out.printf("Purchases cost with discount: $%.2f%n", givenDiscountWoman);

        } else {

            System.out.println("Invalid input! Only write \"man\" or \"woman\"!");
        }

        codeScanner.close();
    }
}
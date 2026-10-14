/* 9.0 Write an algorithm that reads how much money a
person has in their wallet (in €) and shows how many dollars they can buy.
Consider US$1.00 = €3.45 */

import java.util.Scanner;

public class Q09DollarsConversion {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("How many euros do you have: ");
        double userMoney = codeScanner.nextDouble();

        double eurosToDollars = userMoney / 3.45;

        System.out.printf("You can buy $%.2f%n", eurosToDollars);

        codeScanner.close();
    }
}

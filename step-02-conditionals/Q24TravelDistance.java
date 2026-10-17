/* Question 24: Write an algorithm that asks for the distance a passenger
wants to travel in km. Calculate the ticket price, charging
$0.50 per km for trips up to 200 km and $0.45 per km for longer trips */

import java.util.Scanner;

public class Q24TravelDistance {

    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.print("Which distance do you wish to travel in km? ");
        double userDistance = codeScanner.nextDouble();

        if (userDistance <= 0) {

            System.out.println("The value is invalid, enter only positive numbers");

        } else if (userDistance <= 200) {

            double chargingCase1 = userDistance * 0.50;
            System.out.printf("The price of the trip will be: $%.2f%n", chargingCase1);

        } else {

            double chargingCase2 = userDistance * 0.45;
            System.out.printf("The price of the trip will be: $%.2f%n", chargingCase2);

        }

        codeScanner.close();
    }

}
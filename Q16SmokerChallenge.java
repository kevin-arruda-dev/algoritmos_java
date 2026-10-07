/* 16.0 [CHALLENGE] Write a program to calculate the reduction in
a smoker's life expectancy. Ask for the number of cigarettes smoked
per day and how many years they have smoked. Consider that a smoker
loses 10 minutes of life for each cigarette. Calculate how many days
of life a smoker will lose and display the total in days */

import java.util.Scanner;

public class Q16SmokerChallenge {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("How many cigarettes do you smoke per day? ");
        int cigarettesPerDay = codeScanner.nextInt();
        System.out.println("How many years have you smoked? ");
        int cigarettesYears = codeScanner.nextInt();

        double minutesLostPerDay = cigarettesPerDay * 10;
        double daysCalculated = cigarettesYears * 365;
        double minutesMultiplied = daysCalculated * minutesLostPerDay;
        double daysLost = minutesMultiplied / 1440;

        System.out.printf("The total of days of life lost is: %.2f%n", daysLost);

        codeScanner.close();

    }
}
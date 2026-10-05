/* 8.0 Develop a program that reads a distance in meters
and displays the equivalent values in other units.

Example:

Enter a distance in meters: 185.72

The distance of 185.72m corresponds to:

0.18572Km

1.8572Hm

18.572Dam

1857.2dm

18572.0cm

185720.0mm */

import java.util.Scanner;

public class Q08DistanceUnits {
   public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter a distance in meters: ");
        Double userValue = codeScanner.nextDouble();

        Double userKm = userValue / 1000;
        Double userHm = userValue / 100;
        Double userDam = userValue / 10;
        Double userDm = userValue * 10;
        Double userCm = userValue * 100;
        Double userMm = userValue * 1000;

        System.out.println("The distance of " + userValue + "m corresponds to: ");
        System.out.println(userKm + "Km");
        System.out.println(userHm + "Hm");
        System.out.println(userDam + "Dam");
        System.out.println(userDm + "dm");
        System.out.println(userCm + "cm");
        System.out.println(userMm + "mm");

        codeScanner.close();

    }
}
/* 10.0 Write an algorithm that reads the width and height of a wall,
calculates and shows the area to be painted and the amount of paint
needed for the job, knowing that each liter of
paint covers an area of 2 square meters. */

import java.util.Scanner;

public class Q10WallPaint {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("What is the width of the wall? ");
        double widthWall = codeScanner.nextDouble();
        System.out.println("What is the height of the wall? ");
        double heightWall = codeScanner.nextDouble();

        double areaWall = widthWall * heightWall;

        double neededPaint = areaWall / 2;

        System.out.printf("The total area of the wall is %.2f square meters%n", areaWall);
        System.out.printf("The necessary amount of paint is %.2f liters%n", neededPaint);

        codeScanner.close();

    }
}

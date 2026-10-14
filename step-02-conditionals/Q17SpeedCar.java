/* Question 17: Write a program that asks for the speed of a car. 
If it exceeds 80 Km/h, display a message saying that 
the user has been fined. In this case, show the amount 
of the fine, charging $5 for each Km/h above the permitted speed */

import java.util.Scanner;

public class Q17SpeedCar {
    public static void main(String[] args) {
        
        Scanner codeScanner = new Scanner(System.in);
        
        System.out.println("Enter the speed of the car: ");
        double carSpeed = codeScanner.nextDouble();
        
        if (carSpeed > 80) {
            double chargeCar = (carSpeed - 80) * 5;
            System.out.println("The car speed is above 80Km/h!");
            System.out.println("The total speed was: " + carSpeed + "Km/h");
            System.out.printf("The fine to be paid is: $%.2f%n", chargeCar);
            
        }
        
        codeScanner.close();
        
    }
}
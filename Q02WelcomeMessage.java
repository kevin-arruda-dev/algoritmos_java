/* 2.0 Write a program that reads a person's name and displays
 a welcome message for them:

Example:

What is your name? John Smith

Hello John Smith, it's a pleasure to meet you! */

import java.util.Scanner;

public class Q02WelcomeMessage {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = codeScanner.nextLine();

        System.out.println("Hello, " + userName + ", it's a pleasure to meet you!");
        
        codeScanner.close();

    }
}

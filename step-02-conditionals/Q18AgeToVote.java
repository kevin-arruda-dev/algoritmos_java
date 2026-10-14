	/* Question 18: Write a program that reads a person's year of birth,
calculates their age, and then shows whether they can vote or not */

import java.util.Scanner;

public class Q18AgeToVote {
    public static void main(String[] args) {
        
        Scanner codeScanner = new Scanner(System.in);
        
        // In this case, we're considering the actual date as 2026
        
        System.out.println("What is your year of birth? ");
        int userBirthYear = codeScanner.nextInt();
        
        int userActualAge = 2026 - userBirthYear;
        
        // Also in this case, we're considering 18 as the possible age to vote
        
        if (userActualAge < 18) {
            
            System.out.println("You're not able to vote!");
            
        } else {
              
            System.out.println("You're able to vote!");
            
        }
        
        codeScanner.close();
        
    }
}
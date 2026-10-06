/* 12.0 Create a program that reads the price of a product,
calculates and shows its PROMOTIONAL PRICE, with a 5% discount */

import java.util.Scanner;
public class Q12PriceDiscount {
    public static void main(String[] args) {

        Scanner codeScanner = new Scanner(System.in);

        System.out.println("Enter the price of the product: ");
        double priceProduct = codeScanner.nextDouble();

        double promotionalPrice = priceProduct * 0.95;

        System.out.printf("The promotional price of the product is $%.2f%n", promotionalPrice);

        codeScanner.close();

    }
}
    /* 14.0  The car rental company needs your help to charge for its services.
    Write a program that asks for the number of kilometers driven by a rented
    car and the number of days it was rented. Calculate the total price to be
    paid, knowing that the car costs $90 per day and $0.20 per kilometer driven */

    import java.util.Scanner;

    public class Q14RentalCompany {
        public static void main(String[] args) {

            Scanner codeScanner = new Scanner(System.in);

            System.out.println("How many kilometers was the car driven? ");
            double carKm = codeScanner.nextDouble();
            System.out.println("How many days was the car rented? ");
            int carDays = codeScanner.nextInt();

            double totalPriceKm = carKm * 0.20;
            double totalPriceDays = carDays * 90;
            double totalPriceGeneral = totalPriceDays + totalPriceKm;

            System.out.printf("The total price to be paid is $%.2f%n", totalPriceGeneral);

            codeScanner.close();

        }
    }

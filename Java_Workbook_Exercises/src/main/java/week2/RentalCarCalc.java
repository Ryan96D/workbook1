package week2;

import java.util.Scanner;

public class RentalCarCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double dailyRate = 29.99;
        final double toll = 3.95;
        final double gps = 2.95;
        final double roadsideAssist = 3.95;
        final double agePriceModify = 0.30;
        final int under25 = 25;

        // Prompt for pickup date
        System.out.print("Enter pickup date (yyyy-MM-dd): ");
        String pickupDate = scanner.nextLine();

        // Prompt for number of rental days
        System.out.print("Enter the number of rental days: ");
        int rentalDays = scanner.nextInt();
        scanner.nextLine();  // Consume leftover enter after .nextint

        // Prompt for extra options
        System.out.print("Do you want an electronic toll tag? ($3.95/day) (yes/no): ");
        String tollTagChoice = scanner.nextLine().trim().toLowerCase();

        System.out.print("Do you want a GPS? ($2.95/day) (yes/no): ");
        String gpsChoice = scanner.nextLine().trim().toLowerCase();

        System.out.print("Do you want roadside assistance? ($3.95/day) (yes/no): ");
        String roadsideChoice = scanner.nextLine().trim().toLowerCase();

        // Prompt for age
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        // Calculate rental cost of days
        double basicRental = dailyRate * rentalDays;

        // Calculate options cost
        double options = 0;
        if (tollTagChoice.equals("yes")||tollTagChoice.equals("y")) {
            options += toll * rentalDays;
        }
        if (gpsChoice.equals("yes")||gpsChoice.equals("y")) {
            options += gps * rentalDays;
        }
        if (roadsideChoice.equals("yes")||roadsideChoice.equals("y")) {
            options += roadsideAssist * rentalDays;
        }

        double underageSurcharge = 0;
        if (age < under25) {
            underageSurcharge = basicRental * agePriceModify;
        }

        // Calculate total cost
        double totalCost = basicRental + options + underageSurcharge;


        System.out.println("\n||| Rental Car Estimate |||");
        System.out.printf("Pickup Date: %s\n", pickupDate);
        System.out.printf("Basic Car Rental: $%.2f\n", basicRental);
        System.out.printf("Options Cost: $%.2f\n", options);
        System.out.printf("Underage Driver Surcharge: $%.2f\n", underageSurcharge);
        System.out.printf("Total Cost: $%.2f\n", totalCost);

        scanner.close();
    }
}

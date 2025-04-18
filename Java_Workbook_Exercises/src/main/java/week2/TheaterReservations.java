package week2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    static Scanner ticketScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to TicketBuyerz terminal!");
        System.out.println("What is your name?");
        String name = ticketScanner.nextLine();

        System.out.println("What date will you be attending? (yyyy-MM-dd");
        String dateString =ticketScanner.nextLine();
        LocalDate dateParsed = LocalDate.parse(dateString);
        DateTimeFormatter MMMMddyyyy = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String dateFormatted = dateParsed.format(MMMMddyyyy);

        System.out.println("How many tickets would you like to purchase?");
        int tickets = ticketScanner.nextInt();

        System.out.println(tickets+" tickets reserved for "+dateFormatted+" under "+name);

    }
}

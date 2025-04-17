package week2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormatter {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Give me a date in yyyy-MM-dd");

        String orgString = reader.nextLine();
        LocalDate orgDate = null;
        try {
            orgDate = LocalDate.parse(orgString);

        }catch (DateTimeException e) {
            System.out.println("Not a valid date");
        }

        System.out.println("How would you like it to be formatted?");
        System.out.println("(1)   Day/Month/Year (dd/MM/yyyy)");
        System.out.println("(2)   Month Day, Year (MMMM dd, yyyy)");
        System.out.println("(3)   Weekday. Month Day Year (EEEE, MMMM dd yyyy)");
        System.out.println("(4)   Year.Month.Day (yyyy.MM.dd)");
        System.out.println("(5)   Scrap that, just get current Date and Time");
        int choice = reader.nextInt();
        reader.nextLine(); // Eats leftover Enter input

        if (choice == 1){
            DateTimeFormatter ddMMyyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String formattedString = orgDate.format(ddMMyyyy);
            System.out.println(formattedString);

        }else if (choice == 2){
            DateTimeFormatter MMMMddyyyy = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
            String formattedString = orgDate.format(MMMMddyyyy);
            System.out.println(formattedString);
        }else if (choice == 3){
            DateTimeFormatter EEEEMMMMddyyyy = DateTimeFormatter.ofPattern("EEEE, MMMM dd yyyy");
            String formattedString = orgDate.format(EEEEMMMMddyyyy);
            System.out.println(formattedString);
        }else if (choice == 4 ){
            DateTimeFormatter yyMMdd = DateTimeFormatter.ofPattern("yyyy.MM.dd");
            String formattedString = orgDate.format(yyMMdd);
            System.out.println(formattedString);

        }else if (choice == 5){
                LocalDateTime timeNow = LocalDateTime.now(); // gets current time
                DateTimeFormatter eEddMMyyyyHHmmss = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String formattedString = timeNow.format(eEddMMyyyyHHmmss);
                System.out.println(formattedString);

        }


    }
}

package week2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Testfile {
    public static void main(String[] args) {
//        String input = "111|Hot Chocolate (12-count)|21|4.99";
//        String[] splittedInput = input.split(Pattern.quote("|")); //splits "input" value by the | and saves as value: "splittedInput"0,1,2,3,4
//        int id = Integer.parseInt(splittedInput[0]);
//        String name = splittedInput[1];
//        int quantity = Integer.parseInt(splittedInput[2]);
//        double price = Double.parseDouble(splittedInput[3]);
//        System.out.println(id+" | "+name+" | "+quantity+" | "+price);
        LocalDate today = LocalDate.now(); //Gets today
        System.out.println("1) "+today);
        LocalDate randomDate = LocalDate.of(2000,1,29); // stores selected date as a value
        System.out.println(randomDate);


        LocalTime timeNow = LocalTime.now(); // gets current time
        System.out.println("2) "+timeNow);
        LocalTime chosenTime = LocalTime.of(22,50);
        System.out.println(chosenTime);

        LocalDateTime currentDatenTime = LocalDateTime.now(); //combines both Date and Time
        System.out.println("3) "+currentDatenTime);
        LocalDateTime ChosenDT = LocalDateTime.of(2012,12, 12 , 12 ,12);
        System.out.println(ChosenDT);


    }
}

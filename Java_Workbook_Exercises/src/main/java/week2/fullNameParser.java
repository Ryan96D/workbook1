package week2;

import java.util.Scanner;

public class fullNameParser {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter your full name");
        System.out.println("Please be wary as to use the appropriate spaces in between words");
        String fullName = reader.nextLine().trim();

        parseName(fullName);
    }




    public static void parseName(String fullName){

        int firstSpaceInput = fullName.indexOf(' ');

        String firstName = "";
        String middleName = "N/A";
        String lastName = "N/A";

        if (firstSpaceInput == -1){
            firstName = fullName;
        }else {
            firstName = fullName.substring(0, firstSpaceInput);

            String remainingName = fullName.substring(firstSpaceInput + 1);
            int secondSpaceInput = remainingName.indexOf(' ');

            if (secondSpaceInput == -1) {
                lastName = remainingName;
            } else {
                middleName = remainingName.substring(0,secondSpaceInput);
                lastName = remainingName.substring(secondSpaceInput+1);
            }
        }
        System.out.println("First Name: "+ firstName);
        System.out.println("Middle Name:"+ middleName);
        System.out.println("Laste Name: "+lastName);


    }
}


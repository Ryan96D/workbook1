package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Apr11_FridayminiExercises {
    public static void main(String[] args) {
        Scanner GameReader = new Scanner(System.in); //Create Scanner named GameReader

//        System.out.print("What is your name Player? ");
//        String Playername = GameReader.nextLine();
//        System.out.println("Hello, " + Playername + "! Welcome to the game.");
//
//        System.out.print("How old are you? ");
//        int Playerage = GameReader.nextInt();
//        int Dogyearage = Playerage * 7;
//        System.out.println("Player age is " + Dogyearage + " in dog years.");
//
//        System.out.println("Dice rolling...");
//        int diceRoll = (int)(Math.random() * 6) + 1; // generates 1 to 6 randomly (Can Reuse at any time)
//        System.out.println("You rolled a " + diceRoll +"!");
//
//        System.out.println("What is your Strength Value?");
//        int Strengthvalue = GameReader.nextInt();
//        System.out.println("What is your Agility Value?");
//        int Agilityvalue = GameReader.nextInt();
//
//        System.out.println("Hero: " + Playername + " | Strength: " + Strengthvalue + " | Agility: " + Agilityvalue + " |");
//
//        System.out.println("What is your current level?");
//        int Playerlevel = GameReader.nextInt();
//        System.out.println("You are currently level " +Playerlevel);
//        System.out.println("XP gained! Level up! You are now level " + (Playerlevel += 1));
//
//        System.out.println("How many Gold coins do you have?");
//        int Goldcoins = GameReader.nextInt();
//        System.out.println("How many Silver coins do you have?");
//        int Silvercoins = GameReader.nextInt();
//        int Totalmoney = (Goldcoins * 10) + Silvercoins;
//        System.out.println("You have " + Totalmoney + " in Niflheim dollars");
//
//        System.out.println("Dice rolling...");
//        int diceRoll1 = (int)(Math.random() * 6) + 1; // generates 1 to 6 randomly (Can Reuse at any time)
//        System.out.println("You rolled a " + diceRoll1 +"!");
//
//        if (diceRoll1 % 2 == 0) {
//            System.out.println("Your dice roll was even");
//        } else {
//            System.out.println("Your dice roll was odd");
//        }
//
//        // Start the loop to keep asking for valid input
//        while (true) {
//            System.out.println("What is your Luck Stat? (0-100)");
//            int Luckstat = GameReader.nextInt();  // Luckstat is reset every time the program runs
//
//            if (Luckstat < 0 || Luckstat > 100) {
//                System.out.println("Invalid input, please choose a value between 0-100");
//            } else if (Luckstat > 50) {  // If Luckstat is more than 50, Critical hit
//                System.out.println("You landed a critical hit!");
//                break;  // Exit the loop once we have a valid Luckstat
//            } else {  // If Luckstat is less than or equal to 50, Normal hit
//                System.out.println("Normal hit landed");
//                break;  // Exit the loop once we have a valid Luckstat
//            }
//        }
//
//
//        while (true) {
//            System.out.println("What character class are you?");
//            System.out.println("Choose between Warrior, Mage, Cleric, Assassin, and Archer");
//
//            String Characterclass = GameReader.nextLine();
//
//            if (Characterclass.equalsIgnoreCase("warrior")) {
//                System.out.println("Your starting weapon is: Steel Sword");
//                break;  // Exit the loop after valid input
//            } else if (Characterclass.equalsIgnoreCase("mage")) {
//                System.out.println("Your starting weapon is: Magic Staff");
//                break;  // Exit the loop after valid input
//            } else if (Characterclass.equalsIgnoreCase("cleric")) {
//                System.out.println("Your starting weapon is: Blessed Mace");
//                break;  // Exit the loop after valid input
//            } else if (Characterclass.equalsIgnoreCase("assassin")) {
//                System.out.println("Your starting weapon is: Steel Dagger");
//                break;  // Exit the loop after valid input
//            } else if (Characterclass.equalsIgnoreCase("archer")) {
//                System.out.println("Your starting weapon is: Wooden Bow");
//                break;  // Exit the loop after valid input
//            } else {
//                System.out.println("Invalid class, Please choose a valid one");
//            }
//        }
//
//
//        int Secretnumber = 68; //Hardcoded Secret Number
//
//        System.out.println("Guess a number (Hint: it is between 1-100)"); //Ask player to guess
//        int Playerguess = GameReader.nextInt(); //Set guess as value "Playerguess"
//
//        if (Playerguess == Secretnumber) {
//            System.out.println("Congratulations! You guessed correctly!");
//            System.out.println("You get an imaginary cookie!");
//        } else {
//            System.out.println("Sorry! Wrong guess! You now explode!");
//        }
//        System.out.println("How fast are you going?");
//        int Speed = GameReader.nextInt();
//
//        if (Speed > 100) {
//            System.out.println("You are going too fast!!! Slow down!");
//        } else if (Speed < 20) {
//            System.out.println("You are too slow! You need to speed up!");
//        } else {
//            System.out.println("Perfectly in the allowed speed range");
//        }

        System.out.println("Choose Rock, Paper, or Scissors");
        String RPSchoice = GameReader.nextLine().toLowerCase();

        // Generate the computer's choice (random number 1-3)
        int CpuRPSnum = (int)(Math.random() * 3) + 1;


        // Convert choice number to words
        String CPUrpsChoice = "PlaceholderStringValue"; // Sets as value to be changed later
        if (CpuRPSnum == 1) {
            CPUrpsChoice =  "rock";
        } else if (CpuRPSnum == 2) {
            CPUrpsChoice = "paper";
        } else { // Scissors is only choice left, so no need to set and if statements
            CPUrpsChoice = "scissors";
        }
        System.out.println("CPU chose: " + CPUrpsChoice);

        if (RPSchoice.equals(CPUrpsChoice)) {
            System.out.println("It's a tie!!!");
        } else if ((RPSchoice.equals("rock") && CPUrpsChoice.equals("scissors")) ||
                (RPSchoice.equals("scissors") && CPUrpsChoice.equals("paper")) ||
                (RPSchoice.equals("paper") && CPUrpsChoice.equals("rock"))) {
            System.out.println("You win! Congrats!");
        } else {
            System.out.println("Computer wins! :P ");
        }




    }
}

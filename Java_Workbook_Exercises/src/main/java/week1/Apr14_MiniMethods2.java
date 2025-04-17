package week1;

import java.util.Scanner;

public class Apr14_MiniMethods2 {
    public static void main(String[] args) {
        Scanner gamereader = new Scanner(System.in); // Add a scanner
        System.out.print("What is your name?");
        String playername = gamereader.nextLine(); //Ask for value playername
        printplayername(playername);

        System.out.println("How much xp do you have?");
        int xp = gamereader.nextInt();
        gamereader.nextLine();
        xp = doubleXP(xp);
        System.out.println("You now have "+xp+" Xp!!!");


        int thresholdxp = 100;
        if (hasLeveledUp(xp, thresholdxp)) {
            System.out.println("You leveled up!");
        } else {
            System.out.println("Keep grinding...");
        }

    }

    public static String printplayername(String playername) {
        System.out.println("Player joined: " + playername);
        System.out.print("Welcome Princess " +playername);

        return playername;
    }

    public static int doubleXP(int xp) {
        System.out.println("You doubled your Xp!!!");
        return xp * 2;
    }
    public static boolean hasLeveledUp(int currentXP, int threshold) {
        if (currentXP >= threshold) {
            currentXP -= threshold;  // Subtract the threshold from currentXP
            return true;
        } else {
            return false;

        }
    }

}


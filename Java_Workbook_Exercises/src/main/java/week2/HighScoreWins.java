package week2;

import java.util.Scanner;

public class HighScoreWins {
    static Scanner scoreScan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your game score in this format:");
        System.out.println("Team1 : Team2 | Score1 : Score2");
        String gameScore = scoreScan.nextLine().trim();
        String[] splitGameScore = gameScore.split("[:|]");
        String team1 = splitGameScore[0].trim();
        String team2 = splitGameScore[1].trim();
        int score1 = Integer.parseInt(splitGameScore[2].trim());
        int score2 = Integer.parseInt(splitGameScore[3].trim());

        if (score1 > score2){
            System.out.println("Winner : "+team1);
        } else if (score1 == score2){
            System.out.println("It's a tie!");
        }else {
            System.out.println("Winner : "+team2);
        }



    }
}

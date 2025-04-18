package week2;

import java.util.Scanner;

public class ComplimentNegator {
    static Scanner stringScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Give me a sentence with a \"bad\" word in there"); //Exercise 18: I CALL THIS MY GREATEST WORK!!! THE COMPLIMENT NEGATING MACHINE!!!
        String uncensoredSentence = stringScanner.nextLine();
        String censor = "***";
        String badWords = ("cool|nice|kind|generous|smart|gorgeous|sweet|worker|cute|beautiful|lovely|dreamy|handsome|pretty");
        String censoredSentence = uncensoredSentence.toLowerCase().replaceAll(badWords,censor);
        System.out.println("Your original sentence: "+uncensoredSentence);
        System.out.println("Your censored sentence: "+censoredSentence);




    }
}

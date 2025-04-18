package week2;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class ComplimentNavigator {
    static Scanner stringScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Give me a sentence with a \"compliment\"");
        String uncensoredSentence = stringScanner.nextLine();
        String censor = "***";
        String badWords = ("cool|nice|kind|generous|smart|gorgeous|sweet|worker|cute|beautiful|lovely|dreamy|handsome|genuine|gentleman|pretty");
        String censoredSentence = uncensoredSentence.toLowerCase().replaceAll(badWords,censor);
        System.out.println("Your original sentence: "+uncensoredSentence);
        System.out.println("Your censored sentence: "+censoredSentence);



    }




}

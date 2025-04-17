package week2;

import java.util.Scanner;

public class StringAnalyzer {
    static Scanner analyzer = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Input a Sentence NOW!!!! >:)");
        String sentence = analyzer.nextLine();
        int senLength = sentence.length();
        String[] words = sentence.trim().split("\\s+");
        int wordsCount = words.length;
        char firstCHar = sentence.trim().charAt(0);
        char lastChar = sentence.trim().charAt(sentence.length()-1);
        System.out.println("Your sentence has "+senLength+" characters and "+wordsCount+" words, it's first letter is: "+firstCHar+" and it's last letter is: "+lastChar);


    }
}

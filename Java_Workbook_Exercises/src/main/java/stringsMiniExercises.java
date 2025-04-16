import java.util.Scanner;

public class stringsMiniExercises {
    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("What is your name?"); //1
//        String name = stringScanner.nextLine();
//
//        int nameLength = name.length();
//        System.out.println("Your name has: "+nameLength+" characters in it."); //2
//
//        System.out.println("Give me a random word of your choice"); //3
//        String word = stringScanner.nextLine();
//
//        char firstLetter = word.charAt(0); //4
//        char lastLetter = word.charAt(word.length()-1); // can put into method if need to use a lot
//        System.out.println("Your word's first character is: "+firstLetter+" and it's last is: "+lastLetter);
//
//        System.out.println("Type in a random sentence"); //5
//        String sentence = stringScanner.nextLine();
//        doesSentenceContainJava(sentence);
//
//        System.out.println("Give me 2 different inputs:"); //6
//        String input1 = stringScanner.nextLine();
//        String input2 = stringScanner.nextLine();
//        compareSentence(input1,input2);
//
//        System.out.println("Give me a random word"); //7
//        String word2 = stringScanner.nextLine();
//        doesITStartWithAandZ(word2);
//
//        System.out.println("Give me a word");  //8
//        String word3 = stringScanner.nextLine().toLowerCase();
//        System.out.println("Give me another word");
//        String word4 = stringScanner.nextLine().toLowerCase();
//        int resultCompared = word3.compareTo(word4);
//        wordCompare(resultCompared);

        System.out.println("Give me a String/Sentence");
        String sentence2 = stringScanner.nextLine();
        int vowels = sentence2.indexOf("a");

    }

    public static void doesSentenceContainJava(String sentence){
        if (sentence.toLowerCase().contains("java")) {
            System.out.println("The sentence contains the word 'Java'.");
        } else {
            System.out.println("The sentence does NOT contain the word 'Java'.");
        }
    }

    public static void compareSentence(String input1, String input2){
        if (input1.equalsIgnoreCase(input2)){
            System.out.println("The two strings are the same");
        } else {
            System.out.println("The two strings are different");
        }
    }
    public static void doesITStartWithAandZ(String word2){
        if (word2.toLowerCase().charAt(0) == 'a'){
            System.out.println("The word starts with \"A\"");

        }else {
            System.out.println("The word does not start with \"A\"");
        }

        if (word2.toLowerCase().charAt(word2.length()-1) == 'z') {
            System.out.println("The word ends with \"z\"");
        }else {
            System.out.println("The word does not end with \"z\"");
        }

    }public static void wordCompare(int resultCompared){
        if (resultCompared < 0){
            System.out.println("The first word comes before the second word alphabetically");
        }else if (resultCompared == 0){
            System.out.println("They are the same words");
        }else {
            System.out.println("The first word comes after the second word alphabetically");
        }

    }

}

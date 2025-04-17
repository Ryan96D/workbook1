package week2;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class stringsMiniExercises {
    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your name?"); //1
        String name = stringScanner.nextLine();

        int nameLength = name.length();
        System.out.println("Your name has: "+nameLength+" characters in it."); //2

        System.out.println("Give me a random word of your choice"); //3
        String word = stringScanner.nextLine();

        char firstLetter = word.charAt(0); //4
        char lastLetter = word.charAt(word.length()-1); // can put into method if need to use a lot
        System.out.println("Your word's first character is: "+firstLetter+" and it's last is: "+lastLetter);

        System.out.println("Type in a random sentence"); //5
        String sentence = stringScanner.nextLine();
        doesSentenceContainJava(sentence);

        System.out.println("Give me 2 different inputs:"); //6
        String input1 = stringScanner.nextLine();
        String input2 = stringScanner.nextLine();
        compareSentence(input1,input2);

        System.out.println("Give me a random word"); //7
        String word2 = stringScanner.nextLine();
        doesITStartWithAandZ(word2);

        System.out.println("Give me a word");  //8
        String word3 = stringScanner.nextLine().toLowerCase();
        System.out.println("Give me another word");
        String word4 = stringScanner.nextLine().toLowerCase();
        int resultCompared = word3.compareTo(word4);
        wordCompare(resultCompared);

        System.out.println("Give me a Sentence"); //9
        String sentence2 = stringScanner.nextLine();
        int sentence2Length = sentence2.length();
        System.out.println("Your sentence has " + vowelsCounted(sentence2, sentence2Length) + " vowels");

        System.out.println("Give me a sentence you want reversed"); //10
        StringBuilder flexyString = new StringBuilder(stringScanner.nextLine()); //make a new object StringBuilder and call it "flexyString" and take input to put inside it
        System.out.println(flexyString.reverse()); // reverse the previous input

        System.out.println("Give me a number"); //11
        int convertedInteger = Integer.parseInt(stringScanner.nextLine());
        System.out.println("Your number times 2 is: "+convertedInteger*2);

        try { // using above example in a try catch method (exercise 12)
            System.out.println("Give me a String........ hehe >:)");
            int convertedInteger2 = Integer.parseInt(stringScanner.nextLine());
            System.out.println("Your number times 2 is: "+convertedInteger2*2);

        }catch (NumberFormatException error1){
            System.out.println("Error: "+error1);
        }
        System.out.println("Enter a date in the format YYYY-MM-DD:"); //13 (with extra month)
        String dateString = stringScanner.nextLine();
        LocalDate selectedDate = LocalDate.parse(dateString);
        System.out.println("You selected: " + selectedDate);
        int day1 = selectedDate.getDayOfMonth();
        Month month1 = selectedDate.getMonth();
        String daySuffix = getdaySuffix(day1);
        System.out.println("The day of your date is the " + day1 + daySuffix + " of " + month1);

        System.out.println("Give me a word"); //14
        String word5 = stringScanner.nextLine();
        stringReverse(word5);         //Exercise 15 is the fullnameParser, refer to that file for exercise 15



        System.out.println("What is your name?"); //16
        String name1 = stringScanner.nextLine();
        System.out.println("Hello Mr/Ms."+name1);

        System.out.println("Give me a lowercase word/name"); //17
        String lowerWordorName = stringScanner.nextLine();
        upperCased(lowerWordorName);


        System.out.println("Give me a sentence with a \"bad\" word in there"); //Exercise 18: I CALL THIS MY GREATEST WORK!!! THE COMPLIMENT NEGATING MACHINE!!!
        String uncensoredSentence = stringScanner.nextLine();
        String censor = "***";
        String badWords = ("cool|nice|kind|generous|smart|gorgeous|sweet|worker|cute|beautiful|lovely|dreamy|handsome|pretty");
        String censoredSentence = uncensoredSentence.toLowerCase().replaceAll(badWords,censor);
        System.out.println("Your original sentence: "+uncensoredSentence);
        System.out.println("Your censored sentence: "+censoredSentence);

        System.out.println("Gimme yo email!! ლ(́◉◞w◟◉‵ლ) "); //19
        String email = stringScanner.nextLine();
        emailCheck(email);

        System.out.println("Give me some words"); //20
        String word6 =stringScanner.nextLine();
        System.out.println("Give me some more words");
        String word7 =stringScanner.nextLine();
        System.out.println("MORE!!! GIMME MORE NOWW!!!!");
        String word8 =stringScanner.nextLine();
        StringBuilder concatSentence = new StringBuilder(word6+" "+word7+" "+word8);
        System.out.println(concatSentence);



    }


    public static void doesSentenceContainJava(String sentence) {
        if (sentence.toLowerCase().contains("java")) {
            System.out.println("The sentence contains the word 'Java'.");
        } else {
            System.out.println("The sentence does NOT contain the word 'Java'.");
        }
    }

    public static void compareSentence(String input1, String input2) {
        if (input1.equalsIgnoreCase(input2)) {
            System.out.println("The two strings are the same");
        } else {
            System.out.println("The two strings are different");
        }
    }

    public static void doesITStartWithAandZ(String word2) {
        if (word2.toLowerCase().charAt(0) == 'a') {
            System.out.println("The word starts with \"A\"");

        } else {
            System.out.println("The word does not start with \"A\"");
        }

        if (word2.toLowerCase().charAt(word2.length() - 1) == 'z') {
            System.out.println("The word ends with \"z\"");
        } else {
            System.out.println("The word does not end with \"z\"");
        }

    }

    public static void wordCompare(int resultCompared) {
        if (resultCompared < 0) {
            System.out.println("The first word comes before the second word alphabetically");
        } else if (resultCompared == 0) {
            System.out.println("They are the same words");
        } else {
            System.out.println("The first word comes after the second word alphabetically");
        }

    }

    public static int vowelsCounted(String sentence2, int sentence2Length) {
        sentence2 = sentence2.toLowerCase();
        int vowelcount = 0;
        for (int index = 0; index < sentence2Length; index++) {
            char currentLetter = sentence2.charAt(index);
            if (currentLetter == 'a' || currentLetter == 'e' || currentLetter == 'i' || currentLetter == 'o' || currentLetter == 'u') {
                vowelcount++;
            }
        }
        return vowelcount;
    }
    public static String getdaySuffix(int day){
        if (day == 11 || day == 12 || day == 13){
            return "th";
        }else if (day % 10 == 1){
            return "st";
        }else if (day % 10 == 2){
            return "nd";
        }else if (day % 10 == 3){
            return "rd";
        }else {
            return "th";
        }
    }
    public static void stringReverse(String pickedString){
        StringBuilder sb = new StringBuilder(pickedString); //make a new object StringBuilder and call it "reversedString"
        String reversedString = sb.reverse().toString();
        if (pickedString.equals(reversedString)){
            System.out.println("٩(◕‿◕)۶٩(◕‿◕)۶٩(◕‿◕)۶  It's a palindrome!!!   ٩(◕‿◕)۶٩(◕‿◕)۶٩(◕‿◕)۶");
        }else {
            System.out.println("It's not a palindrome... </3");
        }

    }

    public static void upperCased(String lowerWordorName){
        char firstChar = lowerWordorName.charAt(0);
        char upperChar = Character.toUpperCase(firstChar);
        String restofWord = lowerWordorName.substring(1);
        System.out.println("Capitalized: "+upperChar+restofWord);
    }

    public static void emailCheck(String email){
        if (email.contains("@") && email.endsWith(".com")){
            System.out.println("This is a valid email address");
        }else {
            System.out.println("This ain't no email son!! Go eat some soap!! 凸(⊙▂⊙✖ ) ");
        }
    }
}

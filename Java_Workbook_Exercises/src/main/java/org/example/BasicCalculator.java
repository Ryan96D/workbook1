package org.example;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // create scanner
        Scanner BcalcReader = new Scanner(System.in);

        // First prompt/question print (For readability)
        System.out.println("Enter first number:");

        // 1st "double" input read using (Scanner name).nextDouble()
        double input1 = BcalcReader.nextDouble();


        // Second prompt/question print (For readability)
        System.out.println("Enter second number:");

        // 2nd "double" input read using (Scanner name).nextDouble()
        double input2 = BcalcReader.nextDouble();

        BcalcReader.nextLine(); // This line is used to consume the newline character after the user enters the second number.
        // After reading a number, nextDouble() leaves a newline character in the input buffer,
        // which would cause issues when reading a subsequent line of text (like the operation string).
        // This line ensures that the next input call works correctly by clearing the leftover newline character.
        // ^^^Above explanation split up for readability^^^


        // This part asks the user what operation they want to perform (add, subtract, multiply, or divide) and prints the question to the console.
        System.out.println("I can only multiply, do you want to proceed?");

        String wordinput1 = BcalcReader.nextLine();  // To make sure no hiccups happen (consume newline character)
        System.out.println("You've chosen " + wordinput1 + ". Regardless, I will multiply :P");

        // multiply
        double result1 = input1 * input2;
        System.out.println("Result: " + result1);
    }
}
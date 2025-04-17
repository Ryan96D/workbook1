package week2;

import java.util.Scanner;

public class TipCalculator {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("How much is the bill?");
        double bill = scan.nextDouble();
        System.out.println("How much % tip do you want to give?");
        double tipPercent = scan.nextDouble() / 100;
        double totalTip = bill * tipPercent;
        System.out.println("Your tip amount is: $"+String.format("%.2f",totalTip));
        double totalBill = totalTip + bill;
        System.out.println("Your total bill is $"+String.format("%.2f",totalBill));
        scan.nextLine();
        if (tipPercent < 0.10){
            System.out.println("Cheapskate alert!!! ");
        }

        System.out.println("Would you like to split the bill?");
        String answer = scan.nextLine().toLowerCase();

        if (answer.equals("yes") || answer.equals('y')) {

            System.out.println("How many people would you like to split between?");
            int ppl = scan.nextInt();
            System.out.println("Your individual totals are: $"+(totalBill/ppl));

        }else if (answer.equals("no") || answer.equals('n')) {
            System.out.println("Thank you for dining!");

        }else {
            System.out.println("I do not understand gibberish, but thank you for dining!");
        }

    }
}

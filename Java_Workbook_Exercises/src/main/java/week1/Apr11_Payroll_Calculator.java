package week1;

import java.util.Scanner;

public class Apr11_Payroll_Calculator {
    public static void main(String[] args) {
        Scanner PayReader = new Scanner(System.in); //Creates scanner named: PayReader

        System.out.print("What is your name?"); //Prints Question
        String Employeename = PayReader.nextLine(); // Reads String input and sets to value "Employeename"

        System.out.print("How many hours have you worked this week?");
        double Hoursworked = PayReader.nextDouble();

        System.out.print("How much is your hourly payrate?");
        double Payratehourly = PayReader.nextDouble();

        double Grosspay;
        if (Hoursworked <= 40) {
            Grosspay = Hoursworked * Payratehourly;
        } else {

            Grosspay = ((Hoursworked - 40) * (Payratehourly * 1.5)) + (Hoursworked * Payratehourly);
        }
        System.out.println("Hello " + (Employeename) + " Your Pay this week is: $" + String.format("%.2f", Grosspay));





    }
}

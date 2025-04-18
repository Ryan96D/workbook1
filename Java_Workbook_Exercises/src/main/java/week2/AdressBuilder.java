package week2;

import java.util.Scanner;

public class AdressBuilder {
    static Scanner inputReader = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("You are purchasing a package!");
        System.out.println("Please provide your full name");
        String name = inputReader.nextLine();

        StringBuilder billingAddress = new StringBuilder();
        StringBuilder shippingAddress = new StringBuilder();


        System.out.println("Please provide your Zipcode for your billing address");
        billingAddress.append("Zipcode: ").append(inputReader.nextLine()).append("\n");
        System.out.println("Please provide your State for your billing address");
        billingAddress.append("State: ").append(inputReader.nextLine()).append("\n");
        System.out.println("Please provide your City for your billing address");
        billingAddress.append("City: ").append(inputReader.nextLine()).append("\n");
        System.out.println("Please provide your Street for your billing address");
        billingAddress.append("Street: ").append(inputReader.nextLine()).append("\n");



        System.out.println("Please provide your Zipcode for your shipping address");
        shippingAddress.append("Zipcode: ").append(inputReader.nextLine()).append("\n");
        System.out.println("Please provide your State for your shipping address");
        shippingAddress.append("State: ").append(inputReader.nextLine()).append("\n");
        System.out.println("Please provide your City for your shipping address");
        shippingAddress.append("City: ").append(inputReader.nextLine()).append("\n");
        System.out.println("Please provide your Street for your shipping address");
        shippingAddress.append("Street: ").append(inputReader.nextLine()).append("\n");

        System.out.println("Name: "+name);
        System.out.println(); // Skips a line just to look neat
        System.out.println("Billing Address:");
        System.out.println(billingAddress);
        System.out.println("Shipping Address:");
        System.out.println(shippingAddress);

        inputReader.close();
        
    }
}

package week1;

import java.util.Scanner;

public class SandwichShop {
   static double sandprice = 1.00; //declare value outside the other methods so they can use it.
    static Scanner sandwscan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What size Sandwich would you like? Regular or Large?");
        String sizesandwich = sandwscan.nextLine().toLowerCase(); // Store requested size sandwich
        pricecalc(sizesandwich); // Determine price of the size sandwich

        System.out.println("How old are you?");
        int age = sandwscan.nextInt();
        agecalc(age);

        // Output the price
        System.out.println("The price of your sandwich is: $" +String.format("%.2f", sandprice));
    }



    public static void pricecalc(String sizesandwich){
        if (sizesandwich.equals("regular") || sizesandwich.equals("reg") || sizesandwich.equals("r")) {
            sandprice = 5.45;
        } else if (sizesandwich.equals("large") || sizesandwich.equals("l")) {
            sandprice = 8.95; // Set price for large sandwich
        }
    }

    public static void agecalc(int age) {
        if (age <= 17) {
            sandprice = sandprice * 0.9;
        } else if (age >= 65) {
            sandprice = sandprice * 0.8;
        }
    }
}

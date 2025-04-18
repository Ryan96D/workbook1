package week2;

import java.util.Scanner;

public class OOp2Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car mcqueen = new Car();
        mcqueen.color = "Red";
        mcqueen.price = 250000.95;
        mcqueen.doors = 4;
        mcqueen.material = "Metal";
        mcqueen.isLocked = true;
        mcqueen.seats = 2;
        mcqueen.brand = "Corvette";


        House mansion = new House();
        mansion.color = "Beige";
        mansion.price = 9999999.95;
        mansion.doors = 4;
        mansion.material = "Wood and Brick";
        mansion.isLocked = true;
        mansion.floors = 10;
        mansion.location = "California";

        System.out.println("Pick an option: \n" +
                "(1) House details\n" +
                "(2) House party\n" +
                "(3) Car details\n" +
                "(4) Car revvs engine");
        int choice = scanner.nextInt();

        if (choice == 1){
            mansion.houseParty();

        }else if (choice == 2) {
            mansion.details();

        }else if (choice == 3){
            mcqueen.details();

        }else if (choice == 4){
            mcqueen.vroom();
        }else {
            System.out.println("Not a valid option");
        }


    }
}

package week2;

import java.util.Scanner;

public class TemperatureConverter {
    static Scanner scann = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter 1 or 2");
        System.out.println("(1)  Convert °C to °F and K");
        System.out.println("(2)  Convert °F to °C and K");
        System.out.println("(3)  Convert K to °C and °F");
        double result; //sets empty value to be replaced in the if else
        double result2;//sets empty value to be replaced in the if else
        double kelvin; //sets empty value to be replaced in the if else
        int choice = scann.nextInt();
        scann.nextLine(); //Eats Enter input
        if (choice == 1){
            System.out.println("What is your Celsius?");
            double celsius = scann.nextDouble();
            result = (celsius * 9/5) + 32;
            System.out.println(celsius+" °C converted to °F is: "+result);
            kelvin = celsius +273.15;
            System.out.println(celsius+" °C converted to Kelvin is: "+kelvin+"K");


        }else if (choice ==2){
            System.out.println("What is your Fahrenheit?");
            double fahren = scann.nextDouble();
            result = (fahren - 32) * 5/9;
            System.out.println(fahren+" °F converted to °C is: "+result);
            kelvin = (fahren-32) +273.15;
            System.out.println(fahren+" °F converted to Kelvin is: "+kelvin+"K");

        }else if (choice ==3){
            System.out.println("What is your Kelvin?");
            kelvin = scann.nextDouble();
            result = kelvin - 273.15;
            result2 = (kelvin - 273.15) * 9/5 +32;
            System.out.println(kelvin+"K converted to °C is "+result+"°C");
            System.out.println(kelvin+"K converted to °F is "+result2+"°F");

        }




    }
}

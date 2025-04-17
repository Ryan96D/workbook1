package week2;

import java.util.Scanner;

public class Simple_Calculator {
    static Scanner inputter = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Choose the 1st number of your calculation");
        double num1 = inputter.nextDouble();
        System.out.println("Choose the 2nd number of your calculation");
        double num2 = inputter.nextDouble();
        inputter.nextLine();
        System.out.println("Choose which operator to use: |( + )|( - )|( ÷ )|( x )| ");
        char operator = inputter.nextLine().charAt(0);

        if (operator == '+') {
            System.out.println("Result is: "+addition(num1,num2));

        } else if (operator == '-') {

            System.out.println("Result is: "+subtraction(num1,num2));
        }else if (operator == '*') {

            System.out.println("Result is: "+multiplication(num1,num2));
        } else if (operator == '/') {

            System.out.println("Result is: "+division(num1,num2));
        }else {
            System.out.println("Invalid operator");
        }







    }

    public static double addition(double num1, double num2){
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplication(double num1 , double num2){
        return num1 * num2;
    }

    public static double division(double num1 , double num2){
        return num1 / num2;
    }
}

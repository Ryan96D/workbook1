package org.example;

public class Apr10_Operations_Java {
    public static void main(String[] args) {

        // Java Operations.MD Brightspace Bootcamp
        int A = 9; // Question 1
        double B = 5.5;
        char C = 'z';
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        int D = 7; // Question 2
        int E = 3;
        System.out.print(D);
        System.out.print(" & ");
        System.out.println(E);
        int F = 7 / 2; // Question 3
        System.out.println(F);
        double G = (16 / 2.5); //Question 4 The Data results in a double
        System.out.println(G);
        int Age = 24; // Question 5
        System.out.println("In 10 years I will be " + (Age+10) + ".");
        byte H = 100; // Question 6
        int I = H + 28;
        System.out.println(I);
        double J = 5.7; // Question 7
        int K = (int) J;
        System.out.println("Original Double value \"J\": " + (J));
        System.out.println("Casted value \"J\" into int: " + (K));
        float L = 3.2F; // Question 8
        int l = 6;
        double M = L * l;
        System.out.println("Question 8: " + (M));
        char N = 'r'; // Question 9: It does number associated with letter+1
        System.out.println(N+1); // There is a number associated with each letter
        int a = 9; //Question 10
        int b = 2;
        System.out.println ("int a is 9; int b is 2");
        System.out.println("integer a divided by integer b: " + (a / b));
        System.out.println("integer a modulus integer b: " + (a % b));
        double lbs = 300; //Question 11
        int height = 6;
        System.out.println("BMI (Imperial) = " + (lbs / (height * height)));
        double Kilo = 136;
        double meters = 1.82;
        System.out.println("BMI (metric) = " + (Kilo / (meters * meters)));
        System.out.println("(5.5 + 7.3 + 9.9) / 3 = " + ((5.5 + 7.3 + 9.9) / 3)); // Question 12
        int P = 7;
        System.out.println("Initial value is " + (P)); // Question 13
        P += 3;
        System.out.println("Value " + (7)+  " after += 3 is " + (P));
        P *= 5;
        System.out.println("Value " + (10)+  " after *= 5 is " + (P));
        P /= 2;
        System.out.println("Value " + (50)+  " after /= 2 is " + (P));
        P %= 3;
        System.out.println("Value " + (25)+  " after %= 3 is " + (P));
        P -= 10;
        System.out.println("Value " + (1)+  " after -= 10 is " + (P));
        short Q = 30000;
        int R = (int) (Q *2); //Question 14
        System.out.println(R); // Without type cast, "short" cannot hold a number over 32,767; it will display an arror
        System.out.println("Value " + (Q) + " * 2 = " + (Q * 2)); // Question 14 (Auto Type Cast by JAva)
        double price = 10.99; //Question 15
        int quantity = 5;
        double total_cost = (price * quantity);
        System.out.println(total_cost);
        int total_costs = (int) (price * quantity);
        System.out.println(total_costs); // (After type cast to int, cutting out the decimal)
        int S = 130; // Question 16
        System.out.println((byte) S); // Any byte over 127 goes back to -128 and goes up from there.
        char letter = 'z'; // Question 17
        System.out.println(letter - 2);
        long longnumber = 2000000000; //Question 18
        long result = longnumber + 1000000000;
        System.out.println(result);
        double radius = 4.5; // Question 19
        double area = Math.PI * radius * radius;
        System.out.println(area);
        // Mini Challenge: Time Calculator (Operators & Casting Only)
        int totalMinutes = 350;
        int fullhours = 350 / 60;
        int remainingminutes = 350 % 60;
        System.out.println("Total minutes: " + (totalMinutes));
        System.out.println("This is " + (fullhours) + " hours and " + (remainingminutes) + " minutes");
        double powercostperhour = 2.75;
        System.out.printf("Cost to run oven for %d hours = %.2f euros", fullhours, (fullhours * powercostperhour));
    }
}


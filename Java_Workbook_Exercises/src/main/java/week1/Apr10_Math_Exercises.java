package week1;


public class Apr10_Math_Exercises {
    public static void main(String[] args) {
        int A = -45; // #1
        System.out.println(Math.abs(A));
        double B = 3.5; // #2
        double C = 7.8;
        System.out.println(Math.max(B,C));
        int D = 99; // #3
        int E = 23;
        System.out.println(Math.min(D,E));
        double F = 8.9; // #4
        System.out.println(Math.floor(F)); // floor rounds down ALWAYS no matter if it should round up
        double G = 5.2; // 5
        System.out.println(Math.ceil(G)); // ceil (short for ceiling) rounds up ALWAYS
        double H = 9.6; // #6
        System.out.println(Math.round(H)); // round just rounds normally;
        // Any number 5 and above is rounded up, otherwise rounded down
        double morningTemp = -3.7; // #7
        double afternoonTemp = 12.4;
        System.out.println("Absolute temp diff: " + Math.abs(morningTemp-afternoonTemp));
        System.out.println("Highest temp: "+ (Math.max(morningTemp , afternoonTemp)));
        System.out.println("Lowest temp: " + (Math.min(morningTemp , afternoonTemp)));
        System.out.println("Afternoon temp rounded: " + (Math.round(afternoonTemp)));
        System.out.println("Floored morning temp: " + (Math.floor(morningTemp)));
        // Bonus: Let's level it up!
        double price = 10.876; // #1
        System.out.println("Rounded Price: " + String.format("%.2f",price));
        double Vseconds = 320; // #2
        double Vminutes = (Vseconds / 60);
        System.out.println(Vminutes);
        System.out.println("Minutes rounded up: " + (Math.ceil(Vseconds / 60)));
        double price1 = 3.87; // #3
        System.out.println("No pennies >:D: " + (float)(Math.round(price1 / 0.05) * 0.05));
        double x = 5.9; // #4
        int y = (int)x + 3; // My prediction is "8"
        // Because casting to int doesn't round, it just gets rid of the decimal entirely
        System.out.println(y);
        int z = (int)(x + 3); // My prediction is still "8" because same as above concept
        System.out.println(z);
        int a = 17; // #5
        int b = 42;
        int c = 9;
        System.out.println(Math.max(Math.max(a,b),c));
        System.out.println(Math.min(Math.min(a,b),c));
        double total = 17.23; // #6
        int payed = (int)Math.ceil(total);
        System.out.println("Payed: $" + (payed));
        int I = 150; // #7
        byte J = (byte)I;
        System.out.println(J); // after 127, it goes back to -128, so "I" + -129 (to account for -128 swap)
        double start = -12.8; // #8
        double end = 7.3;
        double absolute = (Math.abs(start-end));
        System.out.println("Absolute distance: " + absolute);
        double roundedup = (Math.ceil(absolute));
        System.out.println("Rounded up: " + roundedup);
        System.out.println("Cast to int: " + (int)roundedup);
    }
}
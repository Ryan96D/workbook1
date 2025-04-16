import java.util.Scanner;

public class fullNameGenerator {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What is your first name?");
        String firstName = reader.nextLine();
        System.out.println("What is your middle name? (Leave empty if no)");
        String middleName = reader.nextLine();
        System.out.println("What is your last name? (Leave empty if no)");
        String lasttName = reader.nextLine();
        System.out.println("What is your suffix? (Leave empty if no)");
        String suffix = reader.nextLine();

        System.out.println("Full Name: "+firstName+" "+middleName+" "+lasttName+", "+suffix);


    }
}

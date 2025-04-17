package week1;

public class Coinflip {
    public static void main(String[] args) {
        int Coinflipped = (int)(Math.random() * 2 +1);

        String Coin= "Placeholder";

        if (Coinflipped == 1) {
            Coin = "Heads";
        } else {
            Coin = "Tails";
        }

        System.out.println("You flipped a " +Coin+ "!!!");

    }
}

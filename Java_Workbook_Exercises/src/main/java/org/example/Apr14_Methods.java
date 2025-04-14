package org.example;

import java.util.Scanner;

public class Apr14_Methods {
    public static void main(String[] args) {
        Scanner Gamereader = new Scanner(System.in); // Add a scanner
        System.out.print("What is your name?");
        String Playername = Gamereader.nextLine(); //Ask for value Playername

        displayPlayerName(Playername); //recalls method

        printWelcome(); //recalls method

        int CurrentLevel = 1;  // Starting level
        printLevel(CurrentLevel); // Print Starting Level (1)
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        CurrentLevel = LevelUp(CurrentLevel); //Add 1 to Level
        printLevelupmsg();
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        printLevel(CurrentLevel); //Print new Level
        delay(1500); // adds a delaye of 1000 milliseconds from the method below


        String target1 = "Goblin";
        String target2 = "Slime";

        attackcommand(Playername,target1);
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        damage(Playername,CurrentLevel);
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        attackcommand(Playername,target2);
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        damage(Playername,CurrentLevel);
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        victoryDance(Playername); //does victory dance (print)
        delay(1500); // adds a delaye of 1000 milliseconds from the method below



        int currentInventorynum = 0; //display 0 in inventory
        String item1 = "Potion";
        String item2 = "gold coin";
        String item3 = "Pizza slice";

        displayInventory(Playername,currentInventorynum); //print new inventory amount
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        foundItem(Playername,item1);
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        currentInventorynum = updateInventory(currentInventorynum); //adds 1 to inventory
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        foundItem(Playername,item2);
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        currentInventorynum = updateInventory(currentInventorynum); //adds 1 to inventory
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        displayInventory(Playername,currentInventorynum); //print new inventory amount
        delay(1500); // adds a delaye of 1000 milliseconds from the method below



        String spell1 = "Fireball";
        String spell2 = "Lightning Shock";
        int costSpell1 = 15;
        int costSpell2 = 10;

        attackcommand(Playername,target1);
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        attackcommand(Playername,target2);
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        castSpell(Playername,spell1,costSpell1);
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        spelldamage(Playername,CurrentLevel);
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        System.out.println(Playername+" hits all enemies with the spell!");
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        attackcommand(Playername,target1);
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        castSpell(Playername,spell2,costSpell2);
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        spelldamage(Playername,CurrentLevel);
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        victoryDance(Playername); //does victory dance (print)
        delay(1500); // adds a delaye of 1000 milliseconds from the method below


        displayInventory(Playername,currentInventorynum); //print new inventory amount
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        foundItem(Playername,item3);
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        currentInventorynum = updateInventory(currentInventorynum); //adds 1 to inventory
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        displayInventory(Playername,currentInventorynum); //print new inventory amount
        delay(1500); // adds a delaye of 1000 milliseconds from the method below

        String dungeon1 = "Super Duper Evil Kaneevil Villain Lair!";
        String dungeon2 = "Totally Not Suspicious Looking Portal!";
        enterDungeon(Playername,dungeon2); //Enter dungeon 2 printed
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        enterDungeon(Playername,dungeon1); //Enter dungeon 1 printed
        delay(1500); // adds a delaye of 1000 milliseconds from the method below

        victoryDance(Playername); //does victory dance (print)


        gameOver(Playername);

    }


    public static void printWelcome() {
        System.out.println("Welcome to Code Quest! (⌐■_■) ");
    }


    public static void displayPlayerName(String Playername) {
        System.out.println("Player joined: " + Playername);

    }

    public static void printLevel(int Level) {
        System.out.println("Level: " +Level);
    }

    public static void printLevelupmsg() {
        System.out.println("You leveled up!");
    }

    public static int LevelUp(int CurrentLevel) {
        return CurrentLevel + 1; //Adds 1 to current Level
    }

    public static void attackcommand(String attacker, String target) {
        System.out.println(attacker + " attacks " + target); //Prints attack command
    }
    public static int damage(String playername, int CurrentLevel) { //Calculated damage random roll
        int damagenum = CurrentLevel + 1 + ((int)(Math.random() * 10) + 1); // randomly rolls (1-10) and adds to Current Level +1
        System.out.println(playername + " deals " + damagenum + " damage!");
        return damagenum;

    }

    public static int spelldamage(String playername, int CurrentLevel) { //Calculated damage random roll
        int damagenum = 2 * (CurrentLevel + 2 + ((int) (Math.random() * 10) + 1)); // randomly rolls (1-10) and adds to Current Level +2 and multiples all by 2
        System.out.println(playername + " deals " + damagenum + " damage!");
        return damagenum;
    }

    public static void foundItem(String playername, String item) {
        char firstLetter = Character.toLowerCase(item.charAt(0)); // Chooses between a or an depending on first char
        String aORan = (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u') // Chooses between a or an depending on first char
                ? "an" : "a";

        System.out.println(playername + " found " + aORan + " " + item + "!");
    }

    public static void castSpell(String playername, String spellName, int manaCost) {
        System.out.println(playername+" uses "+spellName+", costing "+manaCost+" mana!");
    }
    public static void gameOver(String playername) {
        System.out.println(playername+" has perished...");
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        System.out.println("૮(˶ㅠ︿ㅠ)ა ||GAME OVER|| ૮(˶ㅠ︿ㅠ)ა");
    }

    public static int updateInventory( int itemCount){
            return itemCount + 1; //Adds 1 to current item count
    }
    public static void displayInventory(String player, int itemCount){
        System.out.println(player + " has " + itemCount + " items!");
    }

    public static void enterDungeon(String player, String dungeonName){
        System.out.println(player+" bravely enters the "+dungeonName);
    }
    public static void victoryDance(String player){
        System.out.println(player+" has defeated the enemy!");
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        System.out.println(player+" does a victory dance to celebrate the won battle!");
        delay(1500); // adds a delaye of 1000 milliseconds from the method below
        System.out.println("Oh my! ... " +player+" is SUPERRR sturdy!!! (⌐■_■) (⌐■_■) (⌐■_■) ");
    }

    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);  // Adds a delay in milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();  // Handle the interruption exception
        }
    }
}

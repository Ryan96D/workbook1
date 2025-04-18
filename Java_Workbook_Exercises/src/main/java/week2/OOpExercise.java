package week2;

public class OOpExercise {
    public static void main(String[] args) {
        Cat paulo = new Cat();
        paulo.name = "Paulo";
        paulo.type = "Tiger";
        paulo.color = "Orange";
        paulo.gender = "Male";
        paulo.personality = "friendly";
        paulo.weight = 700;
        paulo.age = 19;

        Dog wilmer = new Dog();
        wilmer.name = "Wilmer";
        wilmer.type = "Chihuahua";
        wilmer.color = "Brown";
        wilmer.gender = "Male";
        wilmer.personality = "aggressive";
        wilmer.weight = 50;
        wilmer.age = 8;


        paulo.meow();
        System.out.println();
        wilmer.woof();





    }
}

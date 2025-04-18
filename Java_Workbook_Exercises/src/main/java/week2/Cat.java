package week2;

public class Cat {
    String name ;
    String type;
    String color ;
    String gender ;
    String personality;
    int weight;
    int age;


    public void meow(){
        System.out.printf("This is %s, it's a %s %s %s. %s is very %s. %s is %s years old and weighs %s lbs"
                ,name,gender,color,type,name,personality,name,age,weight); //Values for print f, (split into two lines)
    }
}

package week2;

public class Dog {
    String name = "Mocha";
    String type = "Poodle";
    String color = "White";
    String gender = "Male";
    String personality= "Hyper";
    int weight= 20;
    int age= 8;


    public void woof(){
        System.out.printf("This is %s, it's a %s %s %s. %s is very %s. %s is %s years old and weighs %s lbs"
                ,name,gender,color,type,name,personality,name,age,weight); //Values for printf (Split into 2 lines)


    }
}

